package z_exam;

public class Exam07_answer {

	
	
//7-3 오버라이딩 정의	: 상속받은 메서드의 내용을 재정의하는것
//			  필요성: 상속받은 메서드를 자손 클래스 자신에 맞게 변경해야하는 경우가 많기때문에 
//					그럴경우 조상의 메서드를 오버라이딩 함
	
	
//7-4 오버라이딩 c,d
/*
	a,b o 이름, 매개변수, 리턴 타입 모두 같아야 함
	c.	x 접근 제어자는 조상의 메서드보다 넓은 범위로만 변경할 수 있다.
	d.	x 없다. */
	
//7-5 Product클래스에 기본 생성자 Product()가 없기 때문에 에러
	
	
//7-6	자손 클래스 인스턴스가 조상 클래스의 멤버 사용할때 
//		조상클래스의 멤버를 초기화 해야하기때문에
	
//7-7	Child() → Child(int x) → Parent() → Parent(int x) → Object()
		/*자식 클래스 생성자의 첫줄에는 반드시 super();로 부모클래스 호출해야함.
	 	없으면 컴파일러가 자동으로 추가한다. 
	 	super는 this가 없는 생성자에 들어감.
	 	Child클래스의 조상은 Parent이므로 super()는 Parent()를 의미*/
	
//7-8	a	
/*		public 	접근제한없음
		protected 같은 클래스+[같은 패키지 or 상속받으면]
		default 같은 클래스 + [같은 패키지]
		private [같은 클래스]*/
	
//7-9	c
	  /*a.d o 지역변수, 멤버변수 : 값변경X
		b.	o 클래스 : 변경x.확장x , 다른 클래스의 조상 될 수 X
		c.	x 메서드 : 변경x(오버라이딩(메서드값변경)X)*/
	
//7-10	MyTv2 Class
//7-11  MyTv2 Class
	
//7-12 c.x 접근 제어자가 사용될 수 있는 곳 - 클래스, 멤버변수, 메서드, 생성자(지역변수x)
		
//7-13  math클래스는 메서드와 상수로만 구성. 
//		객체를 생성할 필요 없어서 외부로부터의 불필요한 접근을 막기 위해
	
//7-15	자식->부모 형변환 생략 가능
//		부모->자식 형변환 생략 불가
		/*
		a,b o u(부모) = (부모로 형변환 생략가능)ac(자식)
		c. 	o Unit을 상속받은 클래스 = uNIT
		d.	o airunit = airunit을 상속받은 ac 
		e.  x 부모 = (부모->자식 : 생략불가)자식
		*/
		
//7-16	e

		
//7-17	
/*	
	abstract class Unit{
		int x, y;
		abstract void move(int x, int y);
		void stop()
	}
	
	class Marine extends Unit { 					// 보병
//		int x, y; 					// 현재 위치
		void move(int x, int y) 	//{  지정된 위치로 이동  }
//		void stop() 				//{  현재 위치에 정지 }
		void stimPack() 			//{  스팀팩을 사용한다.}
	}
	
	class Tank extends Unit { 				// 탱크
//		int x, y;				 // 현재 위치
		void move(int x, int y) //{ 지정된 위치로 이동  }
//		void stop()				// {  현재 위치에 정지 }
		void changeMode() 		//{  공격모드를 변환한다. }
	}
	
	class Dropship extends Unit { 			// 수송선
//		int x, y; 				// 현재 위치
		void move(int x, int y) //{  지정된 위치로 이동  }
//		void stop() 			//{  현재 위치에 정지 }
		void load() 			//{  선택된 대상을 태운다. }
		void unload() 			//{  선택된 대상을 내린다. }
	}
		*/
		

//7-20	p.x=100-> Child Method-> c.x=200 -> Child Method
		/*
		메서드는 참조변수(p,c)에 관계없이 항상 Child클래스에 정의된 메서드 호출
		x(인스턴스변수)는 참조변수의 타입에 따라 달라진다.
		*/
		
//7-24 e.x
	
}
