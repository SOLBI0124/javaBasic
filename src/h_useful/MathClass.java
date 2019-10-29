package h_useful;

public class MathClass {

	public static void main(String[] args) {
		/*
		 * round()	: 반올림
		 * ceil()	: 올림
		 * floor()	: 내림
		 * abs()	: 절대값
		 * random()	: double 난수 발생 (0.0 ~ 1.0미만)
		 */

		
		double d1 = 0.5;
		double d2 = -0.5;
		
		System.out.println(Math.round(d1));	//1	long타입반환(첫째자리에서 반올림)
		System.out.println(Math.round(d2));	//0	
		
		System.out.println(Math.ceil(d1));	//1.0	double타입반환 (첫째자리아니여도 올림)
		System.out.println(Math.ceil(d2));	//-0.0
		
		System.out.println(Math.floor(d1));	//0.0	double타입반환 (첫째자리아니여도 내림)
		System.out.println(Math.floor(d2));	//-1.0
		
		System.out.println(Math.abs(d1));	//0.5
		System.out.println(Math.abs(d2));
	
		for(int i = 0; i<20; i++){
			int random = getRandom(10,5);
			System.out.print(random + " ");
		}
	}
	
	private static int getRandom(int from, int to){		//int타입 파라미터 사이의 두값을 랜덤하는 랜덤메서드
		return (int)(Math.random()*(Math.abs(to-from)+1)) + Math.min(from, to);
		//			 Math.random()*6 + 5 : 5에서 10까지의 랜덤값
	}

}
