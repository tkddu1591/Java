package test8;

import java.util.HashMap;
import java.util.Map;

class Person{
    private String pid;
    private String name;
    private int age;

    public String getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String pid, String name, int age) {
        this.pid = pid;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "아이디:"+this.pid+", 이름:"+this.name+", 나이:"+age;
    }
}

class PersonMap{
    private Map<String,Person> persons;

    public PersonMap(){
        persons = new HashMap<>();
    }
    public void addPersonO(Person p){
        persons.put(p.getPid(),p);
    }
    public boolean removePerson(String uid){
        if(persons.containsKey(uid)){
            persons.remove(uid);
            return true;
        }
        System.out.printf("아이디 '%s'가 존재하지 않습니다.\n",uid);
        return false;
    }
    public void showAllPersons(){
        for(Person p : persons.values()){
            System.out.println(p);
        }
    }
}
public class Test08 {
    public static void main(String[] args) {
        PersonMap map = new PersonMap();
        Person p1 = new Person("a101","김유신",23);
        Person p2 = new Person("a102","김춘추",21);
        Person p3 = new Person("a103","장보고",31);
        Person p4 = new Person("a104","강감찬",42);
        Person p5 = new Person("a105","이순신",53);

        map.addPersonO(p1);
        map.addPersonO(p2);
        map.addPersonO(p3);
        map.addPersonO(p4);
        map.addPersonO(p5);

        map.removePerson("kim");
        map.removePerson("a103");

        map.showAllPersons();
    }
}
