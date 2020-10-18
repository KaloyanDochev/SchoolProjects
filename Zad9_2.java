package Zad;

public class Zad9_2 {
	public static void main(String args[]) {
    int broqch = 0;
    int i=2;
    boolean Palindromic = true;
    
    while(broqch<120) {
    for(int j=2;j<=i/2;j++) {
    	if (i%j==0) {
    		Palindromic  = false;
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
    for(int j=0; j<=brcif/2; j++) {
    	//proverka na ogledalni cifri
    	if(cifri[j]!=cifri[brcif-1-j]) {
    		Palindromic = false;
    	}
    }
    
    if(Palindromic) {broqch++;
    System.out.print(i+" ");
   if(broqch%10==0) {System.out.println();}
    }
    
    Palindromic=true;
    i++;
    }
    
	}

}