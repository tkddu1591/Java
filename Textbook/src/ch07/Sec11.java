package ch07;

class Activity{
    public void onCreate(){
        System.out.println("기본적인 내용 실행");
    }
}
class MainActivity extends Activity{
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("추가적인 내용 실행");
    }
}
public class Sec11 {
    public static void main(String[] args) {
        MainActivity mainActivity = new MainActivity();
        mainActivity.onCreate();
    }


}
