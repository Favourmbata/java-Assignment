package test;

public class ArrayList {


    private boolean isEmpty = true;
    private int size;
    private int[] elements = new int[10];


    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int number) {
        if (elements.length == 10) {
            int[] newArray = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
        elements[size] = number;
        size++;

    }

    public boolean remove(int number) {
        for (int i = 0; i < elements.length ; i++) {
            if(elements [i] != number){
                size--;
            }return true;
        }
        return false;

    }

    public int getSize() {
        int goat = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != 0) goat++;
        }
        return goat;
    }

    public void clear(int number) {
        this.size = 0;
        for (int i = 0; i < size; i++) {
            this.remove(number);
        }
    }


    public boolean contains(int element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element)
                return true;
        }
        return false;
    }

    public int get(int index) {
        return elements[index];
    }

    public boolean returnsToAllElement() {

        int[] goat = new int[getSize()];
        for (int i = 0; i < getSize(); i++) {
            goat[i] = elements[i];
        }
        for (int i = 0; i < getSize(); i++) {
//            System.out.printf(" %d ", goat[i]);
        }

        return true;

    }



    public int set(int item) {
        for (int i = 0; i < elements.length ; i++) {

        }
        return 0;
    }
}