package ArrayPractice;

public class StringArr {
    public int name(String [][]listOfName){

       int number = 0;
        for (int i = 0; i < listOfName.length ; i++) {
            // inside array
            for (int j = 0; j < listOfName[i].length ; j++) {
                //  todo inside the index of the array
                for (int k = 0; k <listOfName[i][j].length() ; k++) {
                    String receiver = String.valueOf(listOfName[i][j].charAt(k));
                    if ( receiver.equalsIgnoreCase("k") || receiver.equalsIgnoreCase("y") ) number++;
                }
            }
        }
        return number;
    }


    public static void main(String[] args) {
        String[][] listOfNames = {{"i love you", "tinuade", "favor","chioma"},
                                    {"todi","tosin","kelvin","chirok","bukola"},
                                    {"asa","angle","mbata","tosin the liar"}};

        StringArr justClass = new StringArr();

        System.out.println(justClass.name(listOfNames));

    }


}
