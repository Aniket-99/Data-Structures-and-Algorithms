import java.util.*;
import java.io.*;

public class ValidPalindrome{
	public static void main(String[] args) {
		//String s = "raceacar";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string to check for palindrome: ");
		String s = sc.nextLine();

		System.out.println(isPalindrome(s));
	}


	static boolean isPalindrome(String s){
		String cleanedString = "";

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c) || Character.isLetter(c)) {
				cleanedString = cleanedString + c;
			}
		}

		cleanedString = cleanedString.toLowerCase();

		int leftPointer = 0;
		int rightPointer = cleanedString.length() - 1;

		while(leftPointer <= rightPointer){
			if (cleanedString.charAt(leftPointer) != cleanedString.charAt(rightPointer)) {
				return false;
			}

			leftPointer++;
			rightPointer--;
		}
		return true;

	}
}