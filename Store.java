package projects17;

public class Store {
private int number ;
PC[] productList = new PC[number];
private String ime;

void newProduct(PC component) {
	number += 1;
	productList[number] = component;
}

void newProducts(PC component[]) {
	int pamet = number;
	number += component.length;
	for(int j=0; j<component.length; j++) {
	productList[pamet] = component[j];
	pamet += 1;
}
}

public String getIme() {
	return ime;
}

public void setIme(String ime) {
	this.ime = ime;
}
}
