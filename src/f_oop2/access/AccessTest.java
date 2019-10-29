package f_oop2.access;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {	//상속받음.

	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();	//AccessModifier는 다른 클래스에있기 때문에 import로 위치 알려줌
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);	//같은패키지아니고, 상속받은 클래스 아니여서
//		am.protectedMethod();					//밖에서(객체를 통해서) 접근했기때문에 상속받아도 main에서는 사용불가
	}

	void protectedTest(){			
		System.out.println(protectedVar);	//상속받으면 사용가능
		proctedMethod();

/*		
		System.out.println(defaultVar);		//
		defaultMethod();
		
		System.out.println(privateVar);		//
		privateMethod();
*/	
	}
	
	
}
