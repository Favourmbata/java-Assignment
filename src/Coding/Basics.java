package Coding;
import javax.swing.JOptionPane;
public class Basics {
    public static void main(String[] args) {
        int g = -1;
        while (g < 0){
            String input = JOptionPane.showInputDialog("please your name");
            if(input.length() > 0){
                g++;
                System.out.println("Thank you");
            }else {
                System.out.println("Enter your name");
            }

        }
    }
}
