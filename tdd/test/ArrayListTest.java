package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayListTest {
    @Test
    public void TestThatArrayList_IsEmpty() {
        ArrayList myList = new ArrayList();
        System.out.println(myList.isEmpty());
//              myList.add(10);
//        assertTrue(myList.isEmpty());
    }

    @Test
    public void testThatArrayListCanBeAdded() {
        ArrayList myList = new ArrayList();
        assertTrue(myList.isEmpty());
        myList.add(10);
        myList.add(50);
        myList.add(5);
        assertFalse(myList.isEmpty());

    }

    @Test
    public void testThatArrayListCanBeRemoved() {
        ArrayList myList = new ArrayList();
        myList.add(10);
        myList.add(50);
//        System.out.println(myList.remove(10));
        assertTrue(myList.remove(10));


    }

    @Test
    public void testThatArrayList_GetSize() {
        ArrayList myList = new ArrayList();
        myList.add(10);
        myList.add(50);
        myList.getSize();
        assertEquals(2, myList.getSize());
    }

    @Test
    public void testThatArrayList_clear() {
        ArrayList myList = new ArrayList();
        myList.add(10);
        myList.add(50);
        myList.clear(10);
        myList.clear(50);
        assertTrue(myList.isEmpty());

    }

    @Test
    public void testThatArrayListDot_Contains() {
        ArrayList myList = new ArrayList();
        myList.add(10);
        myList.add(50);
        assertTrue(myList.contains(10));
        assertFalse(myList.contains(2));
    }

    @Test
    public void testThatArrayListCan_GetElement() {
        ArrayList myList = new ArrayList();
        myList.add(10);
        myList.add(50);
        myList.add(500);
        myList.add(800);
        assertEquals(500, myList.get(2));
    }
   @Test
    public void testThatArrayList_GetAllElement_FromFirstToLast(){
       ArrayList myList = new ArrayList();
       myList.add(10);
       myList.add(50);
       myList.add(500);
       myList.add(800);
       myList.add(500);
       myList.add(40);
       assertTrue(myList.returnsToAllElement());


       }
      @Test
    public void testThatArrayList_canSetElement_AndReplaceAnItem_ATTheSpecifiedPosition(){
          ArrayList myList = new ArrayList();
          myList.add(10);
          myList.add(50);
          myList.add(500);
          assertEquals(2,myList.set(200));
      }


   }
