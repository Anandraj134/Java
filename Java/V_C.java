import java.util.Scanner;

public class V_C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a character to check:");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(ch + " is a Vowel.");
				break;
			default:
				System.out.println(ch + " is a Consonant.");
		}
	}
}