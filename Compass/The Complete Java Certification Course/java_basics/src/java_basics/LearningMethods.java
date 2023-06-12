package java_basics;

import other_package.ExampleClass;

public class LearningMethods {
  public static void main(String[] args) {
    MyUtils.printSomeJunk(34);
    MyUtils.printSomeJunk("34");
    MyUtils.sum2numbers(2, 3);

    int var = MyUtils.add10(90) + 1000;
    System.out.println(var);

    System.out.println(MyUtils.newSomeJunk("My name is Victor."));

    ExampleClass.doSomething();
    

    // MyUtils.add20(100); Não é possivel fazer dessa forma, pois o metodo nao foid eclarado com static, sendo preciso instancia-lo de alguma forma para utilizá-lo
    MyUtils myVar;
    myVar = new MyUtils();
    int result = myVar.add20(100);

    System.out.println(result);
  }
}
