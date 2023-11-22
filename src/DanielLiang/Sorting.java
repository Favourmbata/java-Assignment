package DanielLiang;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int [] numbers = {5,3,4,10,1};
        for (int i = 0; i < numbers.length ; i++) {
            Arrays.sort(numbers);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
