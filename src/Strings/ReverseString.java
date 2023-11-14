package Strings;

public class ReverseString {
     public static void reverse(){
      String letter = "we are student";
      char []pick = letter.toCharArray();
      int pickedLength = pick.length;
      char []newCharacter = new char[pickedLength];
      int index = 0;
      while (index != pickedLength){
          newCharacter[pickedLength -1-index] = pick[index];
           index ++;
      }

          System.out.println(pick);
          System.out.println(newCharacter);
     }

     public static void main(String[] args) {
          reverse();
     }

}
