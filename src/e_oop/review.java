package e_oop;

public class review {

	
	//리턴타입x,파라미터x
	void m1(){
		System.out.println("리턴타입파라미터둘다없음");
	}
	
	
	//리턴타입x,파라미터o
	void m2(int parameter){
		System.out.println(parameter);
	}
	
	//리턴타입o, 파라미터x
	String m3(){
		return "명령 수행 후 결과물을 돌려줌";
	}
	
	//리턴타입o, 파라미터o
	int m4(int a, int b){
		return a+b;
	}
	
	
}
