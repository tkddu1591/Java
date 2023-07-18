package ch04;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");
            int num= sc.nextInt();
            if (num == 1) {
                System.out.print("예금액 >");
                sum += sc.nextInt();
            }
            else if (num == 2) {
                System.out.print("출금액 >");
                sum -= sc.nextInt();
            }
            else if (num == 3)
                System.out.println("잔고> " + sum);
            else if (num == 4)
                break;
        }
    }
}
