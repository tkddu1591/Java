package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 날짜:2023/07/10
 * 이름:김상엽
 * 내용:JDBC 프로그래밍 실습하기
 *
 * JDBC(Java DataBase Connectivity)
 *  - 자바에서 데이터 베이스 연결을 위한 기술표준
 *  - Java는 기본적으로 java.sql 패키지를 포함하고 별도로 DBMS에 맞는 드라이버 설정
 *
 * */
public class JDBCTest {
    public static void main(String[] args) {
        //DB 정보

        String host = "jdbc:mysql://127.0.0.1:3306/userdb";
        String user = "root";
        String pass = "1234";

        try {
            //JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            //데이터 베이스 접속
            Connection conn = DriverManager.getConnection(host, user, pass);
            if (conn != null)
                System.out.println("데이터 베이스 접속 성공!!");
            else
                System.out.println("데이터 베이스 접속 실패!!");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        //executeQuery() select 쿼리 수행
        //executeUpdate() select 이외 쿼리문 수행
        //java.sql.ResultSet 데이터 베이스 데이터 수신

    }
}
