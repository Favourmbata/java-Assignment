package Chapter8;

public class MyArrayList {

    private boolean isEmpty = true;
    private int size;
    private String[] element = new String[5];


    public boolean isEmpty() {
    if (size == 0){
        return true;
    }else {
        return false;
    }

    }

    public void add(String elements) {
    size++;
    element[size] = elements;
    }

    public void remove(String gStrings) {
      size--;
    }

    public int getsize() {
    return size;
    }

    public boolean clear() {
    return true;
    }
}
