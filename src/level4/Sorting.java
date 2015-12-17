package level4;

public class Sorting {

	public static void sort(String[] testArray) {

		for (int i = testArray.length; i > -1; i--) {
			if (testArray[i - 1].compareTo(testArray[i]) > 0) { // thing before it comes after it in the alphabet
				String holder = testArray[i];
				testArray[i] = testArray[i - 1];
				testArray[i - 1] = holder;
			}
		}

	}

}
