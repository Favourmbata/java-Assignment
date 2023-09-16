package Assignment.nokia;

import java.util.Scanner;

public class  Nokia {
    public static void main(String[] args) {
      Nokia nokia = new Nokia();

nokia.welcome();


    }

    private Scanner scanner = new Scanner(System.in);

public  void welcome(){
        System.out.println("""
                wecome to nokia 
                press 1 for main menu 
                press 900 to quit
                """);
   int response = scanner.nextInt();
        if (response == 1){
            mainMenu();
        }
        if (response == 900) System.out.println("Thanks for using our service");
    }

    public void mainMenu(){
        System.out.println("""
                    1.=> Phone book
                    2. => Messages
                    3. => Chat
                    4. => Call register
                    5. => Tones
                    6. => Setting
                    7. => Call divert
                    8. => Games
                    9. => Calculator
                    10. => Reminders
                    11. => Clock
                    12. => Profiles
                    13. => Sim services
                    press 900 to exist   
                """);
          int response = scanner.nextInt();
        switch (response){
            case 1:
            phoneBook();
        break;
            case 2:
                messages();
            case 3:
                chat();
        break;
            case 4:
              callRegister();
         break;
            case 5:
                tones();
            break;
            case 6:
                setting();
          break;
            case 7:
                callDivert();
          break;
            case 8:
                games();
           break;
            case 9:
                calculator();
            break;
            case 10:
                reminders();
             break;
            case 11:
                clock();
             break;
            case 12:
                profile();
             break;
            case 13:
                simServices();
                break;
            default:
                mainMenu();
        }


    }


    public void phoneBook(){
        System.out.println("""
                1. => search
                2. => service Nos 
                3. => Add name
                4. =>Erase
                5. => Edith
                6. => Assign tone
                7. => Send b'card
                8. => Options
                9. => Speed dials
                10. => Voice tags
                 press 900 to exit
                    """);
            int reponse = scanner.nextInt();
            if (reponse == 900){
                mainMenu();
            }
    }
    public  void phoneBookOption(){
        System.out.println("""
                
                1. => option
                """);
        int response = scanner.nextInt();
        if (response == 900){
        }
}
    public  void messages(){
    System.out.println("""
                    1. =>Write messages
                    2. =>Inbox
                    3. => OutBox
                    4. => Picture messages
                    5. => Templates
                    6. => Smiley
                    7. => Message settings
                    8. => Info service
                    9.=>Voice mailbox number
                   10.=> Service command Editor
                    press 900 to go to main menu
                        """);
    int response = scanner.nextInt();
    if (response == 7){
       messageMessageSetting();
       if (response == 900)
        mainMenu();
    }
    }
        public void messageMessageSetting(){
            System.out.println("""
                    1. => messageMessageSetting
                    """);
        int response = scanner.nextInt();
        if (response == 900){
            mainMenu();
        }
}
    public void chat(){
        System.out.println("""
                1. => chat
                   press 900 to go to main
                """);
            int response = scanner.nextInt();
            if (response == 900){
                mainMenu();
            }
    }

    public  void  callRegister(){
    System.out.println("""
                 1.=> missed calls
                 2.  => received calls
                 3. => Dialled numbers
                 4. => Erase recent call lists
                 5. => Show call duration
                 6. => show call cost
                 7.=> call cost settings
                 8.=> prepaid credit
                press 900 to go to main menu
            """);
                int response = scanner.nextInt();
                if (response == 900){
                    mainMenu();
                }
    }

    public void callRegisterShowCallDuration(){
    System.out.println("""
                    1.=> last call duration
                    2.=> All call's duration
                    3. => Received calls duration
                    4. => Dialled calls duration
                    5.=> Clear times
                        press 900 to go main menu
            """);

        int response = scanner.nextInt();
        if (response == 5){
            callRegisterShowCallDuration();
            if (response == 900){
                mainMenu();
            }
        }
    }
    public void CallRegisterShowCallCost(){
    System.out.println("""
                    1. => Last call cost
                    2. => All calls cost
                    3. => clear counter
                    press 900 to go to main menu
           
                     """);
    int response = scanner.nextInt();
       if (response == 6)
        CallRegisterShowCallCost();
        if (response == 900){
            mainMenu();
        }
    }
    public void CallRegisterCallCostSetting(){
    System.out.println("""
                1.=> Call cost limit
                2. => show costs in
                press 900 to go main menu
            """);
   int response = scanner.nextInt();
   if (response == 7){
       CallRegisterCallCostSetting();
       if (response == 900){
           mainMenu();
       }
   }
    }

    public void tones(){
    System.out.println("""
                1. => Ringing tone
               2. => Ringing volume
               3. => Incoming call
               4. => Composer
               5. => Messages alert tone
               6. => Keypad tones
               7. => warning and game tones
               8. => Vibrating alert
               9. => Screen saver
               press 900 to go main menu
                      
               """);
        int response = scanner.nextInt();
        if (response == 900){
            mainMenu();
        }
    }
    public  void setting(){
    System.out.println("""
                   1 => Call settings
                   2. => Phone settings
                   3. => Security settings
                   4. => Restore settings
                   press 900 to go to main menu
            """);
   int response = scanner.nextInt();
   if (response == 1){
      settingCallSetting();
    if (response == 2)
        settingPhoneSetting();
    if (response == 3)
        settingSecuritySetting();
    if (response == 4)
        settingRestoreFactorySetting();
       mainMenu();
   }
    }

    public void settingCallSetting() {
   System.out.println("""
                    1. => Automatic redial
                    2. => Speed dialing
                    3. => Call waiting option
                    4. => Own numbers sending
                    5. => Phone line in use
                    6. => Automatic answer
                        press 900 to go to main menu
          
                     """);
        int response = scanner.nextInt();
         if (response == 900){
             mainMenu();
         }

        }
public void settingPhoneSetting(){
    System.out.println("""
                1. => Language
                2. => Cell info display
                3. => Welcome note
                4. => Network selection
                5. => lights
                6. => Confirm sim service action
                press 900 to go to main menu
                    """);
    int response = scanner.nextInt();
    if (response == 900){
        mainMenu();
    }
}
        public void settingSecuritySetting(){
            System.out.println("""
                          1. => Pin code request
                          2. => Call barring service
                          3. => Fixed dialling
                          4. => Closed user group
                          5. => Phone security
                          6. => Change access codes
                            press 900 to go to main menu
                    
                            """);
            int response = scanner.nextInt();
            if (response == 900){
                mainMenu();
            }
}

   public void settingRestoreFactorySetting(){
       System.out.println("""
               1. => restore factory setting
 
               """);
   int response = scanner.nextInt();
        if (response == 900){
            mainMenu();
        }


}


    public  void callDivert(){
        System.out.println("""
                 1. => Call divert
                    press 900 to go to main menu
              
                """);
    int response = scanner.nextInt();
    if (response == 900){
        mainMenu();
    }
    }

    public void games(){
        System.out.println("""
                1. => games
                press 900 to go to main menu
                
                """);
    int response = scanner.nextInt();
    if (response == 900){
        mainMenu();
    }
    }

    public  void calculator(){
        System.out.println("""
                press 1 for addition
                press 2 for sutration
                press 3 for division
                press 4 for multiplication
                press 900 to exist
                """);
   int response = scanner.nextInt();
    switch (response){
        case 1:
            addition();
       break;
        case 2:
            subtraction();
       break;
        case 3:
            division();
        break;
        case 4:
            multipication();
        break;
        default:
            mainMenu();
    }
}


    public void addition(){
        System.out.println("enter first number");
        int number1 = scanner.nextInt();
        System.out.println("enter second number");
        int num2 = scanner.nextInt();
        System.out.println("the total is  => "+number1+num2);
        System.out.println("To perform another addition press 1\n" +
                "press any other number to exist");
    int response = scanner.nextInt();
    if (response == 1) addition();
    if (response != 1) calculator();
        mainMenu();
    }


    public void subtraction(){
        System.out.println("enter first number");
        int num1 = scanner.nextInt();
        System.out.println("enter num2");
        int num2 = scanner.nextInt();
        int total = num1-num2;
        System.out.println("result is => "+total);
        System.out.println("To perform another subtration press 1\n" +
                "press any other number to exist");
        int response = scanner.nextInt();
        if (response == 1) subtraction();
        if (response != 1 ) calculator();
            mainMenu();
    }
    public  void division(){
        System.out.println("enter first number");
        int num1 = scanner.nextInt();
        System.out.println("enter second number");
        int num2 = scanner.nextInt();
        int total = num1/num2;
        System.out.println("result is total => "+total);
        System.out.println("To perform another division press 1\n"+
                "press any other number to exist");
        int response = scanner.nextInt();
        if (response == 1) division();
        if (response!= 1) calculator();
        mainMenu();
    }

    public  void multipication(){
        System.out.println("enter first number");
        int num1 = scanner.nextInt();
        System.out.println("enter second number");
        int num2 = scanner.nextInt();
        int total = num1 * num2;
        System.out.println("result is total => "+total);
        System.out.println("To perform another multiplication press 1 \n+" +
                "press any other number to exist");
            mainMenu();
}



    public void reminders(){
        System.out.println("""
                1. => Reminders
                   press 900 to go to main menu
                
                """);
   int response = scanner.nextInt();
   if (response == 900){
       mainMenu();
   }
    }
    public void clock(){
        System.out.println("""
               1. => clock
                press 900 to go to main menu 
                """);
        int response = scanner.nextInt();
        if (response == 1){
           clockAlarmClock();
         if (response == 900){
             mainMenu();
         }

        }
}
    public void clockAlarmClock(){
        System.out.println("""
                    1.=> Alarm clock
                    2. => Clock settings
                    3. => Date setting
                    4. => Stopwatch
                    5. => Countdown timer
                    6. => Auto update of date and time
                
                """);
        int response = scanner.nextInt();
        if (response == 900){
            mainMenu();
        }
}
    public void profile(){
        System.out.println("""
                 1. => Profile
                    press 900 to go to main menu
                """);
   int response = scanner.nextInt();
   if (response == 900){
       mainMenu();
   }
    }
    public void simServices(){
        System.out.println("""
                 1. => Sim services
                    press 900 to go to main menu
                """);
        int response = scanner.nextInt();
        if (response == 900){
            mainMenu();
        }
}


}
