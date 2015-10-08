package level4;

import java.util.ArrayList;
import java.util.Scanner;

public class DasTextReader {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstString = scanner.next();
		String secondString = scanner.next();
//		System.out.println(firstString.length());
//		System.out.println(secondString.length());
//		if(firstString.compareTo(secondString)<0) {
//			System.out.println(firstString + " goes before " + secondString + " lexicographical");
//		} else {
//			System.out.println(secondString + " goes before " + firstString + " lexicographical");
//		}
//		System.out.println(firstString.toUpperCase());
//		System.out.println(secondString.toUpperCase());
		if(firstString.length() == secondString.length()) {
			for(int i = 0; i < firstString.length(); i++) {
				System.out.println(firstString.charAt(i));
			}
			
			
			
		}

		
	}

}
