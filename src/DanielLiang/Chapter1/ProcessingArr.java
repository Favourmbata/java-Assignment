package DanielLiang.Chapter1;

import java.util.Scanner;

public class ProcessingArr {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double[]myArr = new double[6];
         int total = 0;
        for (int i = 0; i < myArr.length; i++) {
            while (true) {
                System.out.println("enter score " + (i + 1));
                myArr[i] = scanner.nextDouble();
              total += myArr[i];
                break;
            }

        }
        System.out.println(total);
    }

    }
