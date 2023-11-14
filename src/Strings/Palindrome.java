package Strings;
public class Palindrome {

        public static void validateString () {
            String character = "too Hot to HOOT";
            character = character.toUpperCase();
            character = character.replace(" ", "");
            char pick[] = character.toCharArray();
            int size = pick.length;
            char newValue[] = new char[size];
            int index = 0;
            while (index != size) {
                newValue[index] = pick[index];
                index++;
            }
            index = 0;
            while (index != size) {
                if (newValue[index] != pick[index]) {
                    System.out.println("Not a palindrome:");
                    System.exit(0);
                } else {
                    index++;
                    continue;
                }
            }
            System.out.println("Palindrome:");

        }

        public static void main (String[]args){
            validateString();
        }
    }
