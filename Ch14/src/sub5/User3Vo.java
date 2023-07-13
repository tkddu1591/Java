package sub5;

public class User3Vo {
    private String uid=null;
    private String name;
    private String hp;
    private int age;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if(uid==null)
            return "해당하는 사용자가 없습니다.";
        return uid+" "+name+" "+hp+" "+age;
    }
}
