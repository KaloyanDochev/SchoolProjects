package Recursion;

public class Z4_4 {
	public static void main(String[] args) {
		int[] masiv = {1,2,3,4,100};
		System.out.println(average(masiv));
	}
	public static double average(int[] masiv) {
		int length = masiv.length;
		return average(masiv,length,0)/length;
	}
    public static double average(int[] masiv,int length,int rez) {
    	if(length == 0) {
    		return rez;
    	}
    	rez += masiv[length-1];  
    	return average(masiv,length-1,rez);
    }
}
