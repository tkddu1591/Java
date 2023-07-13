package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDeleteTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String host = "jdbc:mysql://127.0.0.1/userdb";
        String user = "root";
        String pass = "1234";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, user, pass);
        String sql = "DELETE from userdb.user2 where uid=?";
        PreparedStatement psmt = conn.prepareStatement(sql);
        psmt.setString(1,"j101");
        psmt.executeUpdate();
        psmt.close();
        conn.close();
    }
}
