package sub3;
/**
 * 날짜: 2023/06/26
 * 이름: 김상엽
 * 내용: Ch06. Java 예외발생 시키기 실습하기
 */

//사용자 정의 예외클래스
class MinusException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MinusException(String msg) {
		super(msg);
	}
}

class OverException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OverException (String msg){
		super(msg);
	}
}

class Score{
	public void check(int score)throws MinusException, OverException{
		if(score <0) {
			//예외 발생 시키기
			throw new MinusException("점수는 음수가 될 수 없습니다.");
		}
		else if(score>100) {
			throw new OverException("점수는 100점을 넘을 수 없습니다.");
		}
		else {
			System.out.println("점수가 정상입니다.");
		}
	}
}
	
	
	
public class  ThrowTset  {
	public static void main(String[] args){
		Score score = new Score();
		
		try {
		score.check(-3);
		score.check(102);
		score.check(93);
		}
		catch (MinusException e) {
			e.printStackTrace();
		}
		catch (OverException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}
