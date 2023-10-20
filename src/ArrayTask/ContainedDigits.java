package ArrayTask;

import java.util.Arrays;

public class ContainedDigits {

    public static int extract(String[] characters) {
        int add = 0;
        for (int count = 0; count < characters.length; count++) {

            String store = characters[count];
            for (int collectAndSave = 0; collectAndSave < store.length(); collectAndSave++) {
                char getAscil = store.charAt(collectAndSave);
                if (getAscil >=48 && getAscil <= 58) add += 1;

            }
       }
        System.out.println(add);
        return add;
    }

        public static void main(String[] args) {
                extract(new String[]{"ABc21F", "13cpz", "A1L"});


    }

    public static int countArray(String[] elements) {
        int counter = 0;
        for (int index = 0; index < elements.length ; index++) {
           String element =  elements[index];
            for (int secondIndex = 0; secondIndex < element.length() ; secondIndex++) {
                char currentCharacter = element.charAt(secondIndex);
                 if (currentCharacter >= '0' && currentCharacter <= '9') counter++;
            }
        }
     return counter;
    }
}











