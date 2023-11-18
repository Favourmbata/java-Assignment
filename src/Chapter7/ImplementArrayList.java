package Chapter7;

public class ImplementArrayList {
    private boolean isEmpty = true;

    private  int size ;
    private int element;
    private  int[] numberOfElement = new int[10];

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean add(int number) {
       size++;
       numberOfElement[size] = number;
        return true;
    }

    public boolean addAll(int number) {

        return true;
    }

    public void clear(int number) {
        this.size = 0;
        for (int i = 0; i < size ; i++) {
            this.remove(number);
        }
//        return isEmpty;

    }

    public boolean remove(int number) {

        size--;
        return false;
    }

    public int getSize() {
        return size;
    }

    public boolean contains(int number) {
       this.element = number;
       boolean foundElement = true;
        for (int i = 0; i < numberOfElement.length ; i++) {
            numberOfElement[i] = number;

        }
        for (int i = 0; i < numberOfElement.length ; i++) {
            if (numberOfElement[i] != number){
                return foundElement;

            }else {

            }
        }
        return false;
    }

    public int[] getArrayList() {
        return numberOfElement;
    }
    public void setElement(int number1, int number2) {
    int []num = new int[numberOfElement.length];
        for (int index = 0; index < numberOfElement.length ; index++) {
            if (index == number1){
                num[index] = size;
            }
        }
            this.numberOfElement = num;
        }

}


