package ch05;

public class Test7 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
                if (temp < array[i]) {
                    temp=array[i];
                }
        }
            System.out.println(temp);
    }
}
