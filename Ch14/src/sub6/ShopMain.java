package sub6;

import java.util.Scanner;

/*
 * 20230713 김상엽
 * Shop CRUD 실습하기
 * */
public class ShopMain {
    public static void main(String[] args) {

        System.out.println("-----------------");
        System.out.println("쇼핑몰에 오신것을 환영합니다.");
        System.out.println("-----------------");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 구매하기:4");
            int answer = sc.nextInt();
            if (answer == 0)
                break;
            else if (answer == 1) {

                System.out.println("아이디 입력 : ");
                String custId = sc.next();
                CustomerDAO.getInstance().selectCustomer(custId);
            } else if (answer == 2) {

            } else if (answer == 3) {

            } else if (answer == 4) {

            }

        }


        sc.close();
        System.out.println("안녕히 가세요~");
    }
}
