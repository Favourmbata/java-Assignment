package Chapter7;


import java.util.Scanner;

public class GeoPolitical_zoneTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your state: ");
        String input = scanner.nextLine();

        for(Geo_PolicaticalZone zone : Geo_PolicaticalZone.values()){
//            String[] states = zone.
            String[][] states = zone.getStates();
            for(String[] state: states){
//                if(input.equals(state)){
//                    System.out.printf(String.format("The geo political zone is: %s", zone));
//                }else {
//                    System.out.println("Geo political zone not found or enter a valid state.");
//                }
//                System.out.println(state[7]);
                for(String s : state){
                    if(s.equalsIgnoreCase(input)){
                        System.out.printf("The goe political zone is %s", zone);
                    }
                }
            }
            break;
        }
    }
}

