package test;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ImplentingQueueTest {
    @Test
    public void TestThatQueue_IsEmpty(){
        ImplentingQueue queue = new ImplentingQueue(10);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void TestThatQueue_CanBeInsertedOrAdded_FirstInFirstOut(){
        ImplentingQueue queue = new ImplentingQueue(10);
        assertTrue(queue.isEmpty());
        queue.add(500);
        queue.add(2000);
        queue.add(1000);
        assertFalse(queue.isEmpty());

    }

  @Test
    public void TestThatQueue_CanBeRemove_FirstInFirstOut(){
      ImplentingQueue queue = new ImplentingQueue(10);
      assertTrue(queue.isEmpty());
      queue.add(500);
      queue.add(2000);
      queue.add(1000);
      queue.remove();
      assertEquals(500,queue.remove());
  }
    @Test
    public void TestThatQueueCanReturnElementAtTheFront_WithoutRemoving_peek(){
        ImplentingQueue queue = new ImplentingQueue(10);
        queue.add(500);
        queue.add(2000);
        queue.peek();
        assertEquals(500,queue.peek());
    }

   @Test
    public void TestThatQueueReturnsSize(){
       ImplentingQueue queue = new ImplentingQueue(10);
       queue.add(500);
       queue.add(2000);
       queue.getSize();
       assertEquals(2,queue.getSize());


   }

}
