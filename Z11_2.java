package Sets;

import java.util.LinkedList;
import java.util.Scanner;

//(n-1) + (n-2) + (n-3) + .... + 1 + 1 = n.(n-1) + 1 = O(n^2)

public class Z11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		LinkedList<Character> max = new LinkedList<>();
		
		for(int i=0; i<s.length();i++) {
			LinkedList<Character> list = new LinkedList<>();
			list.add(s.charAt(i));
			for(int j=i+1; j<s.length();j++) {
				if(s.charAt(j)>list.getLast()) {
					list.add(s.charAt(j));
				}
			}
			if(list.size()>max.size()) {
				max.clear();
				max.addAll(list);
			}
			list.clear();
		}
		System.out.println(max.toString());
	}

}
