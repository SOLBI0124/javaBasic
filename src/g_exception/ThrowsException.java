package g_exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		/*
		 * <<메서드에 예외 선언하기>>
		 * void method () throws Exception {}
		 * 메서드의 구현부 끝에 throws 키워드 + 예외 클래스명으로 예외를 선언할 수 있다.
		 * 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외처리를 넘겨준다.
		 * 
		 * */
		
		try {
			mothod();
		} catch (IOException e) {
			//2.넘겨받은 예외를 처리한다.
			e.printStackTrace();
		}
	}

	private static void mothod() throws IOException {	//1.예외를 처리하지 않고 넘겨준다.
		throw new IOException();						//	예외처리를 메인메서드로 넘겨줌
	}

/*	
 	***에러찾는방법
 	에러 맨위에서부터 내가만든 메서드 찾아서 수정
 
	***예외처리방법
	1.나를 호출한 메서드한테 넘겨줌 (throws+예외클래스명):예외를선언->예외떠넘김
	2.try-catch로 감싸줌
	
*/
}
