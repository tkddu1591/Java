package ch03;

public class Test7 {

    public static void main(String[] args) {

        double x= 5;
        double y= 0;
        double z= 5%y;
        if(Double.isNaN(z))
            System.out.println("0으로 나눌 수 없습니다.");
        else
        {
            double result = z+10;
            System.out.println("결과 = "+ result);
        }
    }
}


