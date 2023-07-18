package test6;


public class Test04 {
    public static void main(String[] args) {
        System.out.printf("%7s %10s %5s %6s\n","10진수","2진수","8진수","16진수");
        for(int i=1; i<=128; i++){
            System.out.printf("%7s %10s %5s %6s\n",i,
                    Integer.toBinaryString(i),
                    Integer.toOctalString(i),
                    Integer.toHexString(i));
        }

    }
}
