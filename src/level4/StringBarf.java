package level4;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringBarf {
	public static void main(String[] args) {
		
	}
	
			@Test
			public void test() {
				assertEquals("frab", reverseMe("barf"));
			}

			private String reverseMe(String string) {
				StringBuilder builder = new StringBuilder();
				
				for(int i = 0; i < string.length(); i++) {
					
					builder.append(string.substring(string.length()-1-i, string.length()-i));
					}
				return builder.toString();
			}
}
