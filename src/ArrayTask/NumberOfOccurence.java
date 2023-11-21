package ArrayTask;

public class NumberOfOccurence {

//    write a program that displays the number of
//    occurence of an element in the array.

    public static void main(String[] args) {
        int [] numbers = {1,2,3,2,2,4,2};
        int seachElement = 2;
        System.out.println(getNumberOccurence(numbers,seachElement));
    }

   public static int getNumberOccurence(int [] numbers,int elementSearch){
        int occurence = 0;
       for (int i = 0; i < numbers.length ; i++) {
           if (numbers[i] == elementSearch){
               occurence++;
           }
       }
        return occurence;
    }
}
