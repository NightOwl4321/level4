package level4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class palindrome {

	public static void main(String[] args) throws IOException {
		palindrome pal = new palindrome();
		pal.doStuff();
	}

	private void doStuff() throws IOException {
		File words = new File("/Users/League/Desktop/words.txt");
		FileReader reader = new FileReader(words);
		BufferedReader buffy = new BufferedReader(reader);

//		while(buffy.readLine() != null) {
//			checkPalindrome(buffy.readLine());
//		}
		checkPalindrome("noon");
	}

	private boolean checkPalindrome(String line) {
		int matches = 0;
		for (int i = 0; i < line.length() / 2; i++) {
			String start = line.substring(i, i+1);
			if (start.equalsIgnoreCase(line.substring(line.length()-i))) {
				
				System.out.println("ture");
				matches++;
			}
		}
		if (matches == line.length() / 2) {
			System.out.println(line);
			return true;
		}
		return false;
	}
}
