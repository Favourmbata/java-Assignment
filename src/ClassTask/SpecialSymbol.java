package ClassTask;

public class SpecialSymbol {
    public static void main(String[] args) {
        String name = "#_favour@,%";
        String noun = "bola";
        System.out.println(checker(name));
        System.out.println(checker(noun));
    }

    public static boolean checker(String word) {

        String specialCharacter = "$#-_:@;=";

        for (int i = 0; i <= word.length()-1; i++) {
            for (int j = 0; j < specialCharacter.length()-1; j++) {
                if (word.charAt(i) == specialCharacter.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}








