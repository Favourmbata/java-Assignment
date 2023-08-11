package OOPpackage;

public class Human {
    private AddressZ addressZ;
    private boolean isAlive;
    private  int numberOfHands;
    private  int numberOfLegs;
    private  int numberOfEyes;
    private  int numberOfEars;

    public boolean isAlive() {
        return isAlive;
    }
    public void setAddressZ(AddressZ addressZ){
        this.addressZ = addressZ;
    }
    public AddressZ getAddressZ(){
        return addressZ;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getNumberOfHands() {
        return numberOfHands;
    }

    public void setNumberOfHands(int numberOfHands) {
        this.numberOfHands = numberOfHands;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int getNumberOfEars() {
        return numberOfEars;
    }

    public void setNumberOfEars(int numberOfEars) {
        this.numberOfEars = numberOfEars;
    }
}
