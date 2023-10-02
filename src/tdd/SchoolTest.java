package tdd;

import Jennifer.School;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SchoolTest {
//    public static void main(String[] args) {
//
//        School school = new School();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter school name");
//        String schoolName = scanner.nextLine();
//        school.setSchoolName("name");
//
//
//        System.out.println("enter location");
//        String location = scanner.nextLine();
//        school.setLocation("location");
//
//        System.out.println("enter number of student");
//        int numbers = scanner.nextInt();
//        school.setNumberOfStudent(numbers);
//
//        System.out.println("The name of school is -> " +schoolName);
//        System.out.println("The location of school is -> " +location);
//        System.out.println("The number of sctudent is -> " +numbers);

    @Test
    public void testThatSchoolHasName(){
        School school = new School();
        school.setSchoolName("semicolon");
        assertEquals("semicolon",school.getSchoolName());
    }

 @Test
    public void testThatschoolHasLocation(){
        School school = new School();
        school.setLocation("312 sabo lagos");
        assertEquals("312 sabo lagos",school.getLocation());

 }


 @Test
    public void testTheNumberOfStudent(){
        School school = new School();
        school.setNumberOfStudent(24);
        assertEquals(24,school.getNumberOfStudent());
 }


}


