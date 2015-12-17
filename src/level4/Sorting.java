package level4;

import java.util.ArrayList;

public class Sorting {
	public static void sort(String[] testArray) {
		String[] sortedArray = {};
		ArrayList<String> strings = new ArrayList<String>();
		for(int i = 0; i < testArray.length; i++) {
			if(testArray[i].compareTo(testArray[i+1]) < 0) {
				strings.add(testArray[i]);
			}
		}
		System.out.println(strings);
	}



}
