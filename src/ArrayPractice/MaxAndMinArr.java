package ArrayPractice;

public class MaxAndMinArr {

    public static void main(String[] args) {
        int max = 0;
        int min = 0;
         int [] myArr = {5,12,4,6,7,8,15,9,11,3};
        {
            for (int j = 0; j <myArr.length ; j++) {
              if(myArr[j] > max){
                  max = myArr[j];
               if (myArr[j] < min){
                   min = myArr[j];
               }
              }
            }
        }
        System.out.println("max:"+max);
        System.out.println("min:" +min);


    }


}
