package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class funTime {

   private String name;
    private String yearOfBirth;


    private double balance;



    public  int ageCalculator(String yearOfBirth){
        int birthYear = 0;
        if (validateYearOfBirth(yearOfBirth)) {
            birthYear = Integer.parseInt(yearOfBirth);
        }
        return  LocalDateTime.now().getYear() - birthYear;

    }

    public  void  setName(String name){this.name = name;}
    public  String getName(){return name;}

    public  void setYearOfBirth(String yearOfBirth){
        if (validateYearOfBirth(yearOfBirth)) this.yearOfBirth = yearOfBirth;
        }


    public  String getYearOfBirth(){return yearOfBirth;}


    public void  deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = +depositAmount;
        }
    }
    public boolean validateYearOfBirth(String yearOfBirth){
        if (yearOfBirth.length() != 4)
            System.out.println(" the length of year is not four," +
                    " it has to be four number format \n (example )=>  1996 \n (example )=>  2012");
        for (int i = 0; i < yearOfBirth.length(); i++) {
            if (Character.isAlphabetic(yearOfBirth.charAt(i)) ) System.out.println("you have entered an alphabet instead of year");
        }
        return true;
    }
public  void validateBalance(double depositAmont) {

    }

    }
