package ArrayAssigment;

public class ElementInEvenPosition {

    public static void elementInEvenPosition(){
        int [] numbers = {10,333,32,46,17,63,55,40,81};
        for (int i = 0; i <numbers.length ; i++) {
            if(i % 2 == 0){
                System.out.println(numbers[i]);


            }
        }

    }

    public static void main(String[] args) {
 elementInEvenPosition();
    }
    }



