package HackerRack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);
        int multiplier = scanner.nextInt();

        for(int i = 1; i <= 10 ; i++) {

            System.out.printf("%d x %d = %d %n",multiplier,i,i * multiplier);
        }
         
    }
       }


