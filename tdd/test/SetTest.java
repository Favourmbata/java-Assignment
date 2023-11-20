package test;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SetTest {
    @Test
    public void testThatSet_isEmpty(){
        Set mySet = new Set(10);
        System.out.println(mySet.isEmpty());
        assertTrue(mySet.isEmpty());
    }


   @Test
    public void testThatSet_canBeAdded(){
       Set mySet = new Set(10);
       assertTrue(mySet.isEmpty());
       mySet.add(3);
       mySet.add(4);
       mySet.add(5);
       mySet.add(50);
       assertFalse(mySet.isEmpty());
   }

   @Test
    public void testThatSet_Element_IsContain(){
       Set mySet = new Set(10);
       mySet.add(3);
       mySet.add(4);
       mySet.add(5);
       mySet.add(50);
       mySet.add(3);
       mySet.contains(3);
      assertTrue(mySet.contains(4));
      assertTrue(mySet.contains(50));
   }

  @Test
    public void testThatSet_Element_DoesNotReturn_Duplicate(){
      Set mySet = new Set(10);
      mySet.add(3);
      mySet.add(4);
      mySet.add(50);
      mySet.add(50);
      assertFalse(mySet.contains(3));
      assertFalse(mySet.contains(3));
      assertTrue(mySet.contains(3));
  }
}
