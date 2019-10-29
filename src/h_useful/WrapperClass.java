package h_useful;

import java.util.Vector;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스 	: 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		 * 
		 * boolean	: Boolean
		 * char		: Character//
		 * byte		: Byte
		 * short	: Short
		 * int		: Integer//
		 * long		: Long
		 * float	: Float
		 * double	: Double
		 */
		
		int i = 10;
		Integer iw = new Integer(20);	//wrapper클래스는 기본형 타입과 객체(참조형타입) 연산가능
		
		System.out.println(i + iw);
		
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		
		System.out.println(i + Integer.parseInt("20"));	//30 문자열을 int타입으로 형변환
		
		System.out.println(i + String.valueOf(20));	 	//1020 숫자인타입을 문자열로 바꿈 10+"20"
		
		System.out.println(i + Integer.valueOf("20"));	//30
		
		
		Vector<Integer> v = new Vector<Integer>();	//저장할 타입을 지정
		
		v.add(new Integer(10));
		v.add(10);					//오토박싱 : 기본형 타입이 wrapper클래스로 자동 변환. 형변환생략되어있음
		
		Integer integer = v.get(0);	//0번인덱스에 저장되어있는 값 가져올때
		int i2 = v.get(0);			//언박싱 : wrapper클래스가 기본형 타입으로 자동 변환. 형변환생략되어있음
		
	}

}
