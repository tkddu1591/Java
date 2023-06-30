package sub1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 날짜 : 2023/06/29
 * 이름 : 김상엽
 * 내용 : Ch09. File 입출력 실습하기
 * 
 *  문자 스트림(Stream)
 *   - 아시아권 문자를 위한 문자 전용 스트림
 *   - 유니코드 기반으로 UTF-8 인코딩으로 아시아권 문자 인코딩 처리
 */

public class ReaderTest {

	public static void main(String[] args) {

		String path = "C:\\Users\\Java\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\Java\\Desktop\\Sample2.txt";
		
		try {
			FileReader fr = new FileReader(path);
			FileWriter fw = new FileWriter(target);
			while(true) {
				
				int data = fr.read();
				if(data==-1)
					break;
				
				System.out.print((char)data);
				
				fw.write(data);
			}
			fr.close();
			fw.close();
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
