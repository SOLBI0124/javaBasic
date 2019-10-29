package d_array;

import java.util.Arrays;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~10 사이의 난수(랜덤한수)를 500번 생성하고,
		//각 숫자가 생성된 횟수를 출력해주세요.(각각 몇번씩나왔는지)
		//1, 2, 3, 4, 5, 6, 7, 8, 9, 10 random
		//0, 1, 2, 3, 4, 5, 6, 7, 8, 9 array[i]
		
		int array [] = new int [10];
		int random = 0;
		
		for(int i = 0; i<500; i++){
			random=(int)(Math.random()*10)+1;
			//array[random-1] += 1;
			array[random-1]++;
			
			
		}System.out.println(Arrays.toString(array));
		
		
	}

}
