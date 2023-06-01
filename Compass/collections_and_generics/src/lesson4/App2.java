package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class App2 {
  public static void main(String[] args) {
    
    HashSet<Employee> hashSet = new HashSet<Employee>();
    hashSet.add(new Employee("Victor", 2000, "development"));
    hashSet.add(new Employee("Mike", 3500, "Accounting"));
    hashSet.add(new Employee("Paul", 4000, "Admin"));

    ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);

    Collections.sort(myList);

    System.out.println(myList);
  }
}
