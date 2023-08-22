package Chapter4;

public class DecryptACryptography {
    import javax.swing.JOptionPane;


    public class Encryption
    {
        public static void main(String[] args)
        {

            String inputString;
            int num, digit1, digit2, digit3, digit4, encrypt;

            do
            {
                inputString = JOptionPane.showInputDialog("Please enter 4 digit numbers");
                num = Integer.parseInt(inputString);
            }
            while(num/1000 == 0 || num/10000 != 0);

            digit1 = num/1000;
            digit2 = num/100;
            digit3 = num/10;
            digit4 = num/1;

            digit1 = (digit1+7)%10;
            digit2 = (digit2+7)%10;
            digit3 = (digit3+7)%10;
            digit4 = (digit4+7)%10;

            encrypt = digit1;
            digit1 = digit3;
            digit3 = encrypt;

            encrypt = digit2;
            digit2 = digit4;
            digit4 = encrypt;


            System.out.println("Your encrypted codes are: " + digit1 + digit2 + digit3 + digit4);



        }
    }
}
