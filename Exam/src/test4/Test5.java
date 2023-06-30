package test4;
/*
 * 날짜: 2023/06/30
 * 이름: 김상엽
 * 내용: String, Wrapper 클래스 연습문제
 */
public class Test5 {
	public static void main(String[] args) {
		String strCsv = "60,72,82,86,92";
		String[] scores = strCsv.split(",");
		
		int total = 0;
		
		for(int i =0; i<scores.length; i++) {
			total += Integer.parseInt(scores[i]);
		}
		
		System.out.println("총점 : "+total);
	}

}
