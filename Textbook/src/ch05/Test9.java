package ch05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        int studentNum=0;
        int studentSum=0;
        List<Integer> scores=new ArrayList<>();
        int answer =0;
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
            System.out.println("------------------------------------------------");
            System.out.print("선택 > ");
                    answer=sc.nextInt();
            if(answer==1){
                System.out.print("학생수 > ");
                studentNum=sc.nextInt();
                scores.clear();
                studentSum=0;
            }
            else if(answer==2){
                for(int i=0; i<studentNum; i++){
                    System.out.print(i+1+"번 학생 점수 입력 >");
                    scores.add(sc.nextInt());
                    studentSum+=scores.get(i);
                }
            }
            else if(answer==3){
                System.out.println("점수 리스트 : "+scores);
            }
            else if(answer==4){
                System.out.println("최고점수 : "+ Collections.max(scores));
                System.out.println("평균 : "+(double)studentSum/(double) studentNum);
            }
            else if(answer==5){
                break;
            }

        }
        System.out.println("시스템 종료...");
    }
}
