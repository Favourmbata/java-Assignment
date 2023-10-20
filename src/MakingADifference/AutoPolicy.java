package MakingADifference;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber,String makeAndModel,String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        setState (state);
    }

       public void setState(String state){
        String []stateCodes = {"Ny","NH","PA","ME","VT","AL","AK"};
        boolean isValid = false;
        for (String code:stateCodes){
            if (code.equals(state)){
                isValid = true;
                break;
            }
        }

         if (isValid){
             this.state = state;
         }else {
             System.out.println("Invalid code,Please enter a valid nortEaststate :");
         }
       }
    public String getState(){
        return state;
    }


}
