package test;

public class Target {

//    public  static int getTarget(int[] numbers) {
//
//    }

    public int[] getIndeces(int[] numbers) {
        int [] result =  new int[numbers.length];
        for (int i = 0; i < numbers.length ; i++) {
            int index = numbers[i];
            for (int j = i + 1; j < numbers.length ; j++) {
                if (numbers[i] == numbers [j]){
                 
                }


            }

        }
        return  numbers;
    }
}
