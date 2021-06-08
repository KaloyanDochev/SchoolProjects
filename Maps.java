package Sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Maps {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>(){{
			put("USA","Washington");
			put("Greece","Athens");
			put("Bulgaria","Sofia");
			put("Canada","Ottawa");
		}};
		int score = 0;
		System.out.println("Guess the capital!");
		List<String> keys = new ArrayList(map.keySet());
		Collections.shuffle(keys);
		Scanner sc = new Scanner(System.in);
		for(String key : keys) {
			System.out.println("Capital of "+key + "?");
			String capital = sc.nextLine();
			if(capital.equals(map.get(key))){
				score++;
			}
		}
		System.out.println("Score: "+score);
	}

}
