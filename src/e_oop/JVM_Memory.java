package e_oop;

public class JVM_Memory {
	
	/*
	 * << JVM 메모리 구조 >>
	 * Method Area : *클래스*가 저장된다. 클래스 멤버 저장
	 * Call Stack : *현재 호출되어(실행되고) 있는 메서드*가 저장된다.
	 * Heap : *객체*가 저장된다. 인스턴스 멤버 저장
	 * 
	 * 운영체제 -> 프로그램
	 * 운영체제 -> JVM -> 프로그램  : java로 만들어진 프로그램.속도가 느리다는 단점/운영체제가 달라져도 JVM만 달라지고 하나의 코드로 여러 운영체제에서 가능
	 * 
	 */
	
	/*
	 * <<Method Area>>
	 *  Static이라는 클래스 저장
	 *  Math
	 *  System
	 *  PrintStream
	 *  ClassMember : classVariable , clasMethod(static o)
	 * 
	 * <<Call Stack>>
	 *  main() : cm1(메서드에 포함된 지역변수, 객체의 주소값)
	 *  random() : 실행 후 삭제
	 *  println() : 실행 후 삭제
	 *  println() : 실행 후 삭제
	 *  println() : 실행 후 삭제
	 * 
	 * <<Heap>>
	 *  cm1 = new ClassMember() : instanceVariable, instanceMethod()
	 * 	cm2 = new ClassMember() : instanceVariable, instanceMethod()
	 * 
	 * */

}
