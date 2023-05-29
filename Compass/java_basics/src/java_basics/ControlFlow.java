package java_basics;

public class ControlFlow {
  public static void main(String[] args) {
    boolean happy = false;

    if (!happy) {
      System.out.println("Today I'm happy");
    } else {
      System.out.println("I'm not happy today");
    }

    int hungerRating = 5;

    if (hungerRating < 6) {
      System.out.println("I'm not Hungry");
    } else {
      System.out.println("I'm starving..."); // Estou morrendo de fome
    }

    int favoriteTemp = 20;
    int currentTemp = 25;
    String opnion;

    if (!(currentTemp == favoriteTemp)) {
      opnion = "I not like this climate";
    } else {
      opnion = "I like this climate";
    }
    System.out.println(opnion);

    int month = 9;
    String monthName;

    switch(month) {
      case 1: monthName = "January";
        break;
      case 2: monthName = "February";
        break;
      case 3: monthName = "March";
        break;
      case 4: monthName = "April";
        break;
      case 5: monthName = "May";
        break;
      case 6: monthName = "June";
        break;
      case 7: monthName = "July";
        break;
      case 8: monthName = "August";
        break;
      case 9: monthName = "September";
        break;
      case 10: monthName = "October";
        break;
      case 11: monthName = "November";
        break;
      case 12: monthName = "December";
        break;
      default: monthName = "Invalid value!";
        break;
    }
    
    System.out.println(monthName);
  }
}
