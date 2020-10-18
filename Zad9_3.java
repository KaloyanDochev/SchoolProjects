package Zad;

public class Zad9_3 {
	public static void main(String args[]) {
	    int broqch = 0;
	    int i=2;
	    boolean Emirp = true;
	    
	    while(broqch<120) {
	    for(int j=2;j<=i/2;j++) {
	    	if (i%j==0) {
	    		Emirp  = false;
	    	}
	    }
	    
	    int proverka = i;
	    int brcif=1;
	    while (proverka>=10){
	    	proverka /= 10;
	    	brcif++;
	    }//namirane na broq na cifri
	    
	    int[] cifri = new int[brcif];
	    for(int j=0;j<brcif; j++) {
	    	cifri[j]=i;
	    	for(int x=0;x<brcif-j-1;x++) {
	    		cifri[j] /= 10;
	    	}
	    	cifri[j] %= 10;
	    }//postavqne na cifri v masiv
	    
	    int reversal=0;
	    
	    for(int j=0; j<=brcif; j++) {
	    	int mnojitel=1;
	      for(int x=0; x<brcif-1-j; x++) {
	    	  mnojitel *= 10;
	      }
	      reversal += (mnojitel*cifri[j]);
}//sustavq se ogledalnoto chislo
	    for(int j=2;j<=reversal/2;j++) {
	    	if (reversal%j==0) {
	    		Emirp  = false;
	    	}
	    }
	    
	    if(Emirp) {broqch++;
	    System.out.print(i+" ");
	   if(broqch%10==0) {System.out.println();}
	    }
	    
	    Emirp=true;
	    i++;
	    }
	    
		}
}
