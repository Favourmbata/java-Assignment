package Chapter6;

public class SumInteger {


    // First method
    public static String getSumOfNumbers(long number) {
        String s = String.valueOf(number);
        int len = s.length(), sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i))) ;
        }
        return "The sum of every of the digits in "+number+" is -> "+sum;
    }

    // Second Method
    public static String getSumOfNumbers2(long number){
        int len=String.valueOf(number).length(); long sum=0, rem=0;
        String divider = "1";
        for (int i = 0; i <len-1 ; i++) {
            divider=divider.concat("0");
        }
        sum += number/Integer.parseInt(divider);
        for (int i = 0; i <len-1 ; i++) {
            rem = number%Integer.parseInt(divider);
            divider = String.valueOf(Integer.parseInt(divider)/10);
            sum += rem/Integer.parseInt(divider);
        }
        return "The sum of every of the digits in "+number+" is -> "+sum;
    }

    public static void main(String[] args) {
        System.out.println(getSumOfNumbers2(234));
    }

}