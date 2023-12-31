package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 날짜 : 2023/06/29
 * 이름 : 김상엽
 * 내용 : Ch09. Java Properties 실습하기
 * 
 *  프로퍼티(Properties)
 *   문자열 데이터만 취급하는 Key-Value 자료구조 클래스
 *   - 프로그램의 환경ㅅ러정값을 저장할 때 많이 사용
 *   - 입출력스트림으로 데이터 입출력하는 자료구조 클래스
 */
public class PopertiesTset {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		

		String path1 = "C:\\Users\\Java\\Desktop\\Fruit.properties";
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(path1);

			prop.store(fos, null);
			
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String target =  "C:\\Users\\Java\\Desktop\\Cities.properties";
		
		Properties properties= new Properties();
		try {
			FileInputStream fis = new FileInputStream(target);
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(properties);			
		System.out.println("한국 : " + properties.getProperty("kor"));
		System.out.println("미국 : " + properties.getProperty("usa"));
		System.out.println("일본 : " + properties.getProperty("jp"));
		
		System.out.println("프로그램 종료...");
		
	}
	
}
