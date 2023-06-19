package practice;

public class FAccount1 {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public  String getName(){
        return name;
    }

    public static void main(String[] args) {

        FAccount1 fAccount1 = new FAccount1();
       System.out.println("please enter your name");
       fAccount1.setName("david");
        System.out.printf("my name is   " +fAccount1.getName());


    }
}
