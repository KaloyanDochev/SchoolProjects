package OOP;

public class Z15_2 {
	public static void main(String[] args) {
		MyInteger i = new MyInteger(23);
		System.out.println(" Even: " + i.isEven() 
				+ "\n Odd: " + i.isOdd() 
				+ "\n Prime: "+ i.isPrime()
				
				+ "\n \n"+ " Even: " + MyInteger.isEven(23) 
				+ "\n Odd: " +  MyInteger.isOdd(23) 
				+ "\n Prime: "+  MyInteger.isPrime(23)
				
				+ "\n \n"+ " Even: " + MyInteger.isEven(i) 
				+ "\n Odd: " +  MyInteger.isOdd(i) 
				+ "\n Prime: "+  MyInteger.isPrime(i)
				
				+ "\n \n"+  " String to int " + MyInteger.parseInt("23"));
		
	}
}