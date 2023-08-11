package Chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeopoliticalZoneTest {

    String[] states = {"Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau",
                       "Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe",
                       "Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto", "Jigawwa", "Zamfara",
                       "Abia", "Anambra", "Ebonyi", "Enugu", "Imo",
                       "Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers",
                      "Ekiti", "Lagos", "Ondo", "Osun", "Ogun", "Oyo"
    };

     public String checkGeoPoliticalZone (String state){
         for(int i=0; i< states.length; i++) {
             if (states[i].equalsIgnoreCase(state) && i < 7) {
                 return "The Geo Political zone of " + state + " is " + GeoPoliticalZone.NORTH_CENTRAL;
             } else if (states[i].equalsIgnoreCase(state) && i <= 12) {
                 return "The Geo Political zone of " + state + " is " + GeoPoliticalZone.NORTH_EAST;
             }
             else if (states[i].equalsIgnoreCase(state) && i <= 19) {
                 return "The Geo Political zone of " + state + " is " + GeoPoliticalZone.NORTH_WEST;
             }
             else if (states[i].equalsIgnoreCase(state) && i <= 24) {
                 return "The Geo Political zone of " + state + " is " + GeoPoliticalZone.SOUTH_EAST;
             }
             else if (states[i].equalsIgnoreCase(state) &&  i <= 30) {
                 return "The Geo Political zone of " + state + " is " + GeoPoliticalZone.SOUTH_SOUTH;
             }
             else if(states[i].equalsIgnoreCase(state) &&  i <= 36){
                 return "The Geo Political zone of " + state + " is " + GeoPoliticalZone.SOUTH_WEST;
             }
         }
         return "Oga! Oga!! Oga!!! \n use your head " + state + " is not a valid state";
     }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter state -> ");
        String state = scanner.nextLine();
        GeopoliticalZoneTest geopoliticalZoneTest = new GeopoliticalZoneTest();

        System.out.println(geopoliticalZoneTest.checkGeoPoliticalZone(state));

    }
}

