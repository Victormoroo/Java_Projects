package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
  public static void main(String[] args) {

    ArrayList<String> animals = new ArrayList<String>();

    animals.add("Lion");
    animals.add("Fish");
    animals.add("Cat ");
    animals.add("Dog");
    animals.add("Monkey");

    // for(int i = 0; i < animals.size(); i++) {
    //   System.out.println(animals.get(i));
    // }

    // for (String value : animals) {
    //   System.out.println(value);
    // }

    // ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    // LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
    List<Vehicle> vehicles = new LinkedList<Vehicle>();
    Vehicle vehicle01 = new Vehicle("Honda", "Civic", 30000, false);
    
    vehicles.add(vehicle01); //pode ser feito dessa forma tambem
    vehicles.add(new Vehicle("Nissan", "GTR R34", 120000, false));
    vehicles.add(new Vehicle("Toyota", "Supra", 80000, false));
    
    // for(Vehicle car : vehicles) {
    //   System.out.println(car.toString());
    // }

    printElements(animals);
    printElements(vehicles);
  }

  public static void printElements(List somelist) {
    for(int i = 0; i < somelist.size(); i++) {
      System.out.println(somelist.get(i));
    }
  }
}
