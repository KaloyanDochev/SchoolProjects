package Zad;

public class Uchenik{
	private String name;
	private double uspeh;
	Uchenik(){}
	public Uchenik(String ime1, double uspeh1){
		setName(ime1);
		setUspeh(uspeh1);
	}
	public double getUspeh() {
		return uspeh;
	}
	public void setUspeh(double uspeh) {
		this.uspeh = uspeh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
