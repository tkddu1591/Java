package sub4;
/*
* 2023/07/11
* 김상엽
* Transaction 실습
*
* 트랜잭션(Transaction)
*  - Transaction은 DB 처리의 최소 작업단위로 하나의 작업은 소작업으로 구성
*  - Transaction은 모두 성공 or 실패 해야함
*  - commit은 모든 직업의 성공처리, rollback은 모든 작업의 실패처리
*
* */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("에러를 발생하시겠습니까?");
        int answer = sc.nextInt();

        String host = "jdbc:mysql://127.0.0.1/bank";
        String pass = "1234";
        String user = "root";
        Connection conn=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection(host, user, pass);

            conn.setAutoCommit(false);
            String sql1 ="UPDATE `bank`.bank_account set a_balance= a_balance-10000 where a_o=?";
            String sql2 ="UPDATE `bank`.bank_account set a_balance= a_balance+10000 where a_o=?";
            PreparedStatement psmt1= conn.prepareStatement(sql1);
            PreparedStatement psmt2= conn.prepareStatement(sql2);
            psmt1.setString(1,"101-11-1001");
            psmt1.setString(1,"101-11-1003");


            if(answer==1)
                throw new Exception("에러가 발생했습니다!");

            psmt1.executeUpdate();
            psmt2.executeUpdate();
            conn.commit();
            psmt2.close();
            psmt1.close();
            conn.close();

        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }

    }
}
