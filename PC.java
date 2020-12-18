package projects17;

public class PC {
private int number = 0;
Components[] components = new Components[number ];
private int prize = 0;
private String ime;

void newComponent(Components component) {
	setPrize(getPrize() + component.prize);
	number += 1;
	components[number] = component;
}

void newComponents(Components component[]) {
	for(int j=0; j<component.length; j++) {
	setPrize(getPrize() + component[j].prize);
	components[number] = component[j];
	number += 1;
}
}

public String getIme() {
	return ime;
}

public void setIme(String ime) {
	this.ime = ime;
}

public int getPrize() {
	return prize;
}

public void setPrize(int prize) {
	this.prize = prize;
}
	
	
}
