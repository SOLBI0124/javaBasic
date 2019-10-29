package f_oop2;

public class SampleParent extends Object { //부모클래스
//											아무것도 상속받지 않는 클래스는 
//											전부 Object라는 클래스 (모든클래스의 조상,모든 클래스에 필요한 변수와 메서드 가지고있음) 상속받음
//											안적어도 자동으로 들어감
	String var;					//변수 : 상속o
	
	{
		var = "초기화 블럭은 물려주지 않는다.";
	}
	
	SampleParent(){
		var = "생성자도 물려주지 않는다.";
	}
	
	int method(int a, int b){
		return a+b;
	}
}
