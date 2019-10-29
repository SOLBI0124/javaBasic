package z_exam;

class MyTv2 {
//7-10
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
//7-11-----------------------------------
	private int previousChannel;
//--------------------------------------	
	
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
//7-10 (1) 알맞은 코드를 넣어 완성하시오.=============================================
	public void setChannel(int channel) {
//7-11 ---------------------------------------		
		previousChannel = this.channel;	//현재채널을 이전채널에 저장
// --------------------------------------------		
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setVolume(int volume) {
		this.volume=volume;
	}

	public int getVolume() {
		return volume;
	}
//==================================================================================
//7-11 ------------------------------------------
	public void gotoPrevChannel(){
		setChannel(previousChannel);	//현재채널을 이전채널에 저장
	}
//-----------------------------------------------	
	
	}
	class Exercise7_10 {
		
	public static void main(String args[]) {
	MyTv2 t = new MyTv2();
	t.setChannel(10);
	System.out.println("CH:"+t.getChannel());
	t.setVolume(20);
	System.out.println("VOL:"+t.getVolume());
	}
	}
	
	class Exercise7_11 {
	public static void main(String args[]) {
	MyTv2 t = new MyTv2();
	t.setChannel(10);
	System.out.println("CH:"+t.getChannel());
	t.setChannel(20);
	System.out.println("CH:"+t.getChannel());
	t.gotoPrevChannel();
	System.out.println("CH:"+t.getChannel());
	t.gotoPrevChannel();
	System.out.println("CH:"+t.getChannel());
	}
	}
