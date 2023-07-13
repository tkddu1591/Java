package sub3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
* 2023/07/11 김상엽
* PreparedStatement 실습
*
* PreparedStatement
*  - 기존 Statement 보다 향상된 동적 SQL 생성을 위한 Statement
*  - Query Parameter에 값을 Mapping 시켜 쿼리 실행
*
* VO(values Object) 객체
*  - 도메인값을 속성으로 가지는 객체
*  - 테이블 Entity(개체)를 Object(객체)로 변환할 때 사용하는 객체
*  - DTO 구분
* */

//VO 객체 : 테이블 Entity(개체)가 변환되는 객체
class User2VO {
    private String uid;
    private String name;
    private String hp;
    private int age;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class PreparedSelectTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String host = "jdbc:mysql://127.0.0.1/userdb";
        String user = "root";
        String pass = "1234";
        List<User2VO> users = new ArrayList<>();
        // 결과처리


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, user, pass);
        String sql = "select * from userdb.user2";
        PreparedStatement psmt = conn.prepareStatement(sql);
        ResultSet rs = psmt.executeQuery();
        while (rs.next()) {
            User2VO vo = new User2VO();

            vo.setUid(rs.getString(1));
            vo.setName(rs.getString(2));
            vo.setHp(rs.getString(3));
            vo.setAge(rs.getInt(4));
            users.add(vo);
        }
        rs.close();
        psmt.close();
        conn.close();


        for (User2VO us: users) {
            System.out.printf("%s %s %s %d \n",us.getUid(),us.getName(),us.getHp(),us.getAge());
        }


    }
}
