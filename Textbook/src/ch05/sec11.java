package ch05;

public class sec11 {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("시스템 입력값이 부족");
            System.exit(0);
        }
        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1+num2;
        System.out.println(num1+" + "+num2+" = "+result);

    }
}
