package ch07;

import java.lang.reflect.Type;

import static ch07.Example.action;

class A{
    public void mathod1(){
        System.out.println("A-method()");
    }
}
class B extends A{
    public void mathod1(){
        System.out.println("B-method()");
    }
}
class C extends A{
    public void mathod1(){
        System.out.println("C-method1()");
    }
    public void mathod2(){
        System.out.println("C-method2()");
    }

}
class Example{
    public static void action(A a){
        a.mathod1();
        if(a instanceof C c){
            c.mathod2();
        }
    }
}
public class Sec12 {
    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}
