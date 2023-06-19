package practice;

public class Register {

private String password;
private  String name;
private  String  email;

        public Register(String password, String name, String email){
          this.password = password;
          this.name = name;
          this.email = email;
    }

     public Register(){}


    public String userRegistrationn(String name, String password, String email) {
                this.password = password;
                this.name = name;
                this.email = email;
                return  "congratulation!";

        }


    public String userLogin(String password, String email) {
        if (!password.equals(password)) {
            return "incorrect password";
        }
        if (!email.equals(email)) {
            return "incorrect password";
        }
          return "welldone";


    }

 }
