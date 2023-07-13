package sub5;

import java.util.List;
import java.util.Scanner;

/*
 * 2023/07/12 김상엽
 * CRUD 실습
 *
 * CRUD
 *  - Create, Read, Update, Delete
 *  - 데이터베이스의 기본 처리 기능을 의미
 *  - Insert, Select, Update, Delete 처리기능
 *
 * DAO
 *  - Data Access Object
 *  - 데이터베이스 CRUD 처리 객체
 *
 * */
public class CRUDTest {
    public static void main(String[] args) {

        System.out.println("-------------------------");
        System.out.println("회원관리매니저 v1.0");
        System.out.println("-------------------------");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
            System.out.print("선택 : ");
            int answer = sc.nextInt();

            if (answer == 0) {
                break;
            } else if (answer == 1) {
                User3Vo vo = new User3Vo();
                System.out.print("아이디 입력 : ");
                vo.setUid(sc.next());
                System.out.print("이름 입력 : ");
                vo.setName(sc.next());
                System.out.print("휴대폰 입력 : ");
                vo.setHp(sc.next());
                System.out.print("나이 입력 : ");
                vo.setAge(sc.nextInt());
                UserDAO dao = UserDAO.getInstance();
                dao.insertUser(vo);
            } else if (answer == 2) {
                List<User3Vo> users = UserDAO.getInstance().selectUsers();
                System.out.println("------------ 전체 조회 ------------");
                for (User3Vo user : users) {
                    System.out.println(user);
                }

            } else if (answer == 3) {
                System.out.print("검색할 ID 입력...");
                String id = sc.next();
                User3Vo user = UserDAO.getInstance().selectUser(id);
                System.out.println("------------ 유저 조회 ------------");
                System.out.println(user);

            } else if (answer == 4) {
                User3Vo user = null;
                System.out.print("변경하고자 하는 사용자의 Id 입력...");
                String id = sc.next();
                user = UserDAO.getInstance().selectUser(id);
                System.out.println("------------ 유저 수정 ------------");
                if(user==null) {
                    System.out.println(user);
                    System.out.println("------------ 수정 데이터 입력 ------------");
                    user.setUid(id);
                    System.out.print("변경 name : ");
                    user.setName(sc.next());
                    System.out.print("변경 hp 입력 : ");
                    user.setHp(sc.next());
                    System.out.print("변경 age 입력 : ");
                    user.setAge(sc.nextInt());
                    int result = UserDAO.getInstance().updateUser(user);
                    System.out.println("수정 완료...");
                }
                else
                    System.out.println("수정할 사용자가 존재하지 않습니다...");


            } else if (answer == 5) {
                System.out.print("삭제할 사용자의 아이디를 입력하세요 : ");
                String id = sc.next();
                int result = UserDAO.getInstance().deleteUser(id);
                if (result > 0)
                    System.out.println("삭제 완료...");
                else
                    System.out.println("삭제할 사용자가 존재하지 않습니다...");

            }
        }
        System.out.println("회원관리매니저 종료...");
    }
}
