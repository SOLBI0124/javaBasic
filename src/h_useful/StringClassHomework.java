package h_useful;

import java.util.Arrays;

public class StringClassHomework {

	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		System.out.println(s1);
		
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(c);
		System.out.println(s2);
		
		//StringBuffer() : StringBuffer인스턴스가 갖고있는 문자열과 같은 내용의 String인스턴스를 생성
		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);
		System.out.println(s3);
		
		//.charAt() : 지정된 위치에 있는 문자 알려줌
		String s = "Hello";
		String n = "0123456";
		char c1 = s.charAt(1);
		char c2 = n.charAt(1);
		System.out.println(c1);		//1인덱스 위치에 있는 문자 : e
		System.out.println(c2);		//1인덱스 위치에 있는 숫자 : 1
		
		//int compareTo(String str)
		//문자열과 사전순으로 비교
		int i = "aaa".compareTo("aaa");		//같으면 0
		int i2 = "aaa".compareTo("bbb");	//-1(사전순 이전이면 음수)
		int i3 = "bbb".compareTo("aaa");	//1	(사전순 이후면 양수)
		
		//.concat()
		String s4=s.concat(" World");
		System.out.println(s4); 			//s4+s5
		
		//.contains()
		String s5 = "abcdef";
		boolean b =s5.contains("bc");		//s6에 "bc"가 포함되어있으면 true
		System.out.println(b);
		
		//.endsWith() : 지정된 문자열로 끝나는지 여부
		String file = "HEllo.txt";
		boolean b1 = file.endsWith("txt");
		System.out.println(b1);
		
		//.equals() : 문자열 내용 같은지 비교
		boolean b2 = s.equals("Hello");		//true
		boolean b3 = s.equals("hello");		//false
		System.out.println(b2+","+b3);
	
		//.equalsIgnoreCase() : 문자열 내용 대소문자 구분없이 비교
		boolean b4 = s.equalsIgnoreCase("Hello");		//true
		boolean b5 = s.equalsIgnoreCase("hello");		//true
		System.out.println(b4+","+b5);
		
		//.indexOf() : 몇번째 인덱스에 있는지 문자의 위치 반환. 
		int idx1 = s.indexOf('o');	//4
		int idx2 = s.indexOf('k');	//-1 (없으면 -1반환)
		
		//.indexOf(int ch, int pos) : 몇번째 인덱스에 있는지 지정된 위치(pos)부터 확인하여 문자의 위치 반환. 
		int idx3 = s.indexOf('e',0);	//(e찾을때 0번째 인덱스부터 찾아라) 4
		int idx4 = s.indexOf('e',2);	//(e찾을때 2번째 인덱스부터 찾아라) -1(없음)
		
		//.indexOf(String) : 주어진 문자열이 몇번째 인덱스에 있는지 위치 반환
		String s6 ="ABCDEFG";
		int idx5 = s6.indexOf("CD");	//2
		
		//.intern()
		String s7 = new String("abc");
		String s8 = new String("abc");
		boolean b6 = (s==s2);							//true
		boolean b7 = s7.equals(s8);						//true
		boolean b8 = (s7.intern() == s8.intern());		//true
		
		//.lastIndexOf(int ch)
		String s9 = "java.lang.Object";
		int indx6 = s9.lastIndexOf('.');	//9
		int indx7 = s9.indexOf('.');		//4
		
		//.lastIndexOf(String str)
		String s10 = "java.lang.java";
		int indx8 = s10.lastIndexOf("java");	//10
		int indx9 = s10.indexOf("java");		//0
		
		//.length() : 문자열의 길이 반환
		int length = s.length();		//5
		
		//.replace()
		String s11 = s.replace('H','C');		//Cello H를C로 바꿈
		String s12 = s.replace("ll", "LL");		//heLLoLLo
		
		
		//.replaceAll() : 지정된 문자열과 일치하는 것 모두 변경
		String ab = "AABBAABB";
		String r = ab.replaceAll("BB", "bb");		//AAbbAAbb
		System.out.println(r);
		
		//.replaceFirst() : 지정된 문자열과 일치하는 것중 첫번째것만 변경
		String r2 = ab.replaceFirst("BB", "bb");	//AAbbAABB
		System.out.println(r2);
		
		//.split() : 문자열을 지정된 분리자(,)로 나눠 문자열 배열에 담아 반환
		String animals ="dog, cat, bear";			//[dog, cat, bear]
		String[] arr = animals.split(",");
		System.out.println(Arrays.toString(arr));
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		
		//문자열을 지정된 분리자(,)로 나눠 문자열 배열에 담아 반환하는데 
		//문자열 전체를 지정된 수(2개)로 자른다
		String[] arr2 = animals.split(",",2);		
		System.out.println(Arrays.toString(arr2));
		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr2[1] = " + arr2[1]);
		
		//.startsWith() : 주어진 문자열로 시작하는지 여부
//		String s9 = "java.lang.Object";
		boolean bb = s9.startsWith("java");		//true
		boolean bb2 = s9.startsWith("lang");	//false
		
		
		//.substring()
//		String s9 = "java.lang.Object";
		String cc = s9.substring(10);	//Object (10이상의 문자열)
		String p = s9.substring(5, 9); 	//lang	(5이상 9미만의 문자열)
		System.out.println(p);
		
		
		String ss1 = s.toLowerCase();	//hello
		String ss2 = s.toString();		//Hello(저장되어있는 문자열 반환)
		String ss3 = s.toUpperCase();	//HELLO
		
		//.trim() : 앞뒤공백제거
		String a ="   Hello World   ";
		String a1 = a.trim();
		
		
		//.valueOf() : 저장된값을 문자열로 변환하여 반환
		String b9 = String.valueOf(true);	//true(문자열)
		String c9 = String.valueOf('a');	//a(문자열)
		String i9 = String.valueOf(100);	//100(문자열)
		String l = String.valueOf(100L);	//100(문자열)
		String f = String.valueOf(10f);		//10.0(문자열)
		String d = String.valueOf(10.0);	//10.0(문자열)
		
		java.util.Date ddd = new java.util.Date();
		String date = String.valueOf(ddd);	//Tue Oct 15 16:17:22 KST 2019(문자열)
		
		System.out.println(date); 			
	}

}
