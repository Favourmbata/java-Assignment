package test;

public class BeautifulString {
    public static String addFullStopTo(String string) {
        int indexOfLastElement = string.length()-1;
        char lastCharacter = string.charAt(indexOfLastElement);
         boolean stringContainsFullStop = lastCharacter == '.';
        if (!stringContainsFullStop)return string + ".";
        return string;
    }

    public static String capitaliseFirstLetterIn(String word) {
       return ((word.charAt(0)+ "").toUpperCase())+word.substring(1);
    }

    public static String beautify(String sentence) {
       return addFullStopTo((capitaliseFirstLetterIn(sentence)));
    }
}
