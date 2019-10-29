package f_oop2.ex_abstract.ex_Interface;

public interface SampleInterface {	//Interface는 상수와 추상메서드 가질 수 있음, 다중상속 가능
	
	//인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야한다.
	public static final int NUM1 = 1;
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다.
	int NUM2 = 2;	//상수
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야 한다.
	public abstract void method1();
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다. 보통은 생략해서 사용
	void method2();
}

interface SampleInterface2{
	void method1();	//추상메서드, 메서드 이름 중복
	void method3();
}


//인터페이스는 메서드에 내용이 없기 때문에 메서드명이 중복되어도 구분할 필요가 없다.
//그러므로 다중상속이 가능하다.
class SampleImplement implements SampleInterface, SampleInterface2{

	//추상메서드 오버라이딩
	@Override
	public void method1() {
		System.out.println(NUM1);
		
	}

	@Override
	public void method2() {
		System.out.println(NUM2);
		
	}

	@Override
	public void method3() {
		
	}
	
}