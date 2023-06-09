public class App {
    public static void main(String[] args) {

        Human tom = new Human();
        //walker(tom);

        Robot wale = new Robot();
        //walker(wale);

        //walker(new Walkable() {
            //@Override
            //public void walk() {
                //System.out.println("Custom object walking... ");
            //}
        //});

        // Maneira atual de fazer o mesmo que esta no codigo acima
        walker( () -> System.out.println("Custom object walking... "));

        Walkable aBlockOfCode = () -> {
            System.out.println("Custom object walking... ");
            System.out.println("the object tripped... ");
        };

        walker(aBlockOfCode);

        ALambdaInterface helloVar = () -> System.out.println("Hello there");
        Calculate sumVar = (a, b) -> a + b;
        helloVar.someMethod();
        System.out.println(sumVar.compute(4, 6));

        Calculate nonZeroDivider = (a, b) -> {
            if(a == 0) {
                return 0;
            }
            return a / b;
        };
        System.out.println(nonZeroDivider.compute(10, 2));

        Char reverser = (s) -> {
            String result = "";
            for(int i = s.length()-1; i>=0; i--) {
                result = result + s.charAt(i);
            }
            return result;
        };
        System.out.println(reverser.reverse("VICTOR"));

        Number factorial = (n) -> {
            int result = 1;
            for(int i=1; i<=n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(factorial.numberFactorial(10));
    }

    public  void sayHello() {
        System.out.println("Hello there");
    }

    public int sum(int arg1, int arg2) {
       return arg1 + arg2;
    }

    public int nonZeroDivider(int arg1, int arg2) {
        if(arg1 == 0) {
            return 0;
        }
        return arg1 / arg2;
    }

    public String reverse(String str) {
        String result = "";
        for(int i = str.length() -1; i>=0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public int factorial(int num) {
        int result = 1;
        for(int i=0; i<=num; i++) {
            result = i * result;
        }
        return result;
    }

    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }
}

interface Calculate {
    public int compute(int a, int b);
}

interface Char {
    public String reverse(String str);
}

interface Number {
    public Integer numberFactorial(int num);
}
