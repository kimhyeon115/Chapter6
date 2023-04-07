package Chapter_result;

public class Tv {
	String color;
	boolean	power;
	int channel;
	void powerOn() {
		power = true;
		System.out.println("전원 : " + power);
	}
	void powerOff() {
		power = false;
		System.out.println("전원 : " + power);
	}
	void channelUp() {
		++channel;
		System.out.println("현재 채널은 : " + channel);
	}
	void channelDown() {
		--channel;
		System.out.println("현재 채널은 : " + channel);
	}
	void colorChange() {
		System.out.println("현재 색상은 : " + color);
	}
}
