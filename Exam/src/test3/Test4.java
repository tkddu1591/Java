package test3;
/*
 * 날짜: 2023/06/23
 * 이름: 김상엽
 * 내용: 자바 정적변수 연습문제
 */
class Student{
	public static int studentId;
	private String studentName;
	private String major;
	private int grage;
	public Student(String studentName, String major, int grage) {
		this.studentId++;
		this.studentName = studentName;
		this.major = major;
		this.grage = grage;
	}
	
	public void studentInfo() {
		System.out.println("=============");
		System.out.println("학번 : "+studentId);
		System.out.println("이름 : "+studentName);
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+grage);
		System.out.println("-------------");
	}
	
	
	
}

public class Test4 {

	public static void main(String[] args) {
		Student.studentId = 20201000;
		
		Student kim = new Student("김유신","국문과", 1);
		kim.studentInfo();
		Student lee = new Student("이순신", "경제학과", 1);
		lee.studentInfo();
		Student lim= new Student("임꺽정", "경영학과", 1);
		lim.studentInfo();
	}
}
