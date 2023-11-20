package test;

import org.junit.jupiter.api.Test;

public class ImplentingQueue {

    private  int [] queue;
    private int size;
   private int rearOrTail;
   private int frontOrHead;

   public  ImplentingQueue(int sizeOfArray){
       queue = new int[sizeOfArray];

        int size = 0;
        int rearOrTail = -1;
        int frontOrHead = -1;
   }

    public boolean isEmpty() {
    boolean response = false;
    if (size == 0){
        response = true;
    }
    return response;
    }


    public boolean add(int element) {
     boolean response = false;
     if (rearOrTail != queue.length-1){
         rearOrTail++;
         queue[rearOrTail] = element;
         size++;
         response = true;
     }
     return response;
    }


    public int remove() {
    int response = 0;
    if (size != 0){
        frontOrHead++;
        response = queue[frontOrHead +1];
//        size--;
    }
    return response;
   }


    public int peek() {
    int response = 0;
    if (!isEmpty()){
        response = queue[frontOrHead +1];

    }
     return response;

   }

    public int getSize() {
   return size;
    }
}
