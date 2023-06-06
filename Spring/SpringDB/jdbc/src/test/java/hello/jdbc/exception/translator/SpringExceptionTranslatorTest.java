package hello.jdbc.exception.translator;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;
import org.springframework.jdbc.support.SQLExceptionTranslator;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static hello.jdbc.connection.ConnectionConst.*;

@Slf4j
public class SpringExceptionTranslatorTest {
    DataSource dataSource;

    @BeforeEach
    void init(){
        dataSource = new DriverManagerDataSource(URL, USERNAME, PASSWORD);
    }

    @Test
    void sqlExceptionErrorCode(){
        String sql = "select bad grammer";
        try{
            Connection con = dataSource.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeQuery();
        } catch (SQLException e){
            Assertions.assertThat(e.getErrorCode()).isEqualTo(42122);
            SQLExceptionTranslator exTranslator = new SQLErrorCodeSQLExceptionTranslator(dataSource);
            DataAccessException resultEx = exTranslator.translate("select", sql, e);
            int errorCode = e.getErrorCode();
            log.info("errorCode = {}", errorCode);
            log.info("error", e);
            Assertions.assertThat(resultEx.getClass()).isEqualTo(BadSqlGrammarException.class);
        }
    }
}