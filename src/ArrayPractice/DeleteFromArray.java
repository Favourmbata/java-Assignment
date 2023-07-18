package ArrayPractice;

import java.util.Arrays;

public class DeleteFromArray {

public static void deleteFromArray(){
     int [] firstArray = {12,23,11,56,79};
    System.out.println("Original Array"+ Arrays.toString(firstArray));
     int index = 2;
    int [] newArray = new int[firstArray.length -1];
    for (int i = 0; i < firstArray.length; i++) {
      if (i == index){
         continue;
      }
       newArray[i++] = firstArray[i];
    }
    System.out.println("New Array " + Arrays.toString(firstArray));
}

    public static void main(String[] args) {
 deleteFromArray();
    }
}
