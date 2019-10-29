package z_exam;

//public class Exam06_answer {

//6-1   SutdaCard클래스
//6-2   SutdaCard클래스

//6-3   Student 클래스
//6-4   Student 클래스   
//6-5   Student 클래스

//6-6   getDistance클래스
//6-7   getDistance클래스

//6-8 
/*      - 클래스변수(static변수) : width, height,
 		- 인스턴스변수 : kind, num (블럭안에서 선언됨)
 		- 지역변수 : k,n,args,card
 */
//6-9   
/*
static int weapon = 6; // 공격력
static int armor = 0; // 방어력

static void weaponUp() {
       weapon++;
    }
 static void armorUp() {
       armor++;
    }
 */

//6-10   답 : b,e
/*
a.o
b.x 객체(인스턴스) 초기화 목적, 객체생성x
c.o 없으면 자동으로 생성
d.o
e.x 생성자도 오버로딩이 가능해서 하나의 클래스에 여러 개의 생성자를 정의가능*/

//6-11   답 : b

/*a.o
 b.x 클래스 내 어디든 x, 인스턴스메서드 에서만
 c.o
 d.o static이 붙은 클래스 메서드에서는 사용x
 */

//6-12   답 : c,d
/* 오버로딩 : 같은 이름의 메서드를 정의하는 것
       파라미터의 개수 또는 타입이 달라야 한다. 
       파라미터의 개수와 타입으로 구분.*/

//6-13   답 : b,c,d
/*a. 파라미터 타입 같음 ->X
  d. 파라미터 변수 순서다르면 호출될 메서드 구분 가능*/

//6-14   답 : c,e

/*c.x 초기화블럭이 생성자보다 먼저 수행됨.
  e.x 클래스변수가 인스턴스변수보다 먼저초기화됨*/

//6-15   답 : a? 위에서부터 순서대로

//6-16   답 : a,e

/*a.x 지역변수는 자동 초기화 되지 않기 때문에 
     사용하기 전에 반드시 적절한 값으로 초기화를 해주어야
   b.o
   c.o 매개변수도 메서드 내에 선언된 것으로 간주, 지역변수ㅇ
   e.x 콜스택 - 지역변수(메서드 내에 선언)
         힙 - 인스턴스변수*/

//6-17   답 : b
/*
a.o
b.x println수행 마칠때까지 나머지 메서드들은 대기상태
c.o
d.o
e.o
f.o
 */

//6-18   답 : 라인A,B,D
/*     class MemberCall {
          int iv = 10;
          static int cv = 20;
          int iv2 = cv;
          
          static int cv2 = iv; // 라인 A                  ?//static변수 초기화에 인스턴스 변수 사용불가능. 객체만들어야함 
          
          static void staticMethod1() {               //static메서드에서
             System.out.println(cv);
             System.out.println(iv); // 라인 B            인스턴스 변수 사용불가능 
             											메모리에 올라가는 시점이 다르기 때문
          }
          
          void instanceMethod1() {
             System.out.println(cv);
             System.out.println(iv); // 라인 C
          }
          
          static void staticMethod2() {               //static메서드에서
             staticMethod1();
             instanceMethod1(); // 라인 D               인스턴스 변수 사용불가능
          }
          
          void instanceMethod2() {
             staticMethod1(); // 라인 E
             instanceMethod1();
          }
       }*/

//6-19       ABC123 /참조형 타입이여서 str이 같음.
					//string문자열이 변경되면 <새로운 객체를 만듦=새로운 주소에 저장=주소가 변경> 돼서 다른 주소를 가지게됨.
					//밑str와 다른 변수가됨

//6-20

/*class Exercise6_20
 {
    
    //(1) shuffle메서드를 작성하시오.
   private static int[] shuffle(int[] arr){
       
      for(int i = 0; i<arr.length; i++){
          int random = (int)(Math.random()*arr.length);
          
          int temp = arr[i];
          arr[i] = arr[random];
          arr[random] = temp;
       }
      return arr;
    }
  
    
    public static void main(String[] args)
    {
       int[] original = {1,2,3,4,5,6,7,8,9};
       System.out.println(java.util.Arrays.toString(original));
       int[] result = shuffle(original);
       System.out.println(java.util.Arrays.toString(result));
    }
 }      
 */

//6-21
/*
(1)   isPowerOn = !isPowerOn;
(2)   if(volume < MAX_VOLUME)
	volume++;
(3) if(volume > MIN_VOLUME)
	volume--;
(4)   if(channel == MAX_CHANNEL){
      channel==MIN_CHANNEL
      }else channel++;
(5)   if(channel == MIN_CHANNEL){
      channel==MAX_CHANNEL
         }else channel--;
 */

//6-22 

class Exercise6_22 {
   
   
   // (1) isNumber메서드를 작성하시오.
      private static boolean isNumber(String str) {

         
            if (str == null || str.length()==0) {
               return false;
               }
               
              for (int i = 0; i < str.length(); i++) { 
              if ('0' > str.charAt(i) || str.charAt(i) > '9') {
               return false;
         }
         return true;
      }
   

   public static void main(String[] args){
      String str = "123";
      System.out.println(str + "는 숫자입니까? " + isNumber(str));
      str = "1234o";
      System.out.println(str + "는 숫자입니까? " + isNumber(str));
   }

   
}

}


// 6-23 

/*class Exercise6_23{
    
//    (1) max메서드를 작성하시오.
	private static int max (int[] data) {
		if(data == null || data.length == 0){
		return -999999;
	}
		else{
    	  
	int max = data[0];
	for(int i = 1; i<data.length; i++){
	if(max < data[i]){
		max = data[i];
	}
         
	}
	return max; 
	}
	}
           

   
    
 public static void main(String[] args)
 {
    int[] data = {3,2,9,4,7};
    System.out.println(java.util.Arrays.toString(data));
    System.out.println("최대값:"+max(data));
    System.out.println("최대값:"+max(null));
    System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
 }
}

*/



// 6-24
/*

class Exercise6_24
{
   
//   (1) abs메서드를 작성하시오.
   private static int abs(int value) {
      if(value > 0 ){
      return value;
   }else 
      return -value;
   
}
   
   public static void main(String[] args)
   {
      int value = 5;
      System.out.println(value+"의 절대값:"+abs(value));
      value = -10;
      System.out.println(value+"의 절대값:"+abs(value));
   }

}

*/

