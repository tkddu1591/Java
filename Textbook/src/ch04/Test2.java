package ch04;

public class Test2 {
    public static void main(String[] args) {

        String grade ="B";
        int score1 =0;

        switch (grade){
            case "A" -> score1=100;
            case "B" -> score1=80; //Expression 사용시 return 대신 yield 사용
            default -> score1=60;
        }
        System.out.println(score1);
    }
}
