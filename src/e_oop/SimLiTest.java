package e_oop;

import java.util.Scanner;

public class SimLiTest {

	//9개의 질문을 9개의 메서드로 만들어주세요.
	
	Scanner s = new Scanner(System.in);
	String answer;
	
	void q1(){
		System.out.println("나는 금사빠다(금방 사랑에 빠진다)");
		answer = s.nextLine();
		if(answer.equals("y") || answer.equals("Y")){
			 q2();
		}else if(answer.equals("n") || answer.equals("N")) if(answer.equals("n") || answer.equals("N")){
			 q4();
		}else q1();
	}
	
	void q2(){
		System.out.println( "연애할 때 끌려다니는 타입이다.");
		answer = s.nextLine();
		if(answer.equals("y")){
			q5();
		}else if(answer.equals("n") || answer.equals("N")) if(answer.equals("n") || answer.equals("N")) {
			q3();
		}else q2();
	}
	
	void q3(){
		System.out.println( "데이트 코스는 미리 짜는게 편하다.");
		answer = s.nextLine();
		if(answer.equals("y")){
			q6();
		}else if(answer.equals("n") || answer.equals("N")) if(answer.equals("n") || answer.equals("N")){
			q5();
		}else q3();
	}
	
	void q4(){
		System.out.println( "감정기복이 크지않다.");
		answer = s.nextLine();
		if(answer.equals("y")){
			q7();
		}else if(answer.equals("n") || answer.equals("N")) {
			q5();
		}else q4();
	}
	
	void q5(){
		System.out.println( "감정표현에 솔직한 편이다.");
		answer = s.nextLine();
		if(answer.equals("y")){
			q8();
		}else if(answer.equals("n") || answer.equals("N")) {
			q6();
		}else q5();
	}
	
	void q6(){
		System.out.println( "활동적인 데이트가 좋다.");
		answer = s.nextLine();
		if(answer.equals("y")){
			q8();
		}else if(answer.equals("n") || answer.equals("N")){
			q9();
		}else q6();	
	}
	
	void q7(){
		System.out.println( "연락이 없어도 믿고 기다리는 편이다.");
		answer = s.nextLine();
		if(answer.equals("y")){
			System.out.println("A.서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입");
		}else if(answer.equals("n") || answer.equals("N")){
			q8();
		}else q7();
	}
	
	void q8(){
		System.out.println( "이성친구는 존재할 수 없다.");
		answer = s.nextLine();
		if(answer.equals("y")){
			q9();
		}else if(answer.equals("n") || answer.equals("N")){
			System.out.println("B.구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입");
		}else q8();
	}
	
	void q9(){
		System.out.println( "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
		answer = s.nextLine();
		if(answer.equals("y")){
			System.out.println("C.친구같이 편안한 연애를 하는 타입");
		}else if(answer.equals("n") || answer.equals("N")) {
			System.out.println("D.무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");
		}else q9();
	}
}
