package chast4;

public class ComicBook extends Book{
String characterName;
	public ComicBook(double regularPrice, String publisher, int yearPublished,String name) {
		super(regularPrice, publisher, yearPublished);
		// TODO Auto-generated constructor stub
		characterName = name;
	}
	  public double computeSalePrice(){
	        return getRegularPrice() * 0.4;
	    }
}
