package ArrayTask;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckElement {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(7);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer number");
        int value = input.nextInt();

        if (arrayList.contains(value)){
            System.out.println("The element already exist");
        }else {
            arrayList.add(value);
            System.out.println("Entered element added to the list");
        }
        System.out.println("Arralist elements:"+arrayList);
    }
}
