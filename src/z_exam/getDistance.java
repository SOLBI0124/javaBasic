package z_exam;

public class getDistance {
	 
	
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
    static double getDistance(int x, int y, int x1, int y1) {
       
//6-6	 (1) 알맞은 코드를 넣어 완성하시오.
	    return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	    	
	    }
	    
	    
	    public static void main(String args[]) {
	       System.out.println(getDistance(1,1,2,2));
	    }
	 }

class MyPoint {
    int x;	//인스턴스변수
    int y;
    MyPoint(int x, int y) {
       this.x = x;
       this.y = y;
    }

    
//6-7  (1) 인스턴스메서드 getDistance를 작성하시오.
	    double getDistance(int x1, int y1) {
			
			return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		}
	       
	    		
	       
	 }
 
 class Exercise6_7 {
    public static void main(String args[]) {
       MyPoint p = new MyPoint(1,1);
//		 p와 (2,2)의 거리를 구한다.
       System.out.println(p.getDistance(2,2));
    }
 }
 
