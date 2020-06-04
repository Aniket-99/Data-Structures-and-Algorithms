import java.util.*;
import java.io.*;

public class Urlify{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String word = sc.nextLine();

		char [] toChar = word.toCharArray();
		int length = word.length();
		replaceSpaces(toChar, length);
	}

	static void replaceSpaces(char[] str, int trueLength){
		int spaceCount = 0, index; 
		int i = 0;
		for (i = 0; i < trueLength ;i++) {
			if(str[i] == ' '){
				spaceCount++;
			}
		}

		index = trueLength + spaceCount * 2;

		if (trueLength < str.length){
			str[trueLength] = '\0';
		}

		for (i = trueLength - 1; i >=0 ; i--) {

			if(str[i] == ' '){
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			}
			else{
				str[index - 1] = str[i];
				index--;
			}
		}
		System.out.println("The string after replaces spaces is: "+str);
	}
}