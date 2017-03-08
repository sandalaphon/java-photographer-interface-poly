public class AnalogueCamera implements Camera{

  private int price;
  private String make;
  private String model;

  public AnalogueCamera(int price,String make, String model){
    this.price = price;
    this.make = make;
    this.model = model;
  }

  public String printDetails(){
    String priceAsString = Integer.toString(this.price);
    // System.out.println("£" +priceAsString + this.make + this.model);
   return "£" +priceAsString +" and was make by "+ this.make + " it is model: " +this.model;
    // return "£" +priceAsString + this.make + this.model;
  }

}