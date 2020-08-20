import java.util.*;
import java.io.*;

public class PermutationOfPhoneNumbers {
	public static void main(String[] args) {
		//String digits = "2345";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String digits = sc.nextLine();

		List<String> res = letterCombinations(digits);
		System.out.println("The combination of numbers is: ");
		for (String element : res) {
			System.out.println(element);
		}
	}


	static List<String>	letterCombinations(String digits){
		LinkedList<String> resultArray = new LinkedList();

		if (digits.length() == 0) {
			return resultArray;
		}
		resultArray.add("");

		String[] characterMapPhone = new String[] {"0","1","abc","def","ghi","jkl",
												"mno","pqrs","tuv","wxyz"};

		for (int i = 0; i < digits.length(); i++) {
			int index = Character.getNumericValue(digits.charAt(i));
			while(resultArray.peek().length() == i){
				String permutation = resultArray.remove();
				for (char c : characterMapPhone[index].toCharArray()) {
					resultArray.add(permutation + c);
				}
			}
		}
		return resultArray;
	}
}