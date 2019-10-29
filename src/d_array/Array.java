package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * <<배열>> 변수를 묶어서사용하는것
		 * int[] number = new int[5]; //기본값으로 초기화된다.
		 * int number[] = new[]{10 ,20, 30, 40, 50};
		 * int[] number = {10, 20, 30, 40, 50};
		 */
		
		
		//배열은 참조형 타입이다.
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//배열 초기화시 기본값이 저장된다.
		
		System.out.println(array); // 주소가 저장되어 있다.
		
		System.out.println(array[0]);
		//실제 값이 접근하기 위해서는 index를 지정해줘야 한다.
		//index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		//배열의 최대 크기는 int의 최대값(약 20억)이다.
		
		String arrayStr = Arrays.toString(array);
		//배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr); //int의 기본값이 0이 저장되어있다.
		
		
		int[] iArray1 = new int[] {1, 2, 3}; //값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1, 2, 3}; //선언과 초기화를 동시에 해야한다.
//		int[] iArray3;
//		iArray3  = {1,2,3}; 선언과 초기화 따로는 불가능하다.
		
		array[0] = 10; //인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50; // 마지막 인덱스는 "배열의 길이 -1"이다.
		
		//정수를 저장할 수 있는길이가 10인배열을 생성 및 초기화해주세요.
		int[] a = new int[10];
		
		//모든 인덱스에 있는 값을 변경해주세요.
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;
		
		//모든 인덱스에 있는 값을 더햊세요.
//		sum += a[0]
		
	//index는 1씩 증가는 규칙이 있어 for문과 함께사용하기 좋다.
	for(int i = 0; i < array.length; i++){
		System.out.println(array[i]);
		
	}
		
		
	//배열의 길이를 알고있다고 리터럴을 사용하는 것을 하드코딩이라고 한다.
	//길이를 알고있더라도 length를 사용하는것이 더 좋은 코드이다.
	
	for(int i = 0; i<array.length; i++){
		array[i] = i + 1;		
	}
		System.out.println(Arrays.toString(array));		
	


	//배열의 숫자를 저장하고 합계와 평균을  구해주세요.
	int[] numbers = new int[10];
	int sum = 0;
	double avg = 0;
	 
	for (int i = 0; i<numbers.length; i++){
		numbers[i] = (int)(Math.random() * 100) + 1;	
	}
	
	System.out.println(Arrays.toString(numbers));
		
	for(int i = 0; i<numbers.length; i++){
		sum += numbers[i];	
	}
	avg= sum/numbers.length;
	System.out.println("합계:"+sum+ "평균 :"+avg);	
	
	
	
	
	
	
	System.out.println();
	//향상된 for문(값을 저장X,읽을때만사용)
	 for(int number : numbers){//배열에 있는 값을 차례대로 변수에 넣는다.
		 System.out.println(number);
}
	
	for(int number : numbers){
		number = 0; //numbers의 값은 변경되지 않는다.
		System.out.println(number);
	}
	System.out.println(Arrays.toString(numbers));
	
	
	
	//배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
	//배열의 값이 최소값보다 작으면 최소값에 배열의 값을 저장하고 
	//배열의 값이 최대값보다 크면 최대값에 배열의 값을 저장한다.
	
	System.out.println();
	//최소값을 저장할 변수를 선언하고 0번 인덱스의 값으로 초기화한다.
	//최대값을 저장할 변수를 선언하고 0번 인덱스의 값으로 초기화한다.
	int max = numbers[0];
	int min = numbers[0];
	
	//배열의 길이만큼 반복하는 반복문을 만든다.
	for(int i = 1; i<numbers.length; i++){
		if(numbers[i] < min){				//최소값을 저장할 변수보다 배열의 값이 작은경우(조건문)
			min = numbers[i];				//그 값을 최소값을 저장할 변수에 저장한다.
			
		}
		if(numbers[i] > max){				//최소값을 저장할 변수보다 배열의 값이 큰 경우
			max = numbers[i];				//그 값을 최대값을 저장할 변수에 저장한다.
		}
	}
		System.out.println("최소값 :"+min+", 최대값 :"+max);
	
	
		
		
		
		
	int[] shuffle = new int[30];
	for(int i = 0; i <shuffle.length; i++){
		shuffle[i] = i + 1;
	}
	System.out.println(Arrays.toString(shuffle));
	
	//배열의 값을 섞어주세요.
	//0번 인덱스의값과 랜덤 인덱스의 값을 서로 교환한다.
	
	for(int i = 0; i<shuffle.length*10; i++){		//여러번 반복하는 반복문을 만든다
		int random = (int)(Math.random() * shuffle.length);		//랜덤한 인덱스를 발생시켜 변수에 저장한다.(0~29)
		int temp = shuffle[0];						//0번째 인덱스의 값shuffle[0]을 임시(temp)에 저장한다.
		shuffle[0] = shuffle[random];			//배열의 랜덤인덱스shuffle[random] 값을 0번째 인덱스shuffle[0]에 저장한다.
		shuffle[random] = temp;					//임시로 저장한 값temp에 랜덤 인덱스shuffle[random]를 저장한다.
	}
		
		System.out.println(Arrays.toString(shuffle));	//배열의 내용을 출력한다.
	
	
	//배열은 길이를 변경할 수 없기 때문에 길이가 부족할 경우
	//더 큰 배열에 복사해야한다.
	int[] temp = new int[shuffle.length*2];
	for(int i = 0; i<shuffle.length; i++){
		temp[i] = shuffle[i];
	}
	shuffle =temp;//temp주소에 들어있는 shuffle을 주소에 넣음->shuffle의 주소가 두배의 길이로 바뀌는것
	System.out.println(Arrays.toString(shuffle));
	
	//배열 복사 매서드
	int[] originArray = new int[]{1,2,3,4,5};
	int[] copyArray = new int[originArray.length*2];
	System.arraycopy(originArray, 0, copyArray, 0, originArray.length); //originArray의 0번 인덱스를 copyArray의 0번 인덱스에 
																		//originArray.length(개수)만큼 저장하겠다.
	System.out.println(Arrays.toString(copyArray));
	
	
	}
}