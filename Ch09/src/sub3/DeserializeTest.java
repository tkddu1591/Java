package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 날짜 : 2023/06/29
 * 이름 : 김상엽
 * 내용 : Ch09. 역직렬화 실습하기
 * 
 * 
 */
public class DeserializeTest {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\Java\\Desktop\\Apple.txt";
		try {
			FileInputStream fis = new FileInputStream(path1);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Apple apple = (Apple)ois.readObject();
			apple.show();
			
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


}
