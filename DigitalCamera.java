public class DigitalCamera implements Camera{

private int price;
private String make;
private String model;

public DigitalCamera(int price,String make, String model){
  this.price = price;
  this.make = make;
  this.model = model;
}





  public String printDetails(){

    return "Details";
  }
}