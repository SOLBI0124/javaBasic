package f_oop2.ex_abstract;

public abstract class Animal {

	
	void run(){
		System.out.println("달려간다~~~~");
	}
			
	abstract void bark();	//추상메서드
}




class Dog extends Animal{	//상속받을 클래스 , run메서드와 bark메서드 가짐

	//추상메서드를 오버라이딩
	@Override
	void bark() {
		System.out.println("멍멍!!");	
	}	
}

class Cat extends Animal{

	@Override
	void bark() {
		System.out.println("야옹♥");
	}	
}

class Pig extends Animal{

	@Override
	void bark() {
		System.out.println("꿀꿀");	
	}	
}