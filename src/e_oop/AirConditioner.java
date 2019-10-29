package e_oop;

public class AirConditioner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		AirConditioner aircon = new AirConditioner();
		
		aircon.temperatureUp();
		System.out.println(aircon.temperature);		//온도 24(초기화값)
		aircon.power();								//전원켬
		aircon.temperatureUp();						//다시 온도 올림
		System.out.println(aircon.temperature);		//온도 1증가 25
		
		aircon.temperatureDown();
		aircon.temperatureDown();					//온도 2내림 23
		System.out.println(aircon.temperature);	
		
		aircon.airVolume();							//풍량
		System.out.println(aircon.airVolume);		//풍량2
		aircon.airVolume();							
		System.out.println(aircon.airVolume);		//풍량3
		aircon.airVolume();							
		System.out.println(aircon.airVolume);		//풍량1
		aircon.airVolume();							
		System.out.println(aircon.airVolume);		//ctrl+Alt+방향키 = 복사

		
		
	}

	//온도가 18~30까지만 변경할 수 있게 해주시고,
	//전원을 켰을때만 버튼들이 작동되도록 메서드를 변경
	
	boolean power; //전원
	int temperature; //온도
	int airVolume; //풍량

	AirConditioner(){	//생성자로 초기화
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	//전원 버튼 메서드
	void power(){
		power = !power;
	}
	
	//온도+ 버튼 메서드
	void temperatureUp(){
		if(power==true){
			if(30 > temperature){	//30도 미만일때만 온도 증가
				temperature++;
			}
		}
	}
	
	//온도- 버튼 메서드
	void temperatureDown(){
		if(power && 18 < temperature){
			temperature--;
		}	
	}
	
	//풍량 버튼 메서드
	void airVolume(){
		if(power && 3 < ++airVolume){
			airVolume = 1;
		}
	}
}
