package test6;

public class Test02 {
    public static void main(String[] args) {
        boolean sing = false;
        double pi = 0;
        for(int i=1; i<=10000; i+=2){
            if(sing==false){
                pi+=1.0/i;
                sing=true;
            }
            else{
                pi-=1.0/i;
                sing=false;
            }
            System.out.printf("i =%d, PI = %f\n",i,4*pi);
        }

    }
}
