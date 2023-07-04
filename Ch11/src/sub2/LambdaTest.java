package sub2;
/*
 * 날짜 : 2023/07/04
 * 이름 : 김상엽
 * 내용 : Java 람다식 실습하기
 *
 * 람다식
 *  - 함수형 프로그래밍을 지원하는 구문
 *  - 인터페이스 타입으로 @FunctionalInterface 선언 해서 람다식 정의
 * */

@FunctionalInterface
interface A {
    int method(int a, int b);
}

@FunctionalInterface
interface B {
    void method(double a);
}

@FunctionalInterface
interface C {
    boolean method();
}

interface D {
    void method();
}


public class LambdaTest {
    public static void main(String[] args) {
        //람다식 정의
        A a1 = (int a, int b) -> {
            return a + b;
        };
        A a2 = (a, b) -> {
            return a + b;
        };

        A a3 = Integer::sum;

        int r1 = a1.method(1, 2);
        int r2 = a2.method(2, 3);
        int r3 = a3.method(3, 4);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        B b1 = System.out::println;
        B b2 = (a) -> System.out.println("a = " + a);
        B b3 = a -> System.out.println("a = " + a);

        b1.method(1.0);
        b2.method(2.1);
        b3.method(3.2);

        C c1 = () -> {
            return true;
        };
        C c2 = () -> false;

        System.out.println("c1 = " + c1.method());
        System.out.println("c2 = " + c2.method());

        D d1 = () -> {
            System.out.println("d1 실행...");
        };
        D d2 = () -> System.out.println("d1 실행...");

        d1.method();
        d2.method();

        Runnable run = () -> {

            for(int i=0; i<10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("서브 스레드 실행 중...");
            }
        };

        Thread thread = new Thread(run);
        thread.start();
        for(int i=0; i<10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("메인 스레드 실행 중...");
        }
        System.out.println("프로그램 종료");
    }
}
