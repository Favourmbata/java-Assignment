package Strings;

public class LowerCaseToUpperCase {
    public static void convertLowerCaseToUpperCase(){
        String name = "favour mbata shola";

        char[] extractCharacter = name.toCharArray();
        int size = extractCharacter.length;
        extractCharacter[0] = (char) (extractCharacter[0] - 32);
        int i = 1;
        while (i != size){
           if (extractCharacter[i] == ' '){
               extractCharacter[i+1] = (char) (extractCharacter[i+1] - 32);
           }

            i++;
        }
        System.out.println(name);
        System.out.println(extractCharacter);
    }

    public static void main(String[] args) {
        convertLowerCaseToUpperCase();
    }
}
