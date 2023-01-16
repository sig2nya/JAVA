package hello.jdbc.exception.basic;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.ConnectException;
import java.sql.SQLException;

@Slf4j
public class UncheckedAppTest {
    @Test
    void checked(){
        CheckedAppTest.Controller controller = new CheckedAppTest.Controller();
        Assertions.assertThatThrownBy(() -> controller.request())
                .isInstanceOf(Exception.class);
    }

    @Test
    void printEx(){
        Controller controller = new Controller();
        try {
            controller.request();
        } catch (Exception e){
            log.info("ex", e);
        }
    }

    static class Controller {
        CheckedAppTest.Service service = new CheckedAppTest.Service();
        public void request() throws SQLException, ConnectException {
            service.logic();
        }

    }

    static class Service{
        CheckedAppTest.Repository repository = new CheckedAppTest.Repository();
        CheckedAppTest.NetworkClient networkClient = new CheckedAppTest.NetworkClient();

        public void logic() throws SQLException, ConnectException{
            repository.call();
            networkClient.call();
        }
    }

    static class NetworkClient{
        public void call(){
            throw new RuntimeConnectionException("연결 실패");
        }
    }

    static class Repository{
        public void call(){
            try {
                runSQL();
            } catch (SQLException e){
                throw new RuntimeSQLException(e);
            }
        }

        private void runSQL() throws SQLException{
            throw new SQLException("ex");
        }
    }

    static class RuntimeConnectionException extends RuntimeException{
        public RuntimeConnectionException(String message){
            super(message);
        }
    }

    static class RuntimeSQLException extends RuntimeException{
        public RuntimeSQLException(){

        }

        public RuntimeSQLException(Throwable cause){
            super(cause);
        }
    }

    
}
