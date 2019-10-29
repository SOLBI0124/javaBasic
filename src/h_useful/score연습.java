package h_useful;

public class score연습 {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 Java, Oracle, HTML, JQuery, JSP 점수를
		 * 50 ~ 100까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 * 석차	이름		Java	Oracle	HTML	JQuery	JSP		총점		평균
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 */
		
		String[] students = {
				"오동규", "박재욱", "오제민", "전보영", "유지상",
				"박신규", "진주호", "지원희", "한승희", "안정현",
				"이이슬", "이정은", "이선욱", "조건희", "최효은",
				"김혜정", "김명성", "신유진", "조윤호", "조아라",
				"백운영", "최도혁", "김영호", "박희제", "현솔비"};
		String[] subjects = {"Java", "Oracle", "HTML", "JQuery", "JSP"};
		
		//2차원 배열(이름제외)
		double [][] scores = new double [students.length][subjects.length+3];
		
		//랜덤점수 생성
		for(int i = 0; i<scores.length; i++){
			scores[i][0] = 1;	//석차1로 초기화
			for(int j = 0; j<subjects.length; j++){
				scores[i][j+1] = (int)(Math.random()*50+51);
			}
		}
		
		//총점과 평균
		for(int i = 0; i<scores.length; i++){
			for(int j = 0; j<subjects.length; j++){
				scores[i][scores[i].length-2] += scores[i][j+1];
			}
			for(int j =0; j<subjects.length; j++){
				scores[i][scores[i].length-1] += (int)((scores[i][scores[i].length-2]/scores[i].length)*100+0.5)/100d;
			}
		}
		
		//석차
		for(int i =0; i<scores.length; i++){
			for(int j = 0; j<scores.length; j++){
				if(scores[i][scores[i].length-1] > scores[j][scores[j].length-1])
					scores[i][0]++;
			}
		}
		
		//석차대로 정렬한다.
		for(int i =0; i<scores.length; i++){
			for(int j = i+1; j<scores.length; j++){
				if(scores[i][0] > scores[j][0]){
					double[] temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
					
					String tempN = students[i];
					students[i] = students[j];
					students[j] = tempN;
					
				}
			}
		}
		
		
		//출력한다.
		System.out.print("석차\t이름\t");
		for(int i = 0; i<subjects.length; i++){
			System.out.print(subjects[i]+"\t");
		}System.out.println("총점\t평균\t");
		
		for(int i = 0; i<scores.length; i++){
			System.out.println((int)(scores[i][0])+"\t"+students[i]);
		}

	}

}
