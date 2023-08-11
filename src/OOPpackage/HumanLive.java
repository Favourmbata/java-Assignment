package OOPpackage;

public class HumanLive {
    public static void main(String[] args) {
        Woman woman = new Woman();
        Man man = new Man();
        AddressZ addressZ = new AddressZ();



        addressZ.setState("lagos");
        addressZ.setHouseNumber("103");
        addressZ.setStreetName("bariga");


        woman.setNumberOfHands(2);
        man.setAlive(true);
        man.setAddressZ(addressZ);

        woman.setAddressZ(addressZ);

        System.out.println(man.getAddressZ().getState());


    }
}
