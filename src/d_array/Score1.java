package d_array;

import java.util.Arrays;

public class Score1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 우리반 모두의 Java, Oracle, HTML, JQuery, JSP 점수를 
		 * 50~100까지 랜덤으로 생성시켜 주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.  
		 * 
		 * 석차	 이름		Java	Oracle	HTML	JQuery	JSP 	총점		평균
		 * 1	오동규	100		100		100		100		100		100		100
		 * 2	오동규	100		100		100		100		100		100		100
		 * 3	오동규	100		100		100		100		100		100		100
		 * 4	오동규	100		100		100		100		100		100		100
		 * 5	오동규	100		100		100		100		100		100		100
		 * 6	오동규	100		100		100		100		100		100		100
		 * 7	오동규	100		100		100		100		100		100		100
		 * 
		 */
		String[] h = {"석차",	 "이름",	"Java",	"Oracle","HTML","JQuery","JSP", "총점","평균"};
		String[] students = {"오동규","박재욱","오제민","전보영","유지상","박신규","진주호", 
							"지원희", "한승희", "안정현", "이이슬", "이정은", "이선욱", "조건희", 
							"최효은", "김혜정", "김명성", "신유진", "조윤호", "조아라", "백운영", 
							"최도혁", "김영호", "박희제", "현솔비"};
		String[] subjects ={"Java","Oracle","HTML","JQuery","JSP"};
		int[][] scores = new int[students.length][subjects.length + 3];
		int[] sum= new int[scores.length]; 
		double[] avg = new double[scores.length];
		
		System.out.print("석차"+ "  이름"+"  Java"+"  Oracle"+"  HTML"+"  JQuery"+"  JSP"+"  총점"+"  평균"+ "\t");
		System.out.println();
		for(int i = 0; i<scores.length; i++){
			for(int j=0; j<scores[i].length;j++){
				scores[i][j]=(int)((Math.random()*100)+1);
				sum[i] += scores[i][j];
				
			}
				avg[i] = sum[i]/(double)scores[i].length;
			
				}
		
		int[] rank = new int[sum.length];			
			for(int i = 0; i<rank.length; i++){
				rank[i] = 1;	
				}
			for(int i =0; i < sum.length; i++){
				for(int j=0; j<sum.length; j++){
					if(sum[j]>sum[i]){
						rank[i] += 1;
						}
					}
				}for(int i = 0; i<sum.length; i++){
					System.out.print(rank[i]+"  "+students[i]);
					System.out.print(Arrays.toString(scores[i]));
					System.out.println(sum[i]+"  "+avg[i]); 
			}
	}
}

