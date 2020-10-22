package Zad;

public class TV_test {

	public static void main(String args[]) {
		TV tv = new TV();
		tv.turnOn();
		tv.setChannel(23);
		tv.setVolume(3);
		tv.channel1Up();
		System.out.print("Channel: " + tv.channel + "\n" + "Volume: "+tv.volumeLevel);
	}
	
}
