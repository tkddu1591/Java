package ch06;

import java.util.Objects;

public class Sec15 {

    public boolean login(String id, String password){
        if(Objects.equals(id, "hong") && Objects.equals(password, "12345")){
            return true;
        }
        return false;
    }
    public void logout(String id){
        System.out.println(id+"님이 로그아웃 되었습니다.");
    }

    public static void main(String[] args) {
        Sec15 sec15 = new Sec15();
        boolean result = sec15.login("hong","12345");
        if(result){
            System.out.println("로그인 되었습니다.");
            sec15.logout("hong");
        }
        else
            System.out.println("id 또는 password가 올바르지 않습니다.");

    }
}
