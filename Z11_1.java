package Sets;

import java.util.Scanner;
//slojnost:O(n) (n=niz1.length())
public class Z11_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String niz1 = sc.nextLine();
		String niz2 = sc.nextLine();
		
		int index=-121;
		int count = 0;
		
		for(int i=0; i< niz1.length(); i++) {
			if(niz1.charAt(i) == niz2.charAt(0) && count==0) {
				index = i;
				count++;
			}else if(niz1.charAt(i) == niz2.charAt(count)) {
				count++;
			}else if(count != 0){
				count =0;
				index=-1;
				i--;
			}
			if(count == niz2.length()) {
				break;
			}
		}
		if(count == niz2.length()) {
			System.out.println("Matched at index: " + index);
		}
		else {
			System.out.println("Not a substring");
		}
	}
}
