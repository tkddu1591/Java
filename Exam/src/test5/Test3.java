package test5;

public class Test3 {
    public static void main(String[] args) {

        int a= 3, b=4, c=5;
        boolean result = a*a+b*b==c*c;
        System.out.println("결과 : "+result);

        int x1 = 1, y1 =1;
        int x2 = 4, y2 =5;
        double distance = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        System.out.println("좌표평먼 (1,1)과 (4,5) 사이거리 : " +distance);
    }
}
