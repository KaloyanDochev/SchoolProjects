package Sets;

import java.util.LinkedList;

public class Z7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> test = new LinkedList<>();
		for(int i=0;i<5_000_000; i++) {
			test.add(i);
		}

		int a = -1;
		for(Integer chislo : test) {
			a=chislo;
		}
		System.out.println(a);
	}

}
