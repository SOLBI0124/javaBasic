package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Aaaaaaaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		int [] numbers = new int [10];
		for(int i = 0; i<numbers.length; i++){
			numbers[i]=i+1;
			
		}
		shuffle(numbers);
		System.out.println(Arrays.toString(numbers));
      
		//printRank(numbers);
		//selectSort(numbers);
		//bubbleSort(numbers);
		
		
		
		
		
		
		
		
   }

	private static void bubbleSort(int[] numbers) {
		// TODO Auto-generated method stub
		for(int i = 0; i<numbers.length-1; i++){
			boolean changed = false;
			//for(int j=0; j<numbers.length-i-1;j++)
			
		}
		
	}
	
	
	
	
	
	

	private static void selectSort(int[] numbers) {
		// TODO Auto-generated method stub 선택정렬
		for (int i =0; i<numbers.length;i++){
			for(int j=i+1; j<numbers.length; j++){
				if(numbers[i]>numbers[j]){
				int temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
				}
			}
		}System.out.println(Arrays.toString(numbers));
		
		
	}

	
	
	
	
	
	
	
	private static void printRank(int[] numbers) {
		// TODO Auto-generated method stub 석차구하기
		int [] ranks = new int [10];
			
		for(int i = 0; i<ranks.length; i++){
			ranks[i]=1;}
		
		for(int i = 0; i<numbers.length; i++){
			for(int j=0; j<numbers.length; j++){
				if(numbers[i]<numbers[j]){
					ranks[i] +=1;
				}
			}
			
		}System.out.println(Arrays.toString(ranks));
		
		
	}

	
	
	
	
	
	
	
	private static void shuffle(int[] numbers) {
		// TODO Auto-generated method stub
		for(int i =0; i<numbers.length; i++){
			int random = (int)(Math.random()*numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}System.out.println(numbers);
		
		
		
		
	//5-4
		 int[][] arr = { { 5, 5, 5, 5, 5 }, 
				 		{ 10, 10, 10, 10, 10 },
				 		{ 20, 20, 20, 20, 20 }, 
				 		{ 30, 30, 30, 30, 30 } };
           int total = 0;
           float average = 0;
           
           for(int i =0; i<arr.length;i++){
        	   for(int j =0; j<arr[i].length; j++){
        		   total = total + arr[i][j];
        	   }
           }average = total/(float)(arr.length*arr[0].length);
            //* (1) 알맞은 코드를 넣어 완성하시오.
            
           System.out.println("total=" + total);
           System.out.println("average=" + average);
           
           
    //5-6     
           System.out.println();
           {	// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
	            int[] coinUnit = { 500, 100, 50, 10 };
	            int money = 2680;
	            System.out.println("money=" + money);
	            for (int i = 0; i < coinUnit.length; i++) {
	               System.out.println(coinUnit[i]+":"+money/coinUnit[i]);
	               money %= coinUnit[i];
	            	
	                }
           
           
           
           
           
     //5-8
	            System.out.println();
           int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
           int[] counter = new int[4];
           for (int i = 0; i < answer.length; i++) {
               //(1) 알맞은 코드를 넣어 완성하시오. 
        	   counter[answer[i]-1] += 1;
           }
           for (int i = 0; i < counter.length; i++) {
              
               //* (2) 알맞은 코드를 넣어 완성하시오.
               System.out.print(counter[i]);
               for(int j=0; j<counter[i]; j++){
            	   System.out.print("*");
               }
        	   
        	   
              System.out.println();
           }
          }
           
           
           
   //5-10        
           
     	      char[] abcCode =
     	      { '`','~','!','@','#','$','%','^','&','*',
     	      '(',')','-','_','+','=','|','[',']','{',
     	      '}',';',':',',','.','/'};
     	      // 0 1 2 3 4 5 6 7 8 9
     	      char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
     	      String src = "abc123";
     	      String result = "";
     	      // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
     	      for(int i=0; i < src.length();i++) {
     	      char ch = src.charAt(i);
     	      
     	      	
     	      	if('a'<= ch && ch <='z'){
     	      		result += abcCode[ch-'a'];
     	      				
     	      	}else if ('0'<=ch && ch <= '9'){
     	      		result += numCode[ch-'0'];			
     	      	}
     	      
     	      
     	      //(1) 알맞은 코드를 넣어 완성하시오.
     	       }
     	      System.out.println("src:"+src);
     	      System.out.println("result:"+result);
           
           
  //5-12   
     	String[][] words = {
     			{"chair","의자"}, 	//words[0][0], words[0][1]
     			{"computer","컴퓨터"},//words[1][0], words[1][1]
     			{"integer","정수"},	//words[2][0], words[2][1]
     	};
     	Scanner scanner = new Scanner(System.in);
     	int count = 0;
     	
     	for(int i=0; i<words.length;i++){
     		System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
     		
     		String tmp = scanner.nextLine();
     		
     		if(tmp.equals(words[i][1])) {
     			System.out.println("정답입니다.\n\n");
     			count++;
     		}else {
     			System.out.printf("틀렸습니다. 정답은 %s입니다. \n\n", words[i][1]);
     			
     		}
     	}
     	System.out.println("전체"+words.length+"문제중"+count+"문제 맞히셨습니다.");
     	      
           
	


//5-13
     	
	String[] words1 = { "television", "computer", "mouse", "phone" };
	
	for(int i=0;i<words1.length;i++) {
	   char[] question = words1[i].toCharArray(); // String을 char[]로 변환
	   
	  // (1) 알맞은 코드를 넣어 완성하시오.
	  // char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
	   
	   		for(int j=0; j<question.length; j++){
			int random = (int)(Math.random()*question.length);
			
			char temp = question[i];
			question[i] = question[random];
			question[random] = temp;
		}
	   
	   System.out.printf("Q%d. %s의 정답을 입력하세요.>",
	         i+1, new String(question));
	   String answer = scanner.nextLine();
	   // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
	   if(words1[i].equals(answer.trim()))
	      System.out.printf("맞았습니다.%n%n");
	   else
	      System.out.printf("틀렸습니다.%n%n");
	}
	} // main의 끝
	
*/

/*		int[][] score = {
        {100, 100, 100}
        , {20, 20, 20}
        , {30, 30, 30}
        , {40, 40, 40}
        , {50, 50, 50}
        };
        int[][] result = new int[score.length+1][score[0].length+1];
        for(int i=0; i < score.length;i++) {
           for(int j=0; j < score[i].length;j++) {
           
          // (1) 알맞은 코드를 넣어 완성하시오.
           	result[i][j] = score[i][j];
           	result[i][score[i].length] += score[i][j];
           	result[score.length][j] += score[i][j];
           	result[score.length][score[i].length] += score[i][j];
           
           
            }
        }
     for(int i=0; i < result.length;i++) {
        for(int j=0; j < result[i].length;j++) {
           System.out.printf("%4d",result[i][j]);
           }
           System.out.println();
        }
     } // main
}
*/

      
String[] words = { "television", "computer", "mouse", "phone" };
Scanner scanner = new Scanner(System.in);
for(int i=0;i<words.length;i++) {
   char[] question = words[i].toCharArray(); // String을 char[]로 변환
   
   //(1) 알맞은 코드를 넣어 완성하시오.
   //char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
   
   
	   
	//답 : 	
   for(int j=0; j<question.length; j++){
	int random = (int)(Math.random()*question.length);
	
	char temp = question[0];
	question[0] = question[random];
	question[random] = temp;
	}

   System.out.printf("Q%d. %s의 정답을 입력하세요.>",
         i+1, new String(question));
   String answer = scanner.nextLine();
   // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
   if(words[i].equals(answer.trim()))
      System.out.printf("맞았습니다.%n%n");
   else
      System.out.printf("틀렸습니다.%n%n");
}
	}
}// main의 끝

   
      
      
   
		
		
		




