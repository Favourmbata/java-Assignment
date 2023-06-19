package chapter3;

public class FAccount2 {

    private String name;


    public  FAccount2(String name){
        this.name = name;
    }

   public void setName(String name){
        this.name = name;
   }

    public String getName(){
        return name;
    }


//    public  void withdraw(double withdrawAmount){
//        if(withdrawAmount <= balance){
//            System.out.println("withdraw");
//        }
//        else{
//            withdrawAmount > balance
//            System.out.println("withdrawal amount exceed balance");
//        }
//    }

    public static void main(String[] args) {
        FAccount2 fAccount2 = new FAccount2("lucky john");
        FAccount2 fAccount21 = new FAccount2("ijeoma chioma");
        System.out.printf("this is first name:%s%n", fAccount2.getName());
        System.out.printf("this is second name%s%n",fAccount21.getName());

    }






}
