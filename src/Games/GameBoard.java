package Games;

import java.time.LocalDateTime;
import java.util.Scanner;

public class GameBoard {
    private Player player1 = new Player();
    private Player player2 = new Player();
    private Scanner scanner1 = new Scanner(System.in);

    public int ageCalculator(){
       String year = "";
       boolean loop= false;
                while (true){
                    System.out.println("please enter a four digit year value");
                    year = scanner1.next();
                    for (int i = 0; i < year.length() ; i++) {
                        if (Character.isAlphabetic(year.charAt(i))|| year.length() != 4){
                            loop = true;
                    System.out.println("Invalid input.please enter a correct year value");
                }
            }
                    if (loop)continue;
                    break;
        }
          int intYear = Integer.parseInt(year);
        return LocalDateTime.now().getYear() -intYear;
    }
    public boolean ageValidator(int age){
        if (age < 18) return  false;
        return true;
    }


}
