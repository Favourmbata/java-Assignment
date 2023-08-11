package ArrayTask;

public class DivideTheIndexOfAnArray {

    //TODO wirte a method that take an int array as parameter
    // and an int target parameter and return a string array
    //TODO the method should divide the each
    // element at each index of the array by to and
    //TODO check if the divided value is greater than the target the method should tell
    //Todo if the divided value is less that the target the method should tell
    //todo if the divided value is equal to that the target the method should tell
     public String[] divideTheIndexOfAnArray(int [] myArr,int target) {

          for (int i = 0; i < myArr.length; i++) {
               myArr[i] = myArr[i] / 2;
               if (myArr[i] > target) {
                    System.out.println(myArr[i] + " ");
               }
               if (myArr[i] < target) {
                    System.out.println(myArr[i]);

               }
               if (myArr[i] == target) {
                    System.out.println(myArr[i] + "yes it is equal");
               }
          }
          String[] arr = new String[5];
       return arr;
     }

     public static void main(String[] args) {
          DivideTheIndexOfAnArray divideTheIndexOfAnArray = new DivideTheIndexOfAnArray();

     }


}
