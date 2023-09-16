package Chapter4B;

public class Subtacting {

    public int[] getArr (int[] array){

        int counter = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 1){
                counter++;
            }
        }
        int[]newArr = new int[counter];

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (array[j] % 2 != 0) {
                   newArr[i]= array[j];
                    newArr[i]-=2 ;
                    i++;
            }
            }
        }
     return newArr;
    }



}
