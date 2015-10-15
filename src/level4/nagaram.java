package level4;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class nagaram
{
	

	static boolean isAnagram(String A, String B)
	{
		if(A.length() != B.length()) {
			return false;
		}
		for(int i = A.length()-1; i >= 0; i--) {
			if(B.contains(A.substring(i, i+1))) {
				String letter = A.substring(i, i+1);
				A = A.replaceFirst(letter, "");
				B = B.replaceFirst(letter, "");
				if(A.isEmpty() || B.isEmpty()) {
					return true;
				}
			} 
		}
		
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}
}
