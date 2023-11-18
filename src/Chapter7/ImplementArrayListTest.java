package Chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class ImplementArrayListTest {

    @Test
    public void testThatArrayList_IsEmpty() {
        ImplementArrayList numbers = new ImplementArrayList();
        assertTrue(numbers.isEmpty());
    }



    @Test
    public void testThatArrayList_CanBeAdded() {
        ImplementArrayList numbers = new ImplementArrayList();
        assertTrue(numbers.isEmpty());
        numbers.add(2);
        System.out.println(numbers.add(2));
        assertFalse(numbers.isEmpty());
    }
        @Test
     public void testThatArrayList_MoreCanBeNumbersAdded() {
        ImplementArrayList numbers = new ImplementArrayList();
        assertTrue(numbers.isEmpty());
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        assertFalse(numbers.isEmpty());
    }


    @Test
    public void testThatArrayList_canAddAll() {
        ImplementArrayList numbers = new ImplementArrayList();
        assertTrue(numbers.isEmpty());
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.addAll(4);
        assertFalse(numbers.isEmpty());

    }

    @Test
    public void testThatArrayList_CanBeCleared() {
        ImplementArrayList numbers = new ImplementArrayList();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        assertFalse(numbers.isEmpty());
        numbers.clear(2);
        numbers.clear(3);
        numbers.clear(4);
        numbers.clear(5);
        assertTrue(numbers.isEmpty());
    }

    @Test
    public void testThatArrayList_CanAdd_AndCanBeRemove() {
        ImplementArrayList numbers = new ImplementArrayList();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        assertFalse(numbers.isEmpty());
        numbers.remove(4);
        assertEquals(2,numbers.getSize());
    }

    @Test
    public void testThatArrayList_CanAddOneElement_AndCanBeRemoveSameElement() {
        ImplementArrayList numbers = new ImplementArrayList();
        numbers.add(2);
        assertFalse(numbers.isEmpty());
        numbers.remove(2);
        assertEquals(0,numbers.getSize());
    }

    @Test
    public void testThatArrayListCanAdd_AndGetSize() {
        ImplementArrayList numbers = new ImplementArrayList();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        assertEquals(3, numbers.getSize());

    }

    @Test
    public void ThatArrayListContainsElement() {
        ImplementArrayList numbers = new ImplementArrayList();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        assertFalse(numbers.isEmpty());
        numbers.contains(5);
        System.out.println(numbers.contains(5));
//       assertTrue(numbers.contains(5));
    }
  @Test
    public void ThatArrayListCanAdd_AndReturnsAllElement(){
      ImplementArrayList numbers = new ImplementArrayList();
      int [] expected = {7, 3, 4, 1};
      numbers.add(7);
      numbers.add(3);
      numbers.add(4);
      numbers.add(1);
      for (int i= 0; i < numbers.getSize(); i++) {
          assertEquals(expected[i], numbers.getArrayList()[i]);
      }
      }



   @Test
    public void testThatArrayList_SetElement(){
       ImplementArrayList numbers = new ImplementArrayList();
       assertTrue(numbers.isEmpty());
       numbers.add(7);
       numbers.add(3);
       numbers.add(4);
       numbers.add(1);
       numbers.setElement(3,25);

   }


}