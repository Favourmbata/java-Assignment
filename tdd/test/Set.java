package test;

public class Set {

    private boolean isEmpty = true;
    private int size = 0;
    private int[]elements = new int[10];

   private int capacity;

  public Set(int capacity){
      this.size = 0;
      this.capacity = capacity;
      this.elements = new int[capacity];
  }

    public boolean isEmpty() {
    if (size == 0){
        return true;
    }
     return false;
    }

    public boolean add(int element) {
      if (!contains(element))
          if (size < capacity){
              elements[size++] = element;
          }

        return false;
    }

    public boolean contains(int element) {
        for (int i = 0; i < size ; i++) {
            if(elements[i] == element){
                return true;
            }
        }
        for (int i = 0; i < size ; i++) {
            if (elements[i] != element){
            }
        }
        return false;
    }
}
