package client;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class App3 {
  public static void main(String[] args) {
    
    // Exemplos de polimorfismo
    Object myObject = new Object();
    String myVar = "Hello";
    myObject = myVar;

    Employee emp = new Employee();
    Accountant acc = new Accountant();
    emp = acc;

    // Em arrays ele nao permite esse polimorfismo
    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(new Employee());
    ArrayList<Accountant> accountants = new ArrayList<Accountant>();
    // employees = accountants;

    // Para ser aceito voce precisa criar uma lista "coringa", como e chamada a mesma com esse "?" na declaracao
    ArrayList<?> employees2 = new ArrayList<>();
    ArrayList<String> accountants2 = new ArrayList<>();
    employees2 = accountants2;

    // Uma classe coringa que aceita dados do tipo Employee, a "?" ocorrera na classe filho
    // limite superior
    ArrayList<? extends Employee> employees3 = new ArrayList<>();
    ArrayList<Accountant> accountants3 = new ArrayList<>();
    employees3 = accountants3;

    // limite inferior
    ArrayList<? super Employee> employees4 = new ArrayList<>();
    ArrayList<Object> accountants4 = new ArrayList<>(); // se mudarmos para Object esse codigo será compilado normalmente
    employees4 = accountants4;
  }

  public static void makeEmployeeWork(List<? extends Employee> employess) {

    for(HRManager emp : (ArrayList<HRManager>) employess) {
      emp.work();
    }
  }
}
