package Chapter8;

import java.util.Scanner;

public enum GeoPoliticalZone {

    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

    private final String[] states;

    GeoPoliticalZone(String... states) {

        this.states = states;
    }

    public  String[] getStates() {
        return states;
    }


        public static String collectState() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter state: ");
            return scanner.nextLine().toUpperCase();
        }

        public static GeoPoliticalZone checkState(String state) {
            for (GeoPoliticalZone zone : GeoPoliticalZone.values()) {
                for (String s : zone.getStates()) {
                    if (s.equals(state)) {
                        return zone;
                    }
                }
            }
            return null;
        }

        public static void main(String[] args) {
            String state = collectState();
            GeoPoliticalZone result = checkState(state);
            if (result != null) {
                System.out.println(result.name());
//            } else {
//                System.out.println("State not found");
            }
        }
    }







