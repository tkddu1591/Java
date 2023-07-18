package ch04;

public class Test5 {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        for (int i =0; i<=10; i++){
            for(int j=0; j<=10; j++){
                numbers[0]=i;
                numbers[1]=j;
                if(4*numbers[0]+5*numbers[1]==60)
                System.out.println(numbers[0]+", "+numbers[1]);
            }
        }
    }
}
