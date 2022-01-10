package Test;

public class TestJ1 {
//Thanks for updates
	public static void main(String[] args) {
		double x = 4;
		double y = 10;
		System.out.println(y/x);
		
		String str = "DAADA";
		Palindrome(str);

	}
	public static void Palindrome(String str) {
		String rev = "";
		for(int i = str.length()-1; i >=0; i-- ) {
			rev += str.charAt(i);
			
		}
		if(str.equals(rev)) {
		System.out.println("the word "+ str + " is palindrome.");
	}
		else {
			System.out.println("the word "+ str + " is not palindrome.");
		}
	}
}
