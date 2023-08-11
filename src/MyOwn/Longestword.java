package MyOwn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Longestword {

    public static void main(String[] args) throws FileNotFoundException {

//        public String findLongestWords (String longest_word) throw FileNotFoundException{

            String longest_word = " ";
            String current;
            Scanner scanner = new Scanner(new File("home/students/test.txt"));

            while (scanner.hasNextInt()) {
                current = scanner.next();
                if (current.length() > longest_word.length()) {
                    longest_word = current;
                }
            }
            System.out.println("\n" + longest_word + "\n");

        }


    }
//}