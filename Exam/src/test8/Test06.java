package test8;

interface MyLanbda<T>{
    public T what(T t);
}
public class Test06 {
    public static void main(String[] args) {

        MyLanbda<Integer> factiorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        };

        System.out.println(factiorial.what(3));
        System.out.println(factiorial.what(5));

        MyLanbda<String> resverse = s->{
            String result="";
            for(int i=s.length()-1; i>=0; i--)
                result+=s.charAt(i);
            return result;
        };
        System.out.println(resverse.what("Hello"));
        System.out.println(resverse.what("World"));
    }
}
