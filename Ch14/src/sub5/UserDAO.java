package sub5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static UserDAO instance = new UserDAO();
    private final String HOST = "jdbc:mysql://127.0.0.1/userdb";
    private final String USER = "root";
    private final String PASS = "1234";
    SQL sql = new SQL();
    private Connection conn = null;
    private Statement stmt = null;
    private PreparedStatement psmt = null;
    private ResultSet rs;
    private UserDAO() {
    }

    public static UserDAO getInstance() {
        return instance;
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(HOST, USER, PASS);
    }

    public void insertUser(User3Vo vo) {
        try {
            conn = getConnection();
            psmt = conn.prepareStatement(SQL.INSERT_SQL);
            psmt.setString(1, vo.getUid());
            psmt.setString(2, vo.getName());
            psmt.setString(3, vo.getHp());
            psmt.setInt(4, vo.getAge());

            psmt.executeUpdate();
            close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public User3Vo selectUser(String id) {
        try {
            User3Vo user = new User3Vo();
            conn = getConnection();
            psmt = conn.prepareStatement(SQL.SELECT_SQL);
            psmt.setString(1, id);
            rs = psmt.executeQuery();
            if(rs.next()) {
                user.setUid(rs.getString(1));
                user.setName(rs.getString(2));
                user.setHp(rs.getString(3));
                user.setAge(rs.getInt(4));
            }
            close();
            return user;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<User3Vo> selectUsers() {
        try {
            List<User3Vo> users = new ArrayList<>();
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL.SELECT_SQLs);
            while (rs.next()) {
                User3Vo vo = new User3Vo();
                vo.setUid(rs.getString(1));
                vo.setName(rs.getString(2));
                vo.setHp(rs.getString(3));
                vo.setAge(rs.getInt(4));
                users.add(vo);
            }
            close();
            return users;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public int updateUser(User3Vo vo) {
        int result=0;
        try {
            conn=getConnection();
            psmt=conn.prepareStatement(SQL.UPDATEALL_SQL);
            psmt.setString(4, vo.getUid());
            psmt.setString(1, vo.getName());
            psmt.setString(2, vo.getHp());
            psmt.setInt(3, vo.getAge());
            psmt.executeUpdate();
            result = psmt.executeUpdate();
            close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return result;

    }

    public int deleteUser(String id) {
        int result;
        try {
            conn=getConnection();
            psmt=conn.prepareStatement(SQL.DELETE_SQL);
            psmt.setString(1,id);
            result = psmt.executeUpdate();
            close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
        if (stmt != null) {
            stmt.close();
        }
        if (rs != null) {
            rs.close();
        }
    }


}
