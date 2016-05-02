import java.util.Scanner;
public class ejercicio3 {
      public static void main(String[] args){
          //Se pide crear un algoritmo que calcule los días vividos de una persona sabiendo edad.
          Scanner año = new Scanner(System.in);
          System.out.println("Escriba su edad:");
          double edad = año.nextDouble();
          double dias = edad*365.25;
          System.out.println("usted a vivido aproximadamente "+dias+" dias");
          
          
      }
    
}
