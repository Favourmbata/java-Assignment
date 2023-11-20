package Chapter4;

public class Personal {
    Object arr[];
    int si;
    int capacity;

    void ArrayList() {
        capacity = 10;
        si = 0;
        arr = new Object[capacity];
    }

    public void add(Object item){
        arr [si++] = item;
    }

   Object get(int index){
        return arr[index];
   }
       int size() {
           return si;
       }


       public static void main(String[] args) {

       }
   }



