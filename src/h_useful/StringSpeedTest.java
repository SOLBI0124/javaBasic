package h_useful;

public class StringSpeedTest {

	public static void main(String[] args) {
/*		String str = "a";
		
		long start = System.currentTimeMillis();	//현재시간을 밀리세컨단위로 표현
		for(int i = 0; i < 200000; i++){
			str += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");*/
		
		
		StringBuffer sb = new StringBuffer("a");	//문자열 많이 변경할때
		
		long start = System.currentTimeMillis();
		for(int i = 0; i<200000; i++){
			sb.append("a");				//.append() : += "a" (문자열을 뒤에 계속 붙임)
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
		
		
	}

}
