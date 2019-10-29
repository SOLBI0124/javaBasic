package e_oop;

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * << *****static >>
		 * 
		 * 객체 생성 없이(인스턴스화없이) 변수나 메서드를 사용하기 위해 붙인다.
		 * 객체들간에 변수의 값을 공유하기 위해 붙인다.
		 * static이 붙은 것 : 클래스 변수, 클래스 메서드
		 * static이 붙지 않은 것 : 인스턴스 변수, 인스턴스 메서드
		 * 
		 */
		
		
		//ClassMember참고
		//static이 붙은 메서드
		Math.random();	//random이란 메서드에 static이 붙어있음.
		System.out.println();
		
		
		System.out.println(ClassMember.classVariable);  //클래스 변수 (static o) < 클래스명 + . > /객체생성하지않아도 됨
		ClassMember.classMethod();						//클래스 메서드 (static o)
		
		ClassMember cm1 = new ClassMember(); 		//객체생성1
		System.out.println(cm1.instanceVariable);   //인스턴스변수
		cm1.instanceMethod(); 						//인스턴스 메서드
		
		
		
		System.out.println(cm1.classVariable); //객체를 통해서도 클래스 멤버에 접근 할 수 있지만 좋은 방법은 아님/ 클래스명. 으로 접근해야
		cm1.classMethod();
		
		
		
		ClassMember cm2 = new ClassMember(); //객체생성2
		
		//변경 전
		System.out.println("cm1 : " + cm1.instanceVariable);
		System.out.println("cm2 : " + cm2.instanceVariable);
		
		//변경
		cm2.instanceVariable = "변경한 값";
		
		//변경 후
		System.out.println("cm1 : " + cm1.instanceVariable);
		System.out.println("cm2 : " + cm2.instanceVariable);
		
		
		
		//클래스 변수 변경 전
		System.out.println("cm1 : " + cm1.classVariable); //객체통해 접근
		System.out.println("cm2 : " + cm2.classVariable);
		
		//변경
		cm2.classVariable = "변경한 값";
		
		//변경 후
		System.out.println("cm1 : " + cm1.classVariable);
		System.out.println("cm2 : " + cm2.classVariable); //cm1,cm2 둘다 값이 변경됨, static이 변수의 값을 공유하고 있음
	}

}
