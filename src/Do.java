import java.util.ArrayList;
import java.util.List;

public class Do {
    private  int []array = new int[10];

    private int size = 0;
    public void add(int num){
        array[size] = num;
        size++;
        if (size == array.length){
            int[]newArray = new int[array.length* 2];
            for (int i = 0; i < array.length ; i++) {
                newArray[i] = array[i];
            }
         array = newArray;
        }
    }

    public void remove(int index){
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
       size--;
    }

    public int getSize() {
        return size;
    }

    public int get(int index){
       if (index >=0 && index < size){
           return array[index];
       }
       return 0;
    }

}