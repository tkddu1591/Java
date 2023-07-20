package test7;

class Person{
    private  String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected  void Hello(){
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
    }
}

class Student extends Person{
    private int sutdentId;

    public Student(String name, int age, int sutdentId) {
        super(name, age);
        this.sutdentId = sutdentId;
    }

    @Override
    protected void Hello() {
        super.Hello();
        System.out.println("학번 : "+sutdentId);
    }
}

class Wooker extends Person{
    private int workId;

    public Wooker(String name, int age, int workId) {
        super(name, age);
        this.workId = workId;
    }

    @Override
    protected void Hello() {
        super.Hello();
        System.out.println("사번 : "+workId);
    }
}

public class Test4 {
    public static void main(String[] args) {
        Student kim = new Student("김유신",21,20201234);
        Wooker lee = new Wooker("이순신",35,20211201);

        kim.Hello();
        lee.Hello();
    }
}
