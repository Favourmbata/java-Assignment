package test;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeautifulStringTest {
    @Test
    public void beautifyStringToAddFullStop(){
//        BeautifulString beautifulString = new BeautifulString();
        String result = BeautifulString.addFullStopTo("favour");
        assertEquals("favour.",result);
    }


     @Test
    public void capitlisefirstLetters(){
         String result = BeautifulString.capitaliseFirstLetterIn("favour");
         assertEquals("Favour",result);
     }

  @Test
    public void stringsAreBeautifiiedTest(){
        String result = BeautifulString.beautify("i am a copper");
        assertEquals("I am a copper.",result);
  }

  @Test
    public void addFullStopTo(){
        String result = BeautifulString.addFullStopTo("favour.");
        assertEquals("favour.",result);
  }
 }
