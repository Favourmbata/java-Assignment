package ArrayTask;

public class CumulativeArr {
    public static void findPair(int[] myArr, int target) {

        for (int i = 0; i < myArr.length  ; i++) {
            for (int j = 0; j < myArr.length; j++) {
                if(myArr[i] + myArr[j] == target){
                    System.out.printf("pair found (%d %d)",myArr[i],myArr[j]);
                  return;
                }
            }
        }
        System.out.println("pair not found");
    }

    public static void main(String[] args) {
        int []myArr = {8,7,2,5,3,1};
        int target = 10;
        findPair(myArr,target);
    }
 }

