package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTset {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String host = "jdbc:mysql://127.0.0.1/userdb";
        String user = "root";
        String pass = "1234";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, user, pass);
        Statement stmt = conn.createStatement();
        String sql = "DELETE FROM `userdb`.user1 where uid='j101'";
        stmt.executeUpdate(sql);
    }
}
