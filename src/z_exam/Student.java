package z_exam;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

//6-4	
	int getTotal(){
		return kor+eng+math;
	}
	
	float getAverage(){
		return (int)((getTotal()/3f)*10+0.5)/10f;

	}
	
//6-5
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	String info(){
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," 
				+ getTotal() + "," + getAverage();
		
	}


public static void main(String[] args) {
//public class에서
Student s = new Student("현솔비", 1, 1, 1, 10, 10);
System.out.println(s.info());

	}
}