package sub4;

public class SubThread extends Thread{

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("SubThread 실행...");
        }
    }
}
