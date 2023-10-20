package Chibuzor;
public class MoreFunction {

    public boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public boolean primeNumber(int number) {
        if (number % 2 == 0 || number / 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int factorsOfNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }

        return count;
    }

    public boolean squaresOfNumbers(int number) {
        int number1 = 1;
        int result = number1 * number1 * number1;
        return true;
    }


    public int factorialOfNumber(int number) {
        int count = 1;
        for (int i = 1; i <= number; i++) {
            count = count * i;
        }
        return count;
    }


    public boolean isPalindrome(int number) {
        int temporary = number;
        int reverse = 0;
        if (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
            return true;
        } else {
            return false;
        }

    }

    public int[] Swap(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 3) {
                temp = numbers[i];
                numbers[i] = numbers[i + 2];
                numbers[i + 2] = temp;
            }

        }
        return numbers;
    }


    public int[] getSwappedPosition(int[] numbers,int index1,int index2) {

        numbers[index1] = numbers[index1] + numbers[index2];
        numbers[index2] = numbers[index1] - numbers[index2];
        numbers[index1] = numbers[index1] - numbers[index2];
        return numbers;
    }


}
