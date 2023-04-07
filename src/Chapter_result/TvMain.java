package Chapter_result;

public class TvMain {

	public static void main(String[] args) {
		Tv ts = new Tv();
		ts.channel = 55;
		ts.powerOn();
		ts.powerOff();
		ts.channelUp();
		ts.channelDown();
		ts.color = "blue";
		ts.colorChange();

	}

}
