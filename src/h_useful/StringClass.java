package h_useful;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * equals()			: 문자열의 내용을 비교하여 같으면 true 다르면 false  /cf. == : 주소비교
		 * length()			: 문자열의 길이를 반환한다.
		 * substring()		: 주어진 범위에 해당하는 문자열을 반환한다.
		 * charAt()			: 지정된 위치의 문자를 반환한다.
		 * indexOf()		: 주어진 문자의 위치를 반환한다.
		 * lastIndexOf()	: 주어진 문자의 마지막 위치를 반환한다.
		 * replace()		: 문자열 내의 주어진 문자(문자열)를 새로운 문자(문자열)로 바꾼 문자열을 반환한다.
		 * replaceAll()		: 문자열 내의 주어진 정규표한식과 일치하는 문자열을 새로운 문자열로 바꾼 문자열을 반환한다.
		 * split()			: 문자열을 주어진 정규표현식과 일치하는 문자열로 나누어 문자열 배열로 반환한다.
		 * startsWith()		: 주어진 문자열로 시작하는지 여부를 반환한다.
		 * endsWith()		: 주어진 문자열로 끝나는지 여부를 반환한다.
		 * toUpperCase()	: 문자열을 대문자로 변환한 문자열을 반환한다.
		 * toLowerCase()	: 문자열을 소문자로 변환한 문자열을 반환한다.
		 * trim()			: 양끝의 공백을 제거한 문자열을 반환한다.
		 */
		
		String str = "abc abc  abc";
		
		System.out.println(str.indexOf("a"));						//0번째 인덱스
		System.out.println(str.indexOf("a",1));						//4 (1번인덱스부터 찾으라는 의미)
		System.out.println(str.indexOf("a", str.indexOf("a")+1));	//4 (a찾을때 a의인덱스 다음부터 찾아라) 실제사용할때
		System.out.println(str.lastIndexOf("a"));					//9 (마지막a)
		
		System.out.println(str.replace("a","0")); 				//문자열에 있는 모든a바꿈	 cf.자바스크립트-앞의a만바꿈
		System.out.println(str.replaceAll("[a-z]", "0"));		//[a-z]:정규표현식(문자열의 패턴 지정). 소문자a-z
		
		System.out.println(Arrays.toString(str.split(" ")));	//공백 하나를 기준으로 나눔 [abc, abc, , abc] : 공백 두개라서
		System.out.println(Arrays.toString(str.split(" +")));	//+ : 정규표현식 특수한 문자. +앞의 공백이 하나 이상. 하나 이상이면 하나로 취급
			
		System.out.println(str.startsWith("a")); 				//true (문자열이 주어진 파라미터인 a로 시작하는지)
		System.out.println(str.startsWith("b")); 				//false
		
		System.out.println(str.endsWith("c"));					//true (문자열이 주어진 파라미터인 c로 끝나는지)
		System.out.println(str.endsWith("b"));					//false
		
		System.out.println(str.toUpperCase());					//대문자로 변환
		System.out.println(str.toLowerCase());					//소문자로 변환
		
		
		
		
		String str2 = " abc abc ";
		System.out.println(str2);
		System.out.println(str2.trim());						//앞뒤 공백 제거. 회원가입때 많이 사용
		
		
	}

}
