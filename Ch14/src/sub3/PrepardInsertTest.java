package sub3;

import java.sql.*;

/*
* 날짜 : 2023/07/11
* 이름 : 김상엽
* 내용 : PreparedStatement 실습하기
* */
public class PrepardInsertTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String host = "jdbc:mysql://127.0.0.1/userdb";
        String user = "root";
        String pass = "1234";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host,user,pass);
        String sql = "INSERT into userdb.user2 values (?,?,?,?)";
        PreparedStatement psmt = conn.prepareStatement(sql);
        psmt.setString(1,"j101");
        psmt.setString(2,"홍길동");
        psmt.setString(3,"010-1234-1001");
        psmt.setInt(4,23);
        psmt.executeUpdate();

        psmt.close();
        conn.close();

    }
}
