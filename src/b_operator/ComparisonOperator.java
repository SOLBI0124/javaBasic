package b_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * << 비교연산자 >>
		 * - <  : 작다
		 * - >  : 크다
		 * - <= : 작거나 같다
		 * - >= : 크거나 같다
		 * - == : 같다
		 * - != : 같지않다
		 */
		
		boolean b = 10 < 20; //비교연산자의 연산결과는 boolean 이다.
		//boolean b = true; //연산결과
		System.out.println(b); //결과가 참이면 true
		b = 10 < 20 - 15; //산술연산 후 비교연산을 수행한다.
		System.out.println(b); //결과가 거짓이면 false
		
		b = 10 <= 10.0; //(double)10 <= 10.0
		//이항 연산자는 타입을 일치시킨 후 연산한다.
		System.out.println(b);
		b= 65 >= 'B'; //65 >= (int)'B'
		System.out.println(b);
		
		b = 10.0f == 10.0; //같다
		System.out.println(b); //true
		b = 10.1f == 10.1; //다르다, float(7자리)과 double(15자리)은 정확한값표현X, 값의 근사치
		System.out.println(b); //false
		System.out.printf("%21.20f%n", 10.1f);
		System.out.printf("%21.20f%n", 10.1);
		
		//float과 double은 정밀도가 달라 float을 double로 형변환하면
		//소수점을 정확하게 비교할 수 없다.
		System.out.printf("%21.20f%n", (double)10.1f);
		System.out.printf("%21.20f%n", (float)10.1);
		
		//double을 float으로 형변환해야 정확하게 비교할 수 있다.
		b = 10.1f == (float)10.1;
		System.out.println(b);
		
		//대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만
		//등가비교는 모든 타입을 비교할 수 있다.
		b = 'A' == 65;
		System.out.println(b);
		b = true != false;
		System.out.println(b);
		
		b="abc" == "abc"; //참조형 타입:값이 들어있는게 아니라 주소가 들어있음, 주소비교함
		System.out.println(b); //같은 스트링 리터럴은 같은 주소를 갖는다.
		b = "abc" == new String("abc"); //new는 새로운 주소를 생성한다.
		System.out.println(b);
		//참조형 타입은 저장된 메모리 주소를 비교하기 때문에
		//String은 등가비교 연산자로 내용을 비교할 수 없다.
		
		b = "abc".equals(new String("abc")); //equals를 사용하면 String의 내용을 비교할 수 있다. .은 참조연산자
		System.out.println(b);
		b = !"abc".equals("ABC"); //같지않다의 결과를얻기 위해서는 !(NOT)을 앞에 붙여준다.
		System.out.println(b);
		
		//sysout + c + space = System.out.println();
		
		//다음의 문장을 코드로 표현해주세요.
		//1보다 2가 크다.
		//0은 100보다 작거나 같다.
		//3.14f와 3.14는 같지 않다.
		//"남자"와 "여자"는 다르다.
		
		boolean a = 1 < 2;
		System.out.println(a);
		a = 0 <= 100;
		System.out.println(a);
		a = 3.14f != (float)3.14;
		System.out.println(a);
		a = !"남자".equals("여자");
		System.out.println(a);	
		
		
	}

}
