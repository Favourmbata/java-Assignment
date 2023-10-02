package ArrayAssigment;

public class ElementOddPosistion {

    public static void elementOddPosition(){
     int [] element = {12,15,11,50,200,50,10,20};
        for (int i = 0; i <element.length ; i++) {
            if (i % 2!= 0){
                System.out.println(element[i]);
            }
        }

    }

    public static void main(String[] args) {
 elementOddPosition();
    }

}
