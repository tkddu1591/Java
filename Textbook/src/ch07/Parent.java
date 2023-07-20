package ch07;

public class Parent {
    public String a;

    public Parent() {
        this("대한민국");
        System.out.println("Parent() call");
    }

    public Parent(String a) {
        this.a = a;
        System.out.println("Parent(String a) call");
    }
}
