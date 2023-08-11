package Chapter7;

public enum Geo_PolicaticalZone {
//    NORTH_CENTRAL(new String[]{"Benue", "kogi", "Kwara","Nasarawa","Niger","Plateau"}),
//    NORTH_EAST(new String[]{"Adamawa,Bauchi,Borno,Gombe,Taraba,Yobe"}),
//    NORTH_WEST(new String[]{"Kaduna,Kano,Kebbi,Sokoto,Zamfara"}),
//    SOUTH_EAST(new String[]{"Anambra,Ebonyi,Enugu,Imo"}),
//    SOUTH_SOUTH(new String[]{"Akwa-Ibom,Bayelsa,Cross Rivers,Delta,Edo,Rivers"}),
//    SOUTH_WEST(new String[]{"Ekiti,Lagos,Ogun,Ondo,Osun,Oyo"});
    NORTH_CENTRAL(new String[][]{new String[]{"Benue"}, new String[]{"kogi"}, new String[]{"Kwara"}, new String[]{"Nasarawa"}, new String[]{"Niger"}, new String[]{"Plateau"}}),
    SOUTH_WEST(new String[][]{new String[]{"Ekiti", "Lagos", "Ogun", "Ondo", "Osun", "Oyo"}});
    private final String[][] states;

    Geo_PolicaticalZone(String[][] states){
        this.states = states;
    }

    public String[][] getStates(){
        return states;
    }

  }
