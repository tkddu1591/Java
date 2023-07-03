package sub1;

/**
 * 날짜 : 2023/07/03
 * 이름 : 김상엽
 * 내용 : Java Thread 실습하기
 *
 *  스레드(Thread)
 *   - 하나의 프로세스 안에서 실행되는 프로그램 실행흐름
 *   - 스레드는 동시에 실행되는 병행 실행
 *   - Thread 클래스를 상송 받아 Start 실행
 */


public class ThreadTest {
    public static void main(String[] args) {
        SubThread st1= new SubThread("Sub1");
        SubThread st2= new SubThread("Sub2");
        String 나이 ="나이";
        st1.start();
        st2.start();
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
            System.out.println("Main Thread 실행");
        }
        System.out.println("Main Thread 종료");
    }
}
