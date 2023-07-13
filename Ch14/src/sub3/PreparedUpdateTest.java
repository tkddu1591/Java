package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedUpdateTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String host = "jdbc:mysql://127.0.0.1/userdb";
        String user = "root";
        String pass = "1234";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, user, pass);
        PreparedStatement psmt = conn.prepareStatement("update userdb.user2 set `hp`=?, `age`=? where uid = ?");
        psmt.setString(1, "010-1234-1111");
        psmt.setInt(2,25);
        psmt.setString(3,"j101");
        psmt.executeUpdate();
        psmt.close();
        conn.close();
    }
}
