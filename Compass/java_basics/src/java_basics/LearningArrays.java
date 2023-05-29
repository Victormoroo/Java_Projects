package java_basics;

public class LearningArrays {
  public static void main(String[] args) {
    int [] values = new int [100];
    values[0] = 100;
    // values[1] = "Hello"; Não aceita outro tipo de valor que não seja o que foi declarado no array.
    values[99] = 200;

    System.out.println(values[0]);


    String [] names = new String [] {"My", "name", "is", "Victor"};

    System.out.println(names[3]);


    names = new String [10];
    // Voce pode declarar um novo array a partir do primeiro criado, porem os dados não irão sincronizar. Meio que inicia um array do zero, mas n precisa declarar tudo, pois ja foi declarado no anterior
  }
}
