package Coding;

public class EncryptAndDecrypt {

    static String letters = "abcdefghijklmnopqrstuvwxyz";
    static int decrptionRule = 3;


    // track d letter
    //
    public static String getIndexOfletter(String letter) {
        for (int i = 0; i < letters.length(); i++) {
            if(letter.equalsIgnoreCase(String.valueOf(letters.charAt(i)))){
                return String.valueOf(i);
            }
        }
        return null;
    }
    // get the letter we are to decrpt
    // check its position in the ascii
    // decrpt it by indexing
    // use a string builder to build the decrypted in addition
    public static StringBuilder decrypt(String wordToDecrypt) {
        StringBuilder newWord = new StringBuilder();

        for (int i = 0; i < wordToDecrypt.length(); i++) {
            char newletter = letters.charAt(Integer.parseInt(
                    getIndexOfletter(String.valueOf(wordToDecrypt.charAt(i)))) - 3);
            newWord =newWord.append(newletter);
        }
        return newWord;
    }

    public static void main(String[] args) {
        System.out.println(decrypt("goa"));
//        System.out.println(getIndexOfletter("l"));
    }

}
