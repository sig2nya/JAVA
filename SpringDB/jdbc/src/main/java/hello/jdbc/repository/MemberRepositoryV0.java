package hello.jdbc.repository;

import hello.jdbc.connection.DBConnectionUtil;
import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.NoSuchElementException;

@Slf4j
public class MemberRepositoryV0 {
    // JDBC의 DB 연결 순서 : Connection 획득 -> Prepared Statement 준비 -> SQL 수행 -> ResultSet 반납
    public Member save(Member member) throws SQLException {
        String sql = "insert into member(member_id, money) values(?, ?)"; // SQL Injection 공격 예방을 위해 Parameter는 ?로 전달

        Connection con = null;
        PreparedStatement pstmt = null; // PreparedStatement를 통해서, DB에 Data를 CRUD 수행.

        try {
            con = getConnection(); // ConnectionUtil.getConnection(); -> return Connection;
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, member.getMemberId());
            pstmt.setInt(2, member.getMoney());
            pstmt.executeUpdate();
            return member;
        } catch (SQLException e) {
            log.error("DB Error", e);
            throw e;
        } finally {
            close(con, pstmt, null);
        }
    }

    private void close(Connection con, Statement stmt, ResultSet rs) {
        // 자원 반납은 사용의 역순 : save 메서드에서, Connection -> PreparedStatement -> ResultSet(실체 호출하진 않음) 순으로 사용하였다.
        // 자원 반납은 반드시!!!!! 해주어야 한다. -> 성능 Issue가 발생할 수 있음. (리소스 부족 혹은 누수 발생)
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e){
                log.info("Error", e);
            }
        }

        if(stmt != null){
            try{
                stmt.close();
            } catch (SQLException e){
                log.info("Error", e);
            }
        }

        if(con != null){
            try{
                con.close();
            } catch (SQLException e){
                log.info("Error", e);
            }
        }
    }

    public Member findById(String memberId) throws SQLException{
        String sql = "select * from member where member_id = ?";

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, memberId);

            rs = pstmt.executeQuery();

            if(rs.next()){
                Member member = new Member();
                member.setMemberId(rs.getString("member_id"));
                member.setMoney(rs.getInt("money"));
                return member;
            } else {
                throw new NoSuchElementException("Member not found memberId=" + memberId);
            }
        } catch (SQLException e){
            log.error("DB Error", e);
            throw e;
        } finally {
            close(con, pstmt, rs);
        }
    }

    public void update(String memberId, int money) throws SQLException{
        String sql = "update member set money=? where member_id=?";

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, money);
            pstmt.setString(2, memberId);
            int resultSize = pstmt.executeUpdate();
            log.info("resultSize={}", resultSize);
        } catch (SQLException e){
            log.error("DB Error", e);
            throw e;
        } finally {
            close(con, pstmt, null);
        }
    }

    public void delete(String memberId) throws SQLException{
        String sql = "delete from member where member_id=?";

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, memberId);

            pstmt.executeUpdate();
        } catch (SQLException e){
            log.error("DB Error", e);
            throw e;
        } finally {
            close(con, pstmt, null);
        }
    }
    private Connection getConnection(){
        return DBConnectionUtil.getConnection();
    }
}
