package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    @Test
    public void newArrayListIsEmptyTest(){
        MyArrayList strings = new MyArrayList();
        assertTrue(strings.isEmpty());
    }

 @Test
    public void addOneElement_ListIsNotEmpty(){
     MyArrayList strings = new MyArrayList();
     assertTrue(strings.isEmpty());
     strings.add("G_string");
     assertFalse(strings.isEmpty());

 }
@Test
 public void addOneElement_RemoveOneElement_ListIsEmpty(){
     MyArrayList strings = new MyArrayList();
     assertTrue(strings.isEmpty());
     strings.add("G_string");
     assertFalse(strings.isEmpty());
     strings.remove("G_strings");
     assertTrue(strings.isEmpty());
 }

 @Test
 public void addThreeElemen_sizeIsThreeTest(){
      MyArrayList strings = new MyArrayList();
      assertTrue(strings.isEmpty());
      strings.add("G_string");
      strings.add("D_string");
      strings.add("E_string");
      assertEquals(3,strings.getsize());

  }

  @Test
    public void addThreeElement_getElement_RemoveElement(){
      MyArrayList strings = new MyArrayList();
      assertTrue(strings.isEmpty());
      strings.add("G_string");
      strings.add("favour");
      strings.add("lucky");
      strings.remove("favour");
      assertEquals(2,strings.getsize());
  }
   @Test
    public void addFourElement_getElement_ClearAllInTest(){
       MyArrayList strings = new MyArrayList();
       assertTrue(strings.isEmpty());
       strings.add("school");
       strings.add("church");
       strings.add("bible");
       strings.add("baby");
       strings.remove("school");
       strings.remove("church");
       strings.remove("bible");
       strings.remove("baby");
       assertTrue(strings.clear());
   }

}
