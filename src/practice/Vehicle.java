package practice;

public class Vehicle {
    private String model;
    private  String type;
    private  String year;
    private  double fuelCapacity;

    public void setModel  (String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return year;
    }
    public void setFuelCapacity(double fuelCapacity){
        this.fuelCapacity = fuelCapacity;
    }
    public double getFuelCapacity(){
        return fuelCapacity;
    }
}
