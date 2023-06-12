package LearningFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
  public static void main(String[] args) { // throws FileNotFoundException
    
    File file = new File("myfile.txt");

    try (FileReader fileReader = new FileReader(file);
          BufferedReader bufferedReader = new BufferedReader(fileReader);) {

      String line = bufferedReader.readLine();

      while(line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }

    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
    } catch (IOException e) {
      System.out.println("Problem reading the file " + file.getName());
    } 
    
    // A partir do java 7, não é mais necessario executar o finally, pois isso ja e feito automaticamente
    // finally {
    //   try {
    //     if(bufferedReader != null) {
    //       bufferedReader.close();
    //     }
    //     if (fileReader != null) {
    //       fileReader.close();
    //     }
    //   } catch (IOException e) {
    //     System.out.println("Unable to close file " + file.getName());
    //   }
    //   catch (NullPointerException ex) { // essa excessao é uma má pratica, voce como programador nao gostaria de utilizar isso
    //     System.out.println("File was probably never opened " + ex);
    //   }
    //}
  }
}
