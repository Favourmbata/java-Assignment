package practice;

public class FavourAccount {

   private String name;
   private String password;
   private  String email;
   private  String accountNumber;
   private  String phoneNumber;
    public String registercustomer(String name, String password, String email, String phoneNumber, String AccountNumber) {
                    this.name = name;
                    this.password = password;
                    this.email = email;
                    this .phoneNumber = phoneNumber;
                    this.accountNumber = accountNumber;
                    return "congratulation";
    }
}

