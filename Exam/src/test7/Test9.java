package test7;
interface Tv{
    public void turnOn();
    public void turnOff();
}
public class Test9 {
    public static void main(String[] args) {
        Tv tv = new Tv(){
            public void turnOn() {
                System.out.println("Tv를 켭니다.");
            }

            public void turnOff() {
                System.out.println("Tv를 끕니다.");
            }
        };

        tv.turnOn();
        tv.turnOff();


    }

}
