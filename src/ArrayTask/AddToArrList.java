package ArrayTask;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AddToArrList {
    public static void main(String[] args)throws Exception {
       try {
           ArrayList<Integer>
                   arrayList = new ArrayList<>();
           arrayList.add(1);
           arrayList.add(2);
           arrayList.add(3);
           arrayList.add(4);
           arrayList.add(5);

           System.out.println("Before operation:" +arrayList);
            int i = arrayList.set(3,30);

           System.out.println("After operation:" +arrayList);

           System.out.println("Replaced element: " +i);

       }
       catch (IndexOutOfBoundsException e){
           System.out.println("Exception thrown" +e);
       }

    }
}
