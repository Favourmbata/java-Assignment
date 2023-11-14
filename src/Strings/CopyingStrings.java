package Strings;

public class CopyingStrings {
    public static void getCopiedString() {
        String character = "my beautiful niece delight";
        char copy[] = character.toCharArray();
        int size = copy.length;
        char newSize[] = new char[size];
        int i = 0;
        while (i != size) {
            newSize[i] = copy[i];

            i++;

        }
        System.out.println(copy);
        System.out.println(newSize);
    }

    public static void main(String[] args) {
        getCopiedString();
    }

}