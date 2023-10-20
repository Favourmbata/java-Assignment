import Chapter5.AutoPolicy;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(11111111,"Toyota Camry","Ny");
        AutoPolicy policy2 = new AutoPolicy(22222222,"Ford Fusion","ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);


    }
  public static void policyInNoFaultState(AutoPolicy policy){
   System.out.println("The Autopolicy");
      System.out.printf("Account # :%d;Car:%s;%nState %s %s a no - default state%n%n",policy.getAccountNumber(),policy.getMakeAndModel(),policy.getState(),(policy.isNoFaultState()?"is":"is not"));
  }

}
