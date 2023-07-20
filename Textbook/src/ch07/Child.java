package ch07;

public class Child extends Parent {
    public String a;

    public Child() {
        this("대한민국");
        System.out.println("Child() call");
    }

    public Child(String a) {
        this.a = a;
        System.out.println("Child(String a) call");
    }
}
