package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 날짜 : 2023/06/29
 * 이름 : 김상엽
 * 내용 : Ch09. File 입출력 실습하기
 * 
 *  입출력 스트림(Stream)
 *   - 프로그램은 데이터 처리와 함께 데이터 저장을 위해 파일 입출력 수행
 *   - 파일 입출력을 위해 스트림(데이터 연결 통로) 사용
 */
public class FileIOTest {
	public static void main(String[] args) {

		String path = "C:\\Users\\Java\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\Java\\Desktop\\Sample2.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			while(true) {
				
				int data = fis.read();
				if(data==-1)
					break;
				
				System.out.print((char)data);
				
				fos.write(data);
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
	}
}
