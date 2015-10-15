package level4;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest
{

	@Test
	public void test()
	{
		assertEquals(nagaram.isAnagram("anagram", "anagram"), true);
		assertEquals(nagaram.isAnagram("m", "anagram"), false);
		assertEquals(nagaram.isAnagram("llpo", "poll"), true);
		assertEquals(nagaram.isAnagram("rraaaar", "anagram"), false);
		
	}

}
