package test5;

public class Test1 {

    public static void main(String[] args) {

        char a = 'A';
        int b = a;
        char c = 66;
        int d = a + b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("d : " + d);

        float n1 = 3.14f;
        double n2 = 3.14d;

        int n3 = (int) n1;
        int n4 = (int) n2;

        System.out.println("n1 : " + n1);
        System.out.println("n2 : " + n2);
        System.out.println("n3 : " + n3);
        System.out.println("n4 : " + n4);

        String str1 = "홍길동";
        String str2 = null;
        String str3 = """
                Hello
                World
                Korea""";

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);

    }

}
