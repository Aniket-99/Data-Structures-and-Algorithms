import java.util.*;
import java.io.*;

// Time complexity: O(n)

public class FirstNonRepeatingCharacter{
	public static void main(String[] args) {
		//String s = "aawbbcc";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();

		char res = FirstNonRepeatingCharacterUsingIndex(s);

		if (res!='!') {
			System.out.println("The first non repeating character is: "+res);	
		}
		else{
			System.out.println("No first non repeating character found");
		}

	
	}

	static char firstNonRepeating(String s){
		HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (charCounts.containsKey(c)) {
				charCounts.put(c,charCounts.get(c) + 1);
			}
			else{
				charCounts.put(c, 1);
			}

		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (charCounts.get(c) == 1) {
				return c;
			}
		}
		return '!';

	}

	static char FirstNonRepeatingCharacterAlternative(String s){
		int[] charCounts = new int[26];

		for(char c: s.toCharArray()){
			charCounts[c-'a']++;
		}

		for (char c : s.toCharArray()) {
			if (charCounts[c-'a'] == 1) {
				return c;
			}
		}
		return '!';

	}

	static char FirstNonRepeatingCharacterUsingIndex(String s){
		for(int i = 0; i < s.length(); i++){
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				return s.charAt(i);
			}
		}
		return '!';
	}	

}