package ch06;

public class Sec18 {
    private static Sec18 instance = new Sec18();
    private Sec18(){
    }
    public static Sec18 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Sec18 obj1 = Sec18.getInstance();
        Sec18 obj2 = Sec18.getInstance();
        if(obj2==obj1)
            System.out.println("같음");
        else
            System.out.println("다름");
    }

}
