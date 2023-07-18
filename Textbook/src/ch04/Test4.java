package ch04;

public class Test4 {
    public static void main(String[] args) {
        int[] numbers =new int[2];
        while (true){
            numbers[0]= (int) (Math.random()*6);
            numbers[1]= (int) (Math.random()*6);
            if(numbers[0]+numbers[1]==5){
                break;
            }
        }
        System.out.println(numbers[0]+", "+numbers[1]);
    }
}
