package i_collection;

import java.util.ArrayList;

public class score {

   public static void main(String[] args) {
      /*
       * 우리반 모두의 Java, Oracle, HTML, JQuery, JSP 점수를
       * 50 ~ 100까지 랜덤으로 생성시켜주시고,
       * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
       * 
       * 석차   이름      Java   Oracle   HTML   JQuery   JSP      총점      평균
       * 1   오동규   100      100      100      100      100      100      100
       * 1   오동규   100      100      100      100      100      100      100
       * 1   오동규   100      100      100      100      100      100      100
       * 1   오동규   100      100      100      100      100      100      100
       * 1   오동규   100      100      100      100      100      100      100
       * 1   오동규   100      100      100      100      100      100      100
       * 1   오동규   100      100      100      100      100      100      100
       */
      

      
      ArrayList<ArrayList<Double>> list = new ArrayList<ArrayList<Double>>();
      
   
      ArrayList<String> subjects = new ArrayList<String>();
      subjects.add("Java");      
      subjects.add("Oracle");
      subjects.add("HTML");
      subjects.add("JQuery");
      subjects.add("JSP");

      
      
      ArrayList<String> students = new ArrayList<String>();
      students.add("오동규");      
      students.add("박재욱");      
      students.add("오제민");      
      students.add("전보영");      
      students.add("유지상");      
      students.add("박신규");      
      students.add("진주호");      
      students.add("지원희");      
      students.add("한승희");      
      students.add("안정현");      
      students.add("이이슬");      
      students.add("이정은");      
      students.add("이선욱");      
      students.add("조건희");      
      students.add("최효은");      
      students.add("김혜정");      
      students.add("김명성");      
      students.add("신유진");      
      students.add("조윤호");      
      students.add("조아라");      
      students.add("백운영");      
      students.add("최도혁");      
      students.add("김영호");      
      students.add("박희제");      
      students.add("현솔비");      
      
      
      
      //점수 생성
      for(int i = 0; i < students.size(); i++){
         ArrayList<Double> scoresList = new ArrayList<Double>();
         scoresList.add((double) 1); //석차 1등으로 초기화
         for(int j = 0; j < subjects.size(); j++){
            scoresList.add((double)((int)(Math.random() * 51) + 50));
         }
         list.add(scoresList);
        
      }
      
      for(int i = 0; i < students.size(); i++){
    	  System.out.println(list.get(i));
      }
      
      
      
      //총점과 평균을 구한다.
      for(int i = 0; i < list.size(); i++){
         int sum = 0;
         for(int j = 1; j < list.get(i).size(); j++){
            sum += list.get(i).get(j); 
         }
         list.get(i).add((double) sum);//총점
         list.get(i).add((int)((double)sum/subjects.size()*100+0.5)/100.0);
      }
      
      
      //석차를 구한다.
      for(int i = 0; i < list.size(); i++){
         for(int j = 1; j < list.size(); j++){
            if(list.get(i).get(7)-1 < list.get(j).get(7)-1){   
               list.get(i).set(0, list.get(i).get(0)+1); //석차
            }
         }
      }
      
      //석차대로 정렬한다.
      for(int i = 0; i < list.size(); i++){         
         for(int j = i+1; j < list.size(); j++){
            if(list.get(i).get(0) > list.get(j).get(0)){            
            	
            	ArrayList<ArrayList<Double>> temp = new ArrayList<ArrayList<Double>>(); 
            	temp.add(list.get(i));
            	list.set(i, list.get(j));                       
            	list.set(j, temp.get(0));   
               
            	ArrayList<String> tempN = new ArrayList<String>();  
            	tempN.add(students.get(i));
            	students.set(i, students.get(j));
            	students.set(j, tempN.get(0));
            }
         }
      }
      
      //출력한다.
      System.out.print("석차\t이름");
      for(int i = 0; i < subjects.size(); i++){
         System.out.print("\t" + subjects.get(i));
      }
      System.out.println("\t총점\t평균");
      
      for(int i = 0; i < list.size(); i++){
         System.out.print((int)((double)(list.get(i).get(0))) + "\t" + students.get(i));
         for(int j = 1; j < list.get(i).size(); j++){
            if(j == list.get(i).size() - 1){
               System.out.print("\t" + list.get(i).get(j));
            }else{
               System.out.print("\t" + (int)((double)(list.get(i).get(j))));   
            }
         }
         System.out.println();
      }   
   }
      

   
}