package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 ***잘 사용할 수 있어야함
		 *add()		: 마지막 위치에 객체를 추가
		 *get()		: 지정된 위치의 객체를 반환
		 *set()		: 지정된 위치에 주어진 객체를 저장(수정)
		 *remove()	: 지정된 위치의 객체를 제거.0인덱스를 제거하면 1인덱스 값이 0인덱스로 옴
		 *size()	: 저장된 객체의 수 반환
		 */

		ArrayList<Object> list = new ArrayList<Object>();	//Object타입. 모든 클래스의 부모클래스이기때문에 모든 타입 가능
		
		list.add(10);	
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abc");		//0번인덱스
		list2.add("123");		//1번인덱스
		list2.add("가나다");
		
		list2.set(1, "456");	//1번인덱스를 456으로 수정
		
		for(int i = 0; i<list2.size(); i++){		//arraylist길이 : size()
			System.out.println(list2.get(i)); 		//메서드 불러옴
		}
		
		list2.remove(0);	//0번인덱스 값 삭제. 리스트에 저장된 값을 삭제하면 그뒤의 모든 값의 인덱스가 당겨진다.
		System.out.println(list2.get(0)); 	//1번인덱스 값이 0번 인덱스가 됨
		System.out.println(list2.get(1)); 	//2번인덱스 값이 1번 인덱스가 됨
		
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>();	//2차원배열. arraylist안에 arraylist저장
														
		//integer를 저장하는 arraylist
		ArrayList<Integer> list4 = new ArrayList<Integer>();	//첫번째 행
		list4.add(1);		//0번째 열
		list4.add(2);		//1번째 열
		
		list3.add(list4);	//2차원 배열의 첫번째 행에 [10,20]넣음
		
		//한 행 더 저장할때 매번 생성
		list4 = new ArrayList<Integer>();
		list4.add(3);		//2번째 행의 0번째열 
		list4.add(4);
		
		list3.add(list4);
		
		for(int i =0; i<list4.size(); i++){
		System.out.println(list3.get(i));
		}
		//정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어주세요.
		
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		list5.add(10);
		list5.add(20);
		list5.add(30);
		list5.add(40);
		list5.add(50);
		
		for(int i =0; i<list5.size(); i++){
			System.out.print(list5.get(i)+" ");
		}
		
		//위에서 만든 ArrayList에 담긴 값들의 합계와 평균을 출력해주세요 
		System.out.println();
		
		int sum =0;
		double avg = 0;
		
		for(int i =0; i<list5.size(); i++){
			sum += list5.get(i);
		}
		avg = (double)sum/list5.size();
		System.out.println("합계 : "+sum+", 평균 : "+avg);
		
		//위에서 만든 ArrayList에 담긴 값 중 최소값과 최대값을 출력해주세요.
		int max = list5.get(0);
		int min = list5.get(0);
		for(int i =0; i<list5.size(); i++){
			if(max<list5.get(i)){
				max = list5.get(i);
			}
			if(min>list5.get(i)){
				min = list5.get(i);
			}
		}System.out.println("최대값 : "+max+", 최소값 : "+min);
	}
		

}
