package i_collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * put()	: 지정된 키와 값을 저장(파라미터 두개:키,값. 타입상관없음)
		 * get()	: 지정된 키의 값을 반환(없으면 null)
		 * remove()	: 지정된 키로 저장된 값을 제거
		 * keySet()	: 지정된 모든 키를 Set으로 반환
		 */

		
		HashMap<String, String> map = new HashMap<String, String>();	//타입 지정하면 해당 타입만 . 보통 String. 객체(클래스?)만 저장가능
		
		map.put("title", "제목입니다.");									//title이라는 키로 제목입니다라는 값을 저장
		map.put("content", "내용입니다.");
		map.put("user", "김승섭");
		map.put("date", "2019-10-16 09:29");
		
		System.out.println(map.get("title"));						//get이라는 메서드에 파라미터로 key넣어줌->출력
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user", "홍길동");	//동일한 key로 값 한번더 저장하면 덮어쓰게됨. 기존값 사라짐
									//1개의 key에 여러개의 값을 저장할 수 없다
		System.out.println(map.get("user"));
		map.put("user", "이순신");
		System.out.println(map.get("user"));
		
		map.remove("user");						//키와 값을 삭제 ->null출력
		System.out.println(map.get("user"));
		
		
		//map에 저장된 모든 내용 출력
		Set<String> keys = map.keySet();				//Set에 key들이 전부 저장
		for(String key : keys){							//향상된 for문: keys를 key에 저장하면서 돌림
			String value = map.get(key);				//(get 메서드로 받은 key=값)을 value에 넣어줌
			System.out.println(key + ":" + value);
		}		
	}

}
