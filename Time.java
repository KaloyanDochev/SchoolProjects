package OOP;

import java.util.Date;
import java.util.Calendar;

public class Time {
	private int hour;
	private int minute;
	private int second;
	Date now = new Date();

	Time() {
		setHour(now.getHours());
		minute = now.getMinutes();
		second = now.getSeconds();
	}

	Time(long miliseconds) {
		second = (int) (miliseconds / 1000);
		minute = (second / 60) % 60;
		hour = ((second / 60) / 60) % 24;
		second %= 60;
	}

	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}
