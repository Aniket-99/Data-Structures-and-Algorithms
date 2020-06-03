import java.util.*;
import java.io.*;

public class Unique {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String to check its uniqueness: ");
		String word = sc.nextLine();
		
		boolean result = isUnique(word);

		if (result == true){
			System.out.println("The given String is Unique");
		}
		else{
			System.out.println("The given String is not Unique");
		}

	}

	static boolean isUnique(String word){

		if (word.length() > 128){
			return false;
		}

		boolean[] check = new boolean[128];

		for (int i = 0; i < word.length() ; i++ ) {

			int val = word.charAt(i);
			if (check[val]) {
				return false;
			}

			check[val] = true;
		}

		return true;


	}
}