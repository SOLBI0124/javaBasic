package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식	: 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	뒷 문자로 시작			//^[0-9]숫자로 시작
		 * 							//[^0-9]숫자가 아님
		 * $	앞 문자로 종료
		 * .	임의의 문자(줄바꿈제외)
		 * *	앞 문자가 0개 이상
		 * +	앞 문자가 1개 이상	( \+ : + )
		 * ?	앞 문자가 없거나 1개
		 * []	문자의 집합이나 범위 ([a-z]:a부터 z까지, [^a-z]:a부터 z가 아닌것)
		 * {}	앞 문자의 개수({2} : 2개, {2,4} : 2개 이상 4개 이하)
		 * ()	그룹화(1개의 문자처럼 인식)
		 * |	OR연산
		 * \s	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?i)	뒷 문자의 대소문자 구분 안함
		 * \	정규표현식에 사용되는 특수문자 표현
		 * 
		 */

		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";			//a-z,0-9가 한개이상
//		String regex = "\\w*";				//알파벳이나 숫자가 0개이상. 정규표현식으로 만들려면 \두개
		String regex = ".*";				//줄바꿈제외한 어떤문자든지 0개이상
		
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str); 		//파라미터로 검사할 문자열str을 Matcher라는 객체에 저장
		
		System.out.println(m.matches());	//문자열과 패턴이 일치한지
		
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		String email="ss@naver.net";
		
		String regex1 = "[a-z0-9_-]{5,20}";	//5~20사이 영문 소문자, 숫자, 특수기호(_ -)만 사용 가능
		String regex2 = "^0\\d{1,3}-//d{3,4}-\\d{4}";
		String regex3 = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org([a-z]{2}\\.kr))$";
		
		Pattern p1 = Pattern.compile(regex3);
		
		Matcher m1 = p1.matcher(email); 		
		
		System.out.println(m1.matches());
	}

}
