package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App2 {
  public static void main(String[] args) {
    
    Container<Integer, String> container = new Container<>(12, "Hello");

    int val1 = container.getItem1();
    String val2 = container.getItem2();

    Set<String> mySet1 = new HashSet<>();
    mySet1.add("first");
    mySet1.add("second");
    mySet1.add("whatever");

    Set<String> mySet2 = new HashSet<>();
    mySet1.add("first");
    mySet1.add("second");
    mySet1.add("Computer");

    Set<String> resultSet = union(mySet1, mySet2);

    Iterator<String> itr = resultSet.iterator();
    while(itr.hasNext()) {
      System.out.println(itr.next());
    }

  }

  public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
    Set<E> result = new HashSet<>(set1);
    result.addAll(set2);
    return result;
  }
}
