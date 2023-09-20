package Chibuzor;

public class LogisticService {

    
    public int getWage(int amountPerParcel) {
        int result = 0;
        if (amountPerParcel < 50){
            result = (amountPerParcel * 160)  + 5000;
        }if (amountPerParcel >= 50 && amountPerParcel <= 59){
            result = (amountPerParcel * 200) + 5000;
        }if (amountPerParcel >=   60 && amountPerParcel <= 69){
            result = (amountPerParcel * 250) + 5000;
        }if (amountPerParcel >= 70 ) {
            result = (amountPerParcel * 500) + 5000;
        }



        return result;
    }


}
