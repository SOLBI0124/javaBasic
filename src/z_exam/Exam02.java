package z_exam;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*[2-1] 다음 표의 빈 칸에 개의 기본형 을 알맞은 자리에 넣으시오 8 (primitive type) .
	       *
	       *       1byte   2byte   4byte   8byte
	       * 논리형   boolean
	       * 문자형               char
	       * 정수형      byte    short   int      long
	       * 실수형                             float   double
	       * 
	       */

	      
	      /*
	       *[2-2] 주민등록번호를 숫자로 저장하고자 한다 이 값을 저장하기 위해서는 어떤 자료형
	       *(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
	       *초기화 하는 한 줄의 코드를 적으시오.
	       *
	       *   long regNo = 950124;
	       *
	       */
	      
	      
	      /*
	       * [2-3] 다음의 문장에서 리터럴 변수 상수 키워드를 적으시오.
	       * 
	       * int i = 100;
	       * long l = 100L;
	       * final float PI = 3.14f;
	       * 
	       * 리터럴 : 100, 100L, 3.14f
	       * 변수 : i, l
	       * 키워드 : int, long, final, float
	       * 상수 : PI
	       * 
	       */
	      
	      
	      /*
	       * [2-4] 다음 중 기본형 이 아닌 것은? b (대문자-클래스명)
	       * 
	       * a. int
	       * b. Byte
	       * c. double
	       * d. boolean
	       * 
	       */
	      
	      
	      /*
	       * [2-5] 다음 문장들의 출력결과를 적으세요 오류가 있는 문장의 경우 괄호 안에 오
	       * 류 라고 적으시오.
	       * 
	       * System.out.println(“1” + “2”) → ( 12 ) 
	       * System.out.println(true + “”) → ( true ) 
	       * System.out.println(‘A' + 'B') → ( 131 ) 
	       * System.out.println('1' + 2) → ( 51 ) 
	       * System.out.println('1' + '2') → ( 99) 
	       * System.out.println('J' + “ava”) → ( Java ) 
	       * System.out.println(true + null) → ( 오류 )
	       * 
	       */
	      
	      
	      /*
	       * [2-6] 다음 중 키워드(예약어)가 아닌 것은?(모두 고르시오) b,c,d,e
	       * 
	       * a. if
	       * b. True
	       * c. NULL
	       * d. Class
	       * e. System
	       * 
	       */
	      
	      
	      /*
	       * [2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은?(모두 고르시오) a,d,e,g
	       * 
	       * a. $ystem
	       * b. channel#5 (특수문자)
	       * c. 7eleven (숫자맨처음)
	       * d. If
	       * e. 자바
	       * f. new (예약어)
	       * g. $MAX_NUM
	       * h. hello@com (특수문자)
	       * 
	       */
	   
	      
	      /*
	       * [2-8] 참조형 변수(reference type)(4byte) 와 같은 크기의 기본형(primitive type)
	       * 은?(모두 고르시오)a,d
	       * 
	       * a. int
	       * b. long
	       * c. short
	       * d. float
	       * e. double
	       * 
	       */
	      
	      
	      /*
	       * [2-9] 다음 중 형변환을 생략할 수 있는 것은?(모두 고르시오)a,b,c,d
	       * 
	       * byte b = 10;
	       * char ch = 'A';
	       * int i = 100;
	       * long l = 1000L;
	       * 
	       * a. b=(byte)i;
	       * b. ch=(char)b; 표현범위가 중요. byte(-128~127)/ch(0~65000)-128표현불가. 표현범위가 다름. 서로를표현불가
	       * c. shorts=(short)ch; 같은2byte지만표현범위다름
	       * d. float f=(float)l; float가 byte작지만 표현범위가 더 커서 생략가능
	       * e. i=(int)ch; int가 표현범위 훨씬 큼
	       */
	      
	      
	      /*
	       * [2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는?(10진수로 적으시오)
	       * 
	       * 0 ~ 65535
	       * 
	       */
	      
	      
	      /*
	       * [2-11] 다음중 변수를 잘못 초기화 한 것은?(모두 고르시오)a,b,c,d
	       * 
	       * a. byte b = 256; 127까지만 표현가능
	       * b. char c = '';  char는 반드시 한개의 문자를넣아야함
	       * c. char answer = 'no'; 한개의 문자만 표현
	       * d. float f = 3.14;     3.14f
	       * e. double d = 1.4e3f;
	       * 
	       * 
	       */
	      
	      
	      /*
	       * [2-12] 다음 중 메서드의 선언부로 알맞은 것은?(모두 고르시오) 패스
	       * 
	       * a. public static void main(String[] args)
	       * b. public static void main(String args[])
	       * c. public static void main(String[] arv)
	       * d. public void static main(String[] args)
	       * e. static public void main(String[] args)
	       * 
	       */
	      
	      
	      /*
	       * [2-13] 다음 중 타입과 기본값이 잘못 연결된 것은?(모두 고르시오)c,e,f
	       * 
	       * a. boolean - false
	       * b. char - '\u0000'
	       * c. float - 0.0           0.0f
	       * d. int - 0
	       * e. long - 0              0L
           * f. String - ""           null 모든참조형타입 
	       * 
	       */
	}

}
