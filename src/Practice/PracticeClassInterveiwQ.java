package Practice;

import java.util.HashMap;

public class PracticeClassInterveiwQ {

	public static void main(String[] args) {
		
		String str = "this is the first test in  this test you have to the best options";
		duplicate(str);
	
	}
	public static void duplicate(String str) {
		
		HashMap<String , Integer> temp = new HashMap<String , Integer>();
		HashMap<String , Integer> duplicates = new HashMap<String , Integer>();
		for (String key : str.split(" ")) {
			if(temp.containsKey(key)) {
				temp.put(key, temp.get(key)+1);
			}
			else {
				temp.put(key, 1);
			}
		}
		System.out.println(temp);
		for (String w : temp.keySet()) {
			if(temp.get(w)>1) {
				duplicates.put(w, temp.get(w));
			}
		}
		System.out.println(duplicates);
	}

}
