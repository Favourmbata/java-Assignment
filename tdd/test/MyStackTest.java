package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void testThatStack_IsEmptyTest(){
        MyStack  stack = new MyStack();
        Assertions.assertTrue(stack.isEmpty());
    }

      @Test
    public void testThatStack_canAddOneElement(){
          MyStack  stack = new MyStack();
          Assertions.assertTrue(stack.isEmpty());
          stack.add("favy");
          Assertions.assertFalse(stack.isEmpty());
      }
    @Test
    public void testThatStack_pushOneElement_PopOneElement_isEmpty(){
        MyStack  stack = new MyStack();
        stack.add("favy");
        stack.pop("favy");
        assertTrue(stack.isEmpty());
    }
   @Test
    public void testThatStack_pushTwoElement_PopOnce_StackIsNotEmpty(){
       MyStack  stack = new MyStack();
       stack.add("favy");
       stack.add("BigCola");
       stack.pop("BigCola");
       Assertions.assertFalse(stack.isEmpty());
   }

  @Test
    public void testThatStack_PushThreeElement_SizeIsThreetest(){
      MyStack  stack = new MyStack();
      stack.add("favy");
      stack.add("BigCola");
      stack.add("PlantainChips");
      Assertions.assertEquals(3, stack.size());
  }

   @Test
    public void testThatPushOne_Peek_pushedElement_IsReturned(){
       MyStack  stack = new MyStack();
       stack.add("favy");
       stack.add("baby");
       stack.add("my love");
       assertEquals("my love",stack.peek());

   }

   @Test
    public void testThatPushThree_PopOne_LastPushedElement_IsReturned(){
       MyStack  stack = new MyStack();
       stack.add("favy");
       stack.add("baby");
       stack.add("flowerGirl");
       stack.pop("favy");
       assertEquals("baby",stack.peek());
   }

   @Test
    public void testThatPushThree_PopOne_PeekOne_SecondPushElement_IsReturned(){
       MyStack  stack = new MyStack();
       stack.add("favy");
       stack.add("baby");
       stack.add("samuel shola");
       stack.pop("baby");
       assertEquals("baby",stack.peek());
   }

   @Test
    public void testThatStackHasFiveElement_StackIsFull(){
       MyStack  stack = new MyStack();
       stack.add("favy");
       stack.add("baby");
       stack.add("samuel shola");
       stack.add("dera");
       stack.add("ada");
//       stack.isFull();
       assertThrows(StackOverflowError.class,()-> stack.add("ada"));

   }
   @Test
    public void testThatPushOneElement_WhenStack_IsFull_ThrowsOverFlow(){
       MyStack  stack = new MyStack();
       stack.add("favy");
       stack.add("baby");
       stack.add("samuel shola");
       stack.add("dera");
       stack.add("ada");
       stack.add("family");

       assertThrows()
   }
}
