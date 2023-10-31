package test;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static test.ComputedAssistedInstruction.generateRandomNumber;

public class ComputerAssitedInstructionTest {
    @Test
    public void testGenerateRandoNumber() {
        ComputedAssistedInstruction computedAssistedInstruction = new ComputedAssistedInstruction();
        int number = generateRandomNumber();
        boolean isNumberBetweenOneAndNine = number > 0 && number <= 9;
        assertTrue(isNumberBetweenOneAndNine);
    }
    }
//    @Test
//    public void testgenerateQuestions(){
//        ComputedAssistedInstruction computedAssistedInstruction = new ComputedAssistedInstruction();
//        String question = generateQuestions();
//        assertNotNull(question);
//       boolean isBlankQuestion = question.isBlank();
//        assertFalse(isBlankQuestion);
//    }
//
//
//
//   @Test
//    public void testCorrectAnswer(){
//        String question = generateQuestions();
//        boolean isAnwerCorrect = isAnswerCorrect(7);
//        assertTrue(isAnwerCorrect);
//   }
//    @Test
//    public void testDisplayMessage(){
//        String message = "very good";
//        String display = createDisplay(message);
//        assertNotNull(display);
//        assertTrue(display.contains((message)));
//    }
//}
