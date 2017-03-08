public class DigitalCamera implements Camera{

private int price;
private String make;
private String model;

public DigitalCamera(int price,String make, String model){
  this.price = price;
  this.make = make;
  this.model = model;
}

public int getPrice(){
  return this.price;
}

public String getmake(){
  return this.make;
}

public String getmodel(){
  return this.model;
}

  public String printDetails(){
    String priceAsString = Integer.toString(this.price);
    // System.out.println("£" +priceAsString + this.make + this.model);
    return "£" +priceAsString +" and was make by "+ this.make + " it is model: " +this.model;
  }


}