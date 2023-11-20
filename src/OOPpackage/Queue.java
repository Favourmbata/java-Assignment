package OOPpackage;

public class Queue {
    int []queue;
    int rearOrTail;
    int frontOrHead;
    int size;
    public Queue(int sizeOfArray){
        queue = new int[sizeOfArray];
        rearOrTail = -1;
        frontOrHead = -1;
        size = 0;

    }
  public boolean isEmpty(){
        boolean response = false;
        if (size == 0){
            response = true;
        }

     return response;
    }

    public boolean add(int element){
        boolean response = false;
        if (rearOrTail != queue.length-1){
            rearOrTail++;
            queue[rearOrTail] = element;
            size++;
            response = true;
        }
     return response;
    }

   public int remove(){
        int response = 0;
        if(size != 0){
            frontOrHead++;
            response = queue[frontOrHead];
            size--;
        }
        return response;
   }

   public int peek(){
        int response = 0;
        if (!isEmpty()){
            response = queue[frontOrHead +1];
        }
      return response;

    }
   public int getSize(){
        return size;
   }

}
