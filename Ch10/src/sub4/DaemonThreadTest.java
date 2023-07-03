package sub4;
/**
 * 날짜 : 2023/07/03
 * 이름 : 김상엽
 * 내용 : DaemonThreadAdd 실습
 * </p>
 * 데몬쓰레드(Deamon Thread)
 *  - 메인쓰레드를 보조하는 보조쓰레드
 *  - 메인스레드가 종료되면 메인 스레드도 같이 종료
 */
class DaemonThreadTest {
    public static void main(String[] args) throws InterruptedException {

        SubThread st = new SubThread();
        st.setDaemon(true); //데몬쓰레드 설정
        st.start();
        for(int i =0; i<10; i++){

            Thread.sleep(1000);
            System.out.println("MainThread 실행...");

        }
        System.out.println("프로그램 종료...");


    }
}
