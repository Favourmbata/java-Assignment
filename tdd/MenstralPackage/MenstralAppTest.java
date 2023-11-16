package MenstralPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstralAppTest  {
 @Test
 public void testThatUserCanGetOvulationDate(){
    MenstralApp menstralApp = new MenstralApp("2023-10-17",26);
    String ovulationDate = menstralApp.getOvulationDate();
    assertEquals("2023-10-12",ovulationDate);
 }



}