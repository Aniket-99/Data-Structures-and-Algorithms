import java.util.*;
import java.io.*;

public class BackspaceStringCompare{
	public static void main(String[] args) {
		//String firstString = "ab#c";
		//String secondString = "ad#c";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String firstString = sc.nextLine();

		System.out.println("Enter the second string: ");
		String secondString = sc.nextLine();

		System.out.println(compare(firstString, secondString));
	}

	static boolean compare(String firstString, String secondString){
		int firstPointer = firstString.length() - 1;
		int secondPointer = secondString.length() - 1;

		int firstSkips = 0;
		int secondSkips = 0;

		while(firstPointer >= 0 || secondPointer >= 0){

			while(firstPointer > 0){
				if (firstString.charAt(firstPointer) == '#') {
					firstSkips += 1;
					firstPointer -= 1;
				}
				else if(firstSkips > 0){
					firstSkips -= 1;
					firstPointer -= 1;
				}
				else{
					break;
				}
			}

			while(secondPointer >= 0){
				if (secondString.charAt(secondPointer) == '#') {
					secondPointer -= 1;
					secondSkips += 1;
				}
				else if(secondSkips > 0){
					secondSkips -= 1;
					secondPointer -= 1;
				}
				else{
					break;
				}

			}

			if (firstPointer >= 0 && secondPointer >= 0 && firstString.charAt(firstPointer) != secondString.charAt(secondPointer)) {
				return false;
			}

			if ((firstPointer >= 0) != (secondPointer >= 0)) {
				return false;
			}

			firstPointer--;
			secondPointer--;

		}

		return true;
	}
}