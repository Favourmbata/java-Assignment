package ArrayTask;

public class PrintTheString {


        public String picker (String[] name,String target ) {
           String collector = "";

            for (int k = 0; k < name.length; k++) {
                if (name[k].contains(target)) {
                    collector = name[k];
                }

            }
            return collector;
        }

    public static void main(String[] args) {
     PrintTheString printTheString = new PrintTheString();



// TODO write a method that take an array and a char targe
//TODO the me method should return a String that contains the char


        String[] name = {"boneshaker","lion","elephant","goat","horse","zebra"};
        System.out.println(printTheString.picker(name, "o"));


    }


//        /TODO print out the string that contain z




    }

