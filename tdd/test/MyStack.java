package test;

public class MyStack {

    private boolean isEmpty = true;
    private int size;
    private String[] elements;

    public MyStack(){
        int defaultSize = 5;
        elements = new String[defaultSize];
    }
    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public void add(String element) {
        if (isFull()) throw new StackOverflowError("stack over flow;cannot add element,stack is full");
        elements[size++] = element;
    }

    public String pop(String element) {
        if (isEmpty) size--;
        return elements[size];
    }


    public int size() {
        return size;
    }

    public String peek() {
        return elements[size - 1];
    }

    public boolean isFull() {
    return  size == elements.length;
    }






}