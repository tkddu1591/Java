package ch06;

public class Sec16 {
    public  void println(String a){
        System.out.println(a);
    }
    public  void println(int a){
        System.out.println(a);
    }
    public  void println(boolean a){
        System.out.println(a);
    }
    public  void println(double a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Sec16 sec16 =new Sec16();
        sec16.println(10);
        sec16.println(true);
        sec16.println(5.7);
        sec16.println("홍길동");
    }
}
