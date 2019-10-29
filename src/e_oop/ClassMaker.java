package e_oop;

public class ClassMaker {
	
	
	int field = 10; //전역변수
	
	void a(){	//리턴타입x(void),파라미터x
		System.out.println(field);
	}
	
	int b(){	//전역변수와 동일한 리턴타입, 파라미터x
		return field;	//전역변수o return
	}
	
	void c(String str){	//리턴타입x,파라미터o
		System.out.println(str);
	}
	
	int d(int a, int b){ //int타입의 리턴타입o, 파라미터 두개
		return a*b;
	}
	
	
	
	
}
