package ex02;

interface TV {
	int MAX = 100; //(public final)
	
	abstract public void powerOn();
	abstract public void powerOff();
	abstract public void soundUp();
	abstract public void soundDown();
	
	//채널 변경 추가
	default void channelUP() {
		
	};
	default void channelDown() {
		
	};
	
}
