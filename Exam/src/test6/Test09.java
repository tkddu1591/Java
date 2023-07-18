package test6;

public class Test09 {
    public static void main(String[] args) {
        pyramid(3);
        pyramid(5);
        pyramid(7);
    }
    public static void pyramid(int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++)
                System.out.print(" ");
            for(int j=1; j<=i*2+ 1; j++)
                System.out.print("*");
            System.out.println();

        }
    }
}
