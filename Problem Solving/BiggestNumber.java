import java.util.*;
import java.io.*;

public class BiggestNumber{
	public static void main(String[] args) {
		Vector<String> array = new Vector<>();
		array.add("2"); 
        array.add("2123"); 
        array.add("111"); 
        array.add("22");
        printLargestNumber(array); 
	}

	static void printLargestNumber(Vector<String> array){
		Collections.sort(array, new Comparator<String>(){
			@Override

			public int compare(String s1, String s2){
				String first = s1 + s2;
				String second = s2 + s1;

				if (first.compareTo(second) > 0) {
					return -1;
				}
				else{
					return 1;
				}
			}
		});

		Iterator it = array.iterator();

		while(it.hasNext()){
			System.out.print(it.next());
		}
	}
}
