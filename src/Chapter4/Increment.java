package Chapter4;

public class Increment {

public  void  incrementFive(){

    int x = 5;
    x+=x++-5;
    x+=0;
    System.out.println(x);
}

    public static void main(String[] args) {
        Increment increment = new Increment();
        increment.incrementFive();
    }

}
