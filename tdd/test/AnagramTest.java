package test;

import chapter3.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
    @Test
    public void testThatComparesString(){
        Anagram anagram = new Anagram();
       String character2 = "1100";
       String character1 = "1011";
       boolean result = anagram .compare(character1,character2);

        assertTrue(result);

    }


   @Test
    public void testThatIsPalindrome(){
        Anagram anagram = new Anagram();
        String word = "madamm";
        assertEquals(true,anagram.isPalindrome(word));
    }


}
