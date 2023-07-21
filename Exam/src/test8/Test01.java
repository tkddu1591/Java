package test8;

import java.util.StringTokenizer;

public class Test01 {
    public static void main(String[] args) {
        String [] arr1 = {"Apple","Banana","Grape","Orange"};
        String result1 = String.join("-",arr1);
        System.out.println(result1);

        String[] arr2 = result1.split("-");
        String result2 = String.join("",arr2);
        System.out.println(result2);

        String [] arr3 = result2.split("(?=[A-Z])");
        String result3= String.join("^",arr3);
        System.out.println(result3);

        StringTokenizer st =new StringTokenizer(result3.replace("^",""));
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()){
            sb.append(st.nextToken());
        }
        String result4 =sb.toString();
        System.out.println(result4);
    }
}
