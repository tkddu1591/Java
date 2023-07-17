package test5;

public class Test4 {
    public static void main(String[] args) {
        int a =10;
        int b =5;

        System.out.println(a > b&& a==10);
        System.out.println(a > b&& a==b);
        System.out.println(a > b|| a==b);
        System.out.println(a < b&& a==b);
        System.out.println(a > b^a==10);
        System.out.println(a > b^ a==b);
        System.out.println(true ^ false);
        System.out.println(!(a>b));
        System.out.println(!(a<b));
    }
}
