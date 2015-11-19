package level4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class palindrome {

	public static void main(String[] args) throws IOException {
		palindrome pal = new palindrome();
		pal.doStuff();
	}

	private void doStuff() throws IOException {
		File words = new File("/Users/League/Desktop/words.txt");
		FileReader reader = new FileReader(words);
		BufferedReader buffy = new BufferedReader(reader);
		Stack<String> stack = new Stack<String>();
		int q = 0;
		while(buffy.readLine() != null) {
			String word = buffy.readLine();
			if(checkPalindrome(word)) {
				stack.push(word);
				q++;
			}
		}
		System.out.println(stack);
		System.out.println(q);
		

	}

	private boolean checkPalindrome(String line) {
		int matches = 0;
		for (int i = 0; i < line.length() / 2; i++) {
			String start = line.substring(i, i+1);
			if (start.equalsIgnoreCase(line.substring(line.length()-1-i, line.length()-i))) {
				matches++;
			}
		}
		if (matches == line.length() / 2) {
			return true;
		}
		return false;

	}
}

	
