package projects17;

public class Main {

    public static void main(String[] args) {

    	PC pc[] = new PC[2];
    	pc[0] = new PC();
		pc[0].setIme("Dell Laptop");
		pc[0].setPrize(500);
		
		pc[1] = new PC();
		pc[1].setIme("Lenovo Laptop");
		pc[1].setPrize(700);
		
		Store store = new Store();
		store.setIme("TechBG");
		
		//store.newProducts(pc);
		
		System.out.println("Welcome to "+ store.getIme() +
		                   "\nHere are a few suggestions: \n" + 
				            pc[1].getIme() + "at the prize of " + pc[1].getPrize() + 
				            "\nand " + pc[0].getIme() + "at the prize of " + pc[0].getPrize());

    }

}
