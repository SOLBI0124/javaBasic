package f_oop2.ex_abstract.ex_Interface;

public class Starcraft {

	public static void main(String[] args) {
		
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		SCV scv = new SCV();
		
//		scv.repair(marine);		//Repairable상속받지 않아서 에러
		scv.repair(tank);
		scv.repair(dropship);
		scv.repair(scv);
	}

}

class Unit{
	int hp;				//현재 체력
	final int MAX_HP;	//최대 체력
		
	Unit(int hp){
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{	//부모클래스 생성자에 파라미터있어서 에러
	Marine(){
		super(40);
	}
}

class Tank extends Unit implements Repairable{	//Repairable 인터페이스를 상속

	Tank() {
		super(150);
	}
}

class Dropship extends Unit implements Repairable{

	Dropship() {
		super(125);
	}
}

class SCV extends Unit implements Repairable{
	SCV(){
		super(60);
	}
	
	void repair(Repairable r){	//파라미터로 Repairable타입을 넘겨줌
		//Repairable인터페이스를 상속받게 함으로써 수리가 가능한 유닛을 구분했다.
		//그러나 Repairable에는 멤버가 없기 때문에 아무것도 할 수 없다.
		//hp를 멤버로 가진 Unit으로 형변환을 해줘야 한다.
		if(r instanceof Unit){	//Repairable의 인스턴스가 Unit의 인스턴스인지 확인/ r이 Unit으로 형변환이 가능한지 확인(instanceof)
			Unit u = (Unit) r;	//맞으면 형변환
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}
}


interface Repairable{
	
}

