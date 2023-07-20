package ch06;

public class Sec17 {
    public  static void println(String a){
        System.out.println(a);
    }
    public static   void println(int a){
        System.out.println(a);
    }
    public  static void println(boolean a){
        System.out.println(a);
    }
    public  static void println(double a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Sec17 sec17 =new Sec17();
        Sec17.println(10);
        Sec17.println(true);
        Sec17.println(5.7);
        Sec17.println("홍길동");
    }
}
