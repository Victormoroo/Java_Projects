import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) { //throws FileNotFoundException

        // for(int i = 0; i < 3; i++) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter some text: ");
        //     String text = sc.nextLine();
        //     System.out.println(text);
        // }
        // sc.close();


        // File file = new File("myfile.txt");
        // Scanner sc = new Scanner(file);
        // while(sc.hasNextLine()) {
        //     String line = sc.nextLine();
        //     System.out.println(line);
        // }
        // sc.close();


        File file = new File("myfile.txt");
        try (Scanner sc = new Scanner(file)) {
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        MyFIlesUtils myUtil = new MyFIlesUtils();
        try {
            System.out.println(myUtil.subtract10FromLargerNumber(15));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
