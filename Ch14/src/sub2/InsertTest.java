package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTest {
    public static void main(String[] args) {
        String host = "jdbc:mysql://127.0.0.1/userdb";
        String user = "root";
        String pass = "1234";

        try {
            //1단계 - JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2단계 - 데이터 베이스 접속
            Connection conn = DriverManager.getConnection(host, user, pass);
            //3단계 - SQL 실행 객체 생성
            Statement stmt = conn.createStatement();


            //4단계 - SQL 실행
            String sql = "insert into `user1` values('j101','김유신','010-1234-101',23); ";
            stmt.executeUpdate(sql);
            //5단계 - 결과처리(SELECT 경우)
            //6단계 - 연결해제
            stmt.close();
            conn.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("insert 완료..");
    }
}
