import Exceptions.myException;

public class MyFIlesUtils {

  // public int subtract10FromLargerNumber(int num) throws Exception {
  //   if(num  < 10) {
  //     throw new Exception("Invalid number!");
  //   }
  //   return num - 10;
  // }


  // Voce pode criar sua propria Exception, mas a boa pratica é criar um novo pacote apenas para isso
  public int subtract10FromLargerNumber(int num) throws myException {
    if(num  < 10) {
      throw new myException("Invalid number!");
    }
    return num - 10;
  }

  // public class myException extends Exception {
  //   public myException(String message) {
  //     super(message);
  //   }
  // }
}
