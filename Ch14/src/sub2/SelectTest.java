package sub2;

import java.sql.*;

public class SelectTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String host = "jdbc:mysql://127.0.0.1/userdb";
        String user = "root";
        String pass = "1234";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, user, pass);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from userdb.user1 ");

        while (rs.next()) {
            String uid = rs.getString(1);
            String name = rs.getString(2);
            String hp = rs.getString(3);
            int age = rs.getInt(4);

            System.out.printf("%s ,%s ,%s ,%d\n", uid, name, hp, age);
        }

        rs.close();
        stmt.close();
        conn.close();

    }
}
