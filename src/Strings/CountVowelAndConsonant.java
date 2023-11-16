package Strings;

public class CountVowelAndConsonant {
    public static void getVowelConsonantAndSpecialSymbol() {
        String alphabet = "chidera's daughter is one";
        char[] extract = alphabet.toCharArray();
        int size = extract.length;
        int vowel = 0;
        int consonat = 0;
        int symbol = 0;

        int i = 0;
        while (i != size) {
            if (extract[i] >= 'A' && extract[i] <= 'Z') {

                if (extract[i] == 'A' || extract[i] == 'E' || extract[i] == 'I' || extract[i] == 'O' || extract[i] == 'U') {
                        vowel++;
                }
                 else {
                     consonat++;
                }

            }
           else {
               i++;
            }
        }
        System.out.println(extract);
        System.out.println("vowel count is:"+vowel);
        System.out.println("consonat count is:"+consonat);
        System.out.println("Symbol count is:"+symbol);
    }


    public static void main(String[] args) {
        getVowelConsonantAndSpecialSymbol();
    }
}
