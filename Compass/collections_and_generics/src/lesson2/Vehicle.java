package lesson2;

public class Vehicle {
  
  String make; //marca
  String model;
  int price;
  boolean fourWDrive; //tracao nas 4 rodas
  
  public Vehicle(String make, String model, int price, boolean fourWDrive) {
    this.make = make;
    this.model = model;
    this.price = price;
    this.fourWDrive = fourWDrive;
  }

  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }
  public String getModle() {
    return model;
  }
  public void setModle(String model) {
    this.model = model;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public boolean isFourWDrive() {
    return fourWDrive;
  }
  public void setFourWDrive(boolean fourWDrive) {
    this.fourWDrive = fourWDrive;
  }

  @Override
  public String toString() {
    return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", fourWDrive=" + fourWDrive + "]";
  }

}
