package level4;

import java.util.ArrayList;

public class Sorting {
	public static void sort(String[] testArray) {
		String[] sortedArray = {};
		ArrayList<String> strings = new ArrayList<String>();
		for(int i = 0; i < testArray.length; i++) {
			if(i == testArray.length-1) {
				strings.add(testArray[i]);
			}
			else if(testArray[i].compareTo(testArray[i+1]) < 0) {
				strings.add(testArray[i]);
			}
			
		}
		
		for( int j = 0; j < testArray.length; j++) {
			if(j == 0) {
				sortedArray[j] = strings.get(j);
			} else {
				if(strings.get(j).compareTo(sortedArray[j-1]) < 0) {
					
				} else {
					sortedArray[j] = strings.get(j);
				}
			}
			
		}
		
	}



}
