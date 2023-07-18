package ch03;

public class Test3 {
    public static void main(String[] args) {

        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils/students;
        int pencilsLeft = pencils%students;
        System.out.println(pencilsPerStudent);
        System.out.println(pencilsLeft);
    }
}
