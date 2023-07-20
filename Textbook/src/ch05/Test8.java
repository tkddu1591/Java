package ch05;

public class Test8 {
    public static void main(String[] args) {
        int[][] array={{95,86},{83,92,96},{78,83,93,87,88}};
        int sum = 0;
        int avg = 0;
        for(int i=0; i<array.length;i++){
            for(int j = 0; j<array[i].length; j++){
                sum+=array[i][j];
                avg++;
            }
        }
        System.out.println(sum);
        System.out.println(sum/avg);
    }
}
