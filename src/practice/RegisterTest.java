package practice;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RegisterTest {


    @Test
  public   void testThatUserCanRegister(){

        Register register = new Register();

            assertEquals("congratulation!",        register.userRegistrationn("string","6666","favourmbata520@gmail.com"));

    }

     @Test
       public  void  testThatUserCanLogin(){
        Register register = new Register();

        assertEquals("congratulation!",register.userRegistrationn("chichi","6666","favourmbata520@gmail.com"));

       assertEquals("welldone",register.userLogin("6666","favourmbata520@gmail.com"));



    }




    }


