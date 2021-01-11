package chast4;

public class Z20_1 {
	 public static void main(String[] args) {
	 Book[] pa = new Book[2];
     
     // Create object instances
	 pa[0] = new ComicBook(14, "PW press", 1924, "Batman");
     pa[1] = new  ChildrenBook(15, "PW press", 1987, 8);


     double totalRegularPrice = 0;
     double totalSalePrice = 0;
    
     for (int i=0; i<pa.length; i++){
        
         totalRegularPrice += pa[i].getRegularPrice();

         totalSalePrice += pa[i].computeSalePrice();
        
         System.out.println("Item number " + i +
                 ": Type = " + pa[i].getClass().getName() +
                 ", Regular price = " + pa[i].getRegularPrice() +
                 ", Sale price = " + pa[i].computeSalePrice());
     }
     System.out.println("totalRegularPrice = " + totalRegularPrice);
     System.out.println("totalSalePrice = " + totalSalePrice);
     
	 }
}