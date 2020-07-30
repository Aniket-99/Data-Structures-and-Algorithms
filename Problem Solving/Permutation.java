import java.util.*;
import java.io.*;

public class Permutation{
	public static void main(String[] args) {
		//String str = "ABC";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int n = str.length();
		System.out.println("The permutation of the given string is: ");
		permute(str, 0, n-1); 
	}

	static void permute(String str, int l, int r){
		if (l == r) {
			System.out.println(str);
		}

		for (int i = l; i <= r ; i++) {
			str = swap(str, l, i);
			permute(str, l+1, r);
			str = swap(str, l, i);
		}
	}

	static String swap(String str, int i, int j){
		char[] charArray = str.toCharArray();
		char temp;
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;

		return String.valueOf(charArray);

	}
}