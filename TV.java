package Zad;

public class TV {
int channel;
int volumeLevel;
boolean on;

TV(){
	
}

public void turnOn(){
	on = true;
}

public void turnOff(){
	on = false;
}

void setChannel(int newChannel) {
	channel = newChannel;
}

void setVolume(int newVolumeLevel) {
 volumeLevel = newVolumeLevel;	
}

void channel1Up() {
	channel ++;
}

void channel1Down() {
	channel --;
}

void volumeUp(){
	volumeLevel++;
}

void volumeDown(){
	volumeLevel--;
}

}
