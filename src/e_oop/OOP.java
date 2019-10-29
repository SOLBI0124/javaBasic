package e_oop;

public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * <<객체지향 프로그래밍>> 
		 * 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것.
		 * 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * <<객체 생성(인스틴스화)>>
		 * 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓는것.
		 * new 클래스명(); -> 객체가 저장된 메모리 주소 반환.
		 * 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * 객체는 생성될때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 * 		 
		 */
		
		SampleClass sc= new SampleClass(); //객체생성: new+클래스명 ():생성자/(클래스를 메모리에 올림, 객체가 저장된 메모리 주소 반환)/sc변수에 저장
		
		sc.method1();
		
		sc.method2(10);
		
		String returnString = sc.method3();
		System.out.println(returnString);//string타입의 결과물 돌려받음
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		sc.test1();
		
		
		System.out.println();
		ClassMaker cm = new ClassMaker();
		
		cm.a();								//리턴타입x,파라미터x
		
//		int returnb =  cm.b();
		System.out.println(cm.b());			//리턴타입o,파라미터x
		
		
		cm.c("abc");						//리턴타입x,파라미터o
		
//		int returnd = cm.d(8,10);
//		System.out.println(returnd);
		System.out.println(cm.d(8, 12));	//리턴타입o,파라미터o
		
		
		
		
		Calculator c = new Calculator();
		
/*		double a1 = c.sum(123456,654321);
		System.out.println(a1);
		
		double a2 = c.multiple(a1,123456);
		System.out.println(a2);
		
		double a3 = c.divide(a2, 123456);
		System.out.println(a3);
		
		double a4 = c.minus(a3, 654321);
		System.out.println(a4);
		
		double a5 =c.remain(a4, 123456);
		System.out.println(a5);
	*/
		double result = c.sum(123456,654321);
		result = c.multiple(result, 123456);
		result = c.divide(result, 123456);
		result = c.minus(result, 654321);
		result = c.remain(result, 123456);
		System.out.println(result);
		
	
	
		SimLiTest st = new SimLiTest();
		
		st.q1();
		
		
		

	}
}

