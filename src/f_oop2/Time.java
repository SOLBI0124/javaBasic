package f_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		
		if(0>hour){
			this.hour = 0;
		}else if(hour > 23){
			this.hour = 23;
		}else{
			this.hour = hour;
		}
	}
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if(0 > minute){
			this.minute = 0;
		}else if(minute > 59){
			this.minute = 59;
		}else{
			this.minute = minute;
		}
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if(0>second){
			this.second = 0;
		}else if(second > 59){
			this.second = 59;
		}else{
			this.second = second;
		}
	}
	
	@Override	//Object class에서 상속받은 메서드. 주소값말고 시간이 출력되도록
	public String toString() {
		return hour + ":" + minute + ":" + second;
				
	}
	
	
	
	
	
}
