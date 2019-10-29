package e_oop;

public class TV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV tv = new TV("삼성");
		
		tv.power();
		tv.channelUp();
		tv.changeChannel(99);
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		
		tv.power();
		tv.volumeUp();
		
		tv.power();
		tv.volumeUp();
	tv.volumeUp();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();
		tv.volumeDown();	
		tv.volumeDown();	
		tv.volumeDown();	
	
	
	}

	boolean power;
	int volume;
	int channel;			//전역변수
	String brand;
	
	final int MIN_CHANNEL = 1; //최소 채널 1
	final int MAX_CHANNEL = 100; 
	final int MIN_VOLUME = 0; //최소 볼륨 0
	final int MAX_VOLUME = 10;
	
	TV(String brand){			//생성자에 파라미터 받아서 초기화
		power = false;
		volume = 5;
		channel = MIN_CHANNEL;
		this.brand = brand;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
	}
	
	void changeChannel(int channel){
		if(power){
			if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
				this.channel = channel;
			}
			System.out.println("채널. "+this.channel);
		}
	}
	
	void volumeUp(){
		if(power && volume < MAX_VOLUME){
			volume++;
		}
		showVolume(volume);
	}
	
	void volumeDown(){
		if(power && volume > MIN_VOLUME){
			volume--;
		}
		showVolume(volume);
	}
	
	void showVolume(int volume){
		if(power){
		System.out.println("음량");
		for(int i = MIN_VOLUME + 1; i<=MAX_VOLUME; i++){
			if(i<=volume){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
	}
		System.out.println();
}
	
	void channelUp(){
		changeChannel(channel + 1);

	}
	
	void channelDown(){
		changeChannel(channel - 1);
	}
}

//과제. 클래스 하나로 간단한 프로그램을 만들어주세요.
//발표. 프로그램 주제, 기능, 메서드 구성, 시연
//콘솔에서 사용자가 입력하면서 프로그램 실행되게

