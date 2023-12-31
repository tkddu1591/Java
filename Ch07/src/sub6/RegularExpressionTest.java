package sub6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 날짜 : 2023/06/28
 * 이름 : 김상엽
 * 내용 : Ch07. Java Date 클래스 실습하기
 */
public class RegularExpressionTest {
	
	public static void main(String[] args) {
		//정규표현식
		String strPatt = "a[a-z]*"; //a로 시작 및 알파벳 소문자만 포함
		boolean r1=Pattern.matches(strPatt, "apple");
		boolean r2=Pattern.matches(strPatt, "appLE");
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		//정규표현식 패턴
		String[] patterns = {				//+는 1개 이상, *는 0개 이상
								"[0-9]+", 	//숫자만 포함 및 1개 이상
								"1[0-9]*",	//1로 시작 및 숫자만 포함
								"^[0-9]*",	//숫자(0-9)로 시작 
								"[^0-9]*",	//숫자가 아닌 문자
								".",		//문자 하나
								"[a-z]?",	//영어 소문자 1개
								"[a-z]+",	//소문자만 포함 및 소문자 1개 이상
								"[a-z]*",	//소문자만 포함 및 소문자 0개 이상
								"[A-Z]*",	//대문자만 포함 및 대문자 1개 이상
								"[가-힣]+",	//한글 포함 및 한글 1개 이상
								"[0-9a-z]+",	//숫자 및 영어 소문자 1개 이상
								"[0-9가-힣]*"	,	//숫자 및 한글
								"[0-9a-z]*",	//숫자 및 알파벳 소문자
								"[A-Za-z]*",		//알파벳 대 소문자
								"\\s",		//공백
								"\\S",		//공백이 아닌 문자
								"\\d",		//숫자
								"\\w",		//숫자와 문자
								"\\W",		//특수문자
							};
		
		String[] words = {"apple","123한글","123456","011","hello","홍길동","1","Apple","#%$","Banana","APPLE","#",""};
		
		
		for(String word : words) {
			
			System.out.print(word+" 문자와 일치하는 패턴 ");
			for(String pattern : patterns) {
				
				boolean result=Pattern.matches(pattern, word);
				
				if(result) {
					System.out.print(pattern+", ");
				}
			}
			System.out.print("\n");
			
		}
		//자주사용하는 정규표현식
		String ptt1 = "^[a-zA-Z0-9]*$";
		String ptt2 = "^[가-힣]*$";
		String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})";
		String ptt4 = "(\\w+)@(\\w+).(\\w+)";
		
		String str = "이름:홍길동, 휴대폰:010-1234-1001, 휴대폰:011-123-1001, 이메일:hong@gmail.com";
		
		Pattern p1 = Pattern.compile(ptt3);
		Matcher m1 = p1.matcher(str);
		
		System.out.println("휴대폰 조회");
		while(m1.find()) {
			System.out.println(m1.group());
		}

		p1 = Pattern.compile(ptt4);
		m1 = p1.matcher(str);

		System.out.println("이메일 조회");
		while(m1.find()) {
			System.out.println(m1.group());
		}
		

		p1 = Pattern.compile(ptt1);
		m1 = p1.matcher(str);

		System.out.println("ID 조회");
		while(m1.find()) {
			System.out.println(m1.group());
		}

		p1 = Pattern.compile(ptt2);
		m1 = p1.matcher(str);

		System.out.println("이름 조회");
		while(m1.find()) {
			System.out.println(m1.group());
		}



	}
}
