package f_oop2;

public class SampleChild extends SampleParent {	//자식클래스 + extends + 물려받고싶은 클래스명 
//												: 아무내용없어도 부모클래스(Object클래스 포함)에있는 변수와 메서드 가지고있음
	
	
	int var;	//부모클래스에 있는 변수와 같은 이름의 변수 사용가능. 타입 달라도 상관없음
	
	SampleChild(){
		super();	//생성자에서 부모클래스 생성자 호출하기 위해 사용. 자식클래스 생성자에 생략되어있음
	}
	
	void test(double var){
		System.out.println(var);		//지역변수
		System.out.println(this.var);	//인스턴스변수(전역변수=멤버변수)
		System.out.println(super.var);	//부모클래스의 인스턴스 변수
										//super : 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될때
										//		   둘을 구분하기 위해 사용
		
		System.out.println(this.method(10, 20));	//오버라이딩한 자식클래스 메서드 사용
		System.out.println(super.method(10, 20));	//부모클래스 메서드 사용
	}
	

	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);	//상속받은 변수
		int result = method(7,13);	//상속받은 메서드
		System.out.println(result);
	}
	
	
	//main + ctrl+스페이스
	public static void main(String[] args) {	
		
		SampleChild sc = new SampleChild();		//childMethod사용을 위해 객체생성해야함. sc변수통해 메서드에 접근
		sc.childMethod();
		
		System.out.println(sc.var);		
		int result = sc.method(7, 13);	//메서드 (멤버함수)
		System.out.println(result);
		
		sc.test(10);
		
							//SampleParent형변환 생략되어있음(자식->부모 형변환 : Up-casting, 생략가능)
		SampleParent sp = (SampleParent)new SampleChild();	//타입은 부모타입, 객체는 자식타입으로 타입 다르게 할 수 있음	
															//타입이 부모타입이기 때문에 부모타입에 있는 멤버만사용가능
		System.out.println("sp.var : " + sp.var);	//부모클래스에 있는 변수 불러옴
		System.out.println("sc.var : " + sc.var);	//자식클래스에 있는 변수 불러옴
		System.out.println("sp.method() : "+ sp.method(5, 10));	//메서드는 오버라이딩 했기 때문에 부모클래스에서 호출하더라도 부모클래스 메서드는 무시됨.
		System.out.println("sc.method() : "+ sc.method(5, 10));	//오버라이딩한 메서드만 사용가능.
		
		//자식타입 멤버 사용하고싶으면 형변환(부모->자식 형변환 : Down-casting, 생략불가)
		SampleChild s = (SampleChild)sp;
		s.test(10);			//이제 호출가능
		s.childMethod();
	}
	
	
	//상속받은 메서드를 변경하고 싶을때 오버라이딩 할 수 있다.
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것.
	@Override //어노테이션. 오버라이딩한 메서드임을 알려줌
	int method(int a, int b){	//리턴타입, 메서드명, 파라미터 모두 같아야한다. 내용만 다름
		return a * b;			//부모타입 메서드 무시, 자식타입에서 오버라이딩한 메서드 실행됨
	}
}
