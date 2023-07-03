package sub2;

public class Count {
    private int num;

    public int getNum() {
        return num;
    }

    public synchronized void setNum() { //쓰레드간의 경합을 막고 동기화를 위한 블럭
        this.num ++;
    }
}
