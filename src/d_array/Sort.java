package d_array;

import java.util.Arrays;


public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *<<정렬>>
		 * 선택정렬 : 첫번째 숫자부터 그 뒤의 모드 숫자들과 비교해서
		 * 			작은 수와 자리를 바꾸기를 반복해 앞에서부터 작은수를 채워나가는 방식 
		 * 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 
		 * 			작은수와 자리 바꾸기를 반복해 뒤에서부터 큰수를 채워나가는 방식
		 * 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 
		 * 			큰수들을 뒤로 밀고 중간에 삽입하는 방식
		 * 석차구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 
		 * 			자신의 점수가 작으면 1씩 증가시키는 방식
		 */
		
		int[] numbers = new int[10];
		
		for(int i=0; i<numbers.length; i++){
			numbers[i]=i+1;
			
		}
		shuffle(numbers);
		System.out.println(Arrays.toString(numbers));
		
		//printRank(numbers); //석차구하기
		//selectSort(numbers); //선택정렬
		//bubbleSort(numbers); //버블정렬
		insertSort(numbers); //삽입정렬

	}
	
	
	
	private static void insertSort(int[] numbers) {
		// TODO Auto-generated method stub 삽입정렬
		for(int i = 1; i<numbers.length; i++){
			int temp = numbers[i];					//i값 임시보관
			int j = 0;
			
			for(j = i - 1; j >= 0; j--){
				if(temp < numbers[j]){
					numbers[j+1]=numbers[j];
					
				}else{
					break;
				}
			}
			numbers[j+1] = temp;
		}System.out.println(Arrays.toString(numbers));		
}



	private static void bubbleSort(int[] numbers) {
		// TODO Auto-generated method stub 버블정렬
		for (int i = 0; i<numbers.length - 1 ; i++){
			boolean changed =false;	
			for(int j = 0; j<numbers.length - i - 1 ; j++){
				if(numbers[j] > numbers[j+1]){
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					changed = true;
				}
			}if(!changed){								//바뀌지 않았을때 break;
				break;
			}
		}
	}
	
	

	private static void selectSort(int[] numbers) {
		// TODO Auto-generated method stub 선택정렬
		int temp = 0;
		
		for(int i = 0; i<numbers.length; i++){
			for(int j = i+1; j<numbers.length; j++){
				if(numbers[i] > numbers[j]){
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}System.out.println(Arrays.toString(numbers));
	}



	private static void printRank(int[] numbers) {
		// TODO Auto-generated method stub 석차구하기
		
		
		int[] rank = new int[numbers.length];			//점수의 갯수만큼 등수를 채울 배열을 선언 및 초기화한다.
		
		for(int i = 0; i<rank.length; i++){
			rank[i] = 1;								//등수 배열을 1로 채운다.
		}
		
		for(int i = 0; i<numbers.length; i++){			//모든 점수를 비교할 수 있는 반복문을 만든다.
			for(int j=0; j<numbers.length; j++){
			if(numbers[j] > numbers[i]){				//등수를 구할 점수보다 큰 점수가 있는 경우 1을 증가시킨다.
				rank[i] += 1;				
				}
			}
		} for(int i = 0; i<numbers.length; i++){			//결과를 출력한다.
			System.out.println(numbers[i]+":"+rank[i]+"등");
		}
		//System.out.println(Arrays.toString(rank));	
	}

	
	
	private static void shuffle(int[] numbers) {
		// TODO Auto-generated method stub
		
			for(int i=0; i<numbers.length; i++){
			int random = (int)(Math.random()*numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
	}
}
