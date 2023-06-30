package sub2;
/**
 * 날짜 : 2023/06/29
 * 이름 : 김상엽
 * 내용 : Ch09. File 입출력 실습하기
 * 
 * 보조스트림(버퍼)
 *  - 기본 입출력 스트림에 buffer를 장착해서 빠른 입출력을 지원하는 보조 스트림
 *  - 
 * 
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferIOTest {
	public static void main(String[] args) {

		String path = "C:\\Users\\Java\\Desktop\\WorkSpace.zip";
		String target = "C:\\Users\\Java\\Desktop\\WorkSpace2.zip";
		
		
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
		

			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos =  new BufferedOutputStream(fos);
			while(true) {
				
				int data = bis.read();
				if(data==-1)
					break;
				
				
				bos.write(data);
			}
			bos.flush();
			bos.close();
			bis.close();
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");
		
	}
}
