package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTset {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String host ="jdbc:mysql://127.0.0.1/userdb";
        String user = "root";
        String pass = "1234";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, user, pass);
        Statement stmt = conn.createStatement();
        String sql = "update `user1`set";
        sql += "`hp`='010-1234-1111',";
        sql += "`age` = 25";
        sql += " where `uid`='j101'";
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
    }
}
