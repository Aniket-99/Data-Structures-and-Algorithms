import java.util.*;
import java.io.*;

public class CheckPermutation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first word: ");
		String word1 = sc.nextLine();
		System.out.println("Enter second word: ");
		String word2 = sc.nextLine();

		boolean result = isPermutation(word1, word2);

		if (result == true){
			System.out.println("Strings are permutation of each other");
		}
		else{
			System.out.println("Strings are not permutation of each other");	
		}


	}

	static String sort(String str){
		char[] word = str.toCharArray();
		Arrays.sort(word);
		return new String(word);
	}

	static boolean isPermutation(String str1, String str2){
		if (str1.length() != str2.length()){
			return false;
		}

		return sort(str1).equalsIgnoreCase(sort(str2));
	}

}