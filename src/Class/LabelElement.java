package Class;

public class LabelElement {
    public static void main(String[] args) {
        int[][] table = new int[5][6];
        int count = 1;
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                table[row][column] = count;
                count++;

            }
        }
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                System.out.print(table[row][column] +"\t");
            }
            System.out.println();
        }

    }

}