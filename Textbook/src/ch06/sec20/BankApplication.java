package ch06.sec20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int answer= 0;
        while(true){
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택 > ");
            answer=Integer.parseInt(sc.nextLine());
            if(answer==1){
                Account account= new Account();
                System.out.println("-------");
                System.out.println("계좌생성");
                System.out.println("-------");
                System.out.print("계좌번호 : ");
                account.setId(sc.nextLine());
                System.out.print("계좌주 : ");
                account.setName(sc.nextLine());
                System.out.print("초기입금액 : ");
                account.setBalance(Integer.parseInt(sc.nextLine()));
                accounts.add(account);
            }
            else if(answer==2){
                System.out.println("-------");
                System.out.println("계좌목록");
                System.out.println("-------");
                for (Account account : accounts) {
                    account.show();
                }
            }
            else if(answer==3) {
                System.out.println("-------");
                System.out.println("예금");
                System.out.println("-------");
                System.out.print("계좌번호 : ");
                String id = sc.nextLine();
                boolean check = false;
                for (Account account : accounts) {
                    if (account.getId().equals(id)) {
                        System.out.print("예금액 : ");
                        account.deposit(Integer.parseInt(sc.nextLine()));
                        check = true;
                        break;
                    }

                }
                if (check)
                    System.out.println("예금이 성공되었습니다.");
                else
                    System.out.println("계좌번호를 확인해 주세요.");
            }
            else if(answer==4){
                System.out.println("-------");
                System.out.println("출금");
                System.out.println("-------");
                System.out.print("계좌번호 : ");
                String id = sc.nextLine();
                boolean check = false;
                for(Account account : accounts){
                    if(account.getId().equals(id)){
                        System.out.print("출금액 : ");
                        account.withdraw(Integer.parseInt(sc.nextLine()));
                        check=true;
                        break;
                    }

                }
                if(check)
                    System.out.println("출금이 성공되었습니다.");
                else
                    System.out.println("계좌번호를 확인해 주세요.");

            }
            else if (answer==5){
                break;
            }

        }
    }
}
