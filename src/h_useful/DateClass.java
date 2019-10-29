package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date today = new Date();	//현재 날짜
		System.out.println(today);
		
		//날짜 -> 포멧(SDF) -> 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); 			//MM:월, mm:분
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss");			//HH:24시간기준, hh:12시간기준
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd hh:mm:ss a");	//a:오전,오후
		
		String format = sdf1.format(today);	//지역변수로 저장
		System.out.println(format);
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		
		//문자열 -> 포멧 -> 날짜
		String str ="2019년 10월 16일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date dateStr = sdf5.parse(str);			//예외처리 try-catch
			System.out.println(dateStr);			//Wed Oct 16 00:00:00 KST 2019
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		Calendar cal = Calendar.getInstance();		//객체반환메서드.싱글턴패턴
		
		//날짜셋팅
		cal.setTime(new Date());
		cal.set(2019, 9, 16);							//2019년 10월 16일(월은 0부터 시작)
		System.out.println(sdf3.format(cal.getTime()));	//2019-10-16 11:33:53 (16일셋팅)
		
		//날짜계산
		cal.add(Calendar.YEAR, 1);						//연도를 1증가
		cal.add(Calendar.MONTH, 2);						//월을 2증가
		cal.add(Calendar.DAY_OF_MONTH, -3);				//일을 3감소
		cal.add(Calendar.HOUR, 2);						//시간 2시간 증가
		cal.add(Calendar.MINUTE, 5);					//분 5분 증가
		cal.add(Calendar.SECOND, -10);					//초 10초 감소
		
		System.out.println(sdf3.format(cal.getTime()));	//2020-12-13 13:38:43
		
		
		
	}

}
