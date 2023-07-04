package practice;

public class CheckAge {

public  void  checkAge(){
  int age = 20;
  if(age < 18){
      System.out.println("Acess denied");
  }
    else {
      System.out.println("Acess granted");
  }
}

    public static void main(String[] args) {
        CheckAge checkAge = new CheckAge();
        checkAge.checkAge();
    }
}
