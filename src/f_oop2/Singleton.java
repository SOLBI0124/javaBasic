package f_oop2;

//싱글톤 패턴 : 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴
//***객체들 간에 클래스 전체를 공유하기 위해 사용한다.(객체 자체를 공유)

public class Singleton {

	private static Singleton instance;
	
	//생성자의 접근제어자를 private으로 만들어
	//다른 클래스에서 객체 생성하는 것을 막는다.
	private Singleton(){
		
	}
	
	//static : 객체생성없이 사용위해
	public static Singleton getInstance(){
		if(instance == null){				//첫번째 getInstace에는null -> 생성
			instance = new Singleton();		
		}
		return instance;					//두번째부터는 그대로 return
	}
	
}
