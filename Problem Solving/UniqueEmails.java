import java.util.*;
import java.io.*;

public class UniqueEmails{
	public static void main(String[] args) {
		String[] emails = {"test.mail+abc@gmail.com","test.email@gmail.com, test@gmail.com"};
		
		int result = numberOfUniqueEmails(emails);
		System.out.println("The number of unique email is: "+result);

	}

	static int numberOfUniqueEmails(String[] emails){
		HashSet<String> uniqueEmails = new HashSet<>();

		for (String email : emails) {
			int atPosition = email.indexOf("@");
			String localName = email.substring(0, atPosition);
			String domainName = email.substring(atPosition);

			if (localName.contains("+")) {
				int plusPosition = email.indexOf("+");
				localName = email.substring(0, plusPosition);
			}

			localName = localName.replaceAll("\\.","");
			String cleanedName = localName + domainName;
			uniqueEmails.add(cleanedName);
		}

		return uniqueEmails.size();
	}
}