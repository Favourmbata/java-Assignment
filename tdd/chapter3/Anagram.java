package chapter3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    public boolean compare (String character1, String character2) {
            char []a = character1.toCharArray();
            char []b = character2.toCharArray();
             Arrays.sort(a);
             Arrays.sort(b);
             Boolean result = Arrays.equals(a,b);
          if (result == true)return true;
        return false;
    }


        public boolean isPalindrome(String word) {
          String character = "";
          String rev = "";
          char save;
            for (int i = 0; i <character.length() ; i++) {
                save = character.charAt(i);
                rev = save  + rev ;
            }
                if (character.toLowerCase().equals(rev))return true;
         return false;
        }


}


