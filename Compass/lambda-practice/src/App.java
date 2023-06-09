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

        ALambdaInterface aBlockOfCode = () -> {
            System.out.println("Custom object walking... ");
            System.out.println("the object tripped... ");
        };
    }

    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }
}
