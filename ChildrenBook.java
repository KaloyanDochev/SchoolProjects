package chast4;

public class ChildrenBook extends Book{
int age;
	public ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {
		super(regularPrice, publisher, yearPublished);
		this.age = age;
		// TODO Auto-generated constructor stub
	}
	  public double computeSalePrice(){
	        return getRegularPrice() * 0.3;
	    }

}
