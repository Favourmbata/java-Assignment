package ArrayPractice;

public class ArrayOfIndex {

 public static void arrayOfIndex(){
       String [] colours = {"purple","pink","green","white","red","black"};
        int index = 0;
       for (int i = 0; i < colours.length; i++) {
        if (colours[i] == "red"){
            index = i;
        }
     }
     System.out.println("index= "+index);
 }

    public static void main(String[] args) {
 arrayOfIndex();
    }
}
