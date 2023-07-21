package test8;

public class Test02 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println(reverseStr(str1));
        System.out.println(reverseStr(str2));
    }
    public static String reverseStr(String  str){
        StringBuilder sb = new StringBuilder();

        for(int i= str.length()-1; i>=0; i--){
            sb.append(str.substring(i,i+1));
        }
        return sb.toString();
    }
}
