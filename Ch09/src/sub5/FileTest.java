package sub5;

import java.io.File;
import java.io.IOException;

/**
 * 날짜: 2023/06/30
 * 이름: 김상엽
 * 내용: Java File class 실습
 * 
 *  파일 클래스
 *   - File 클래스는 파일에 대한 경로나 정보를 조회할때 사용하는 클래스
 *   - 별도의 입출력 기능이 없어 스트림을 통한 데이터 입출력 
 *
 */
public class FileTest {

	public static void main(String[] args) {
		//파일 객체 생성
		File f1 = new File("C:\\Users\\Java\\Desktop\\file1.txt");
		File f2 = new File("../../../../../file2");
		
		
		try {
			//파일 생성
			f1.createNewFile();
			//폴더 생성
			f2.mkdir();
			//파일 정보 조회
			//is or has로 시작하는 메서드 (boolean 타입)
			System.out.println("f1 : "+f1.isFile());
			System.out.println("f1 : "+f1.isDirectory());
			System.out.println("f2 : "+f2.isFile());
			System.out.println("f2 : "+f2.isDirectory());
			System.out.println("f1 : "+f1.getName());
			System.out.println("f2 : "+f2.getName());
			System.out.println("f1 : "+f1.getAbsolutePath());
			System.out.println("f2 : "+f2.getAbsolutePath());
			System.out.println("f1 : "+f1.getPath());
			System.out.println("f2 : "+f2.getPath());
			
			f1.delete();
			f2.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}
