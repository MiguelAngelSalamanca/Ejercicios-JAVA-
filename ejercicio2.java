import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args){
        //SUMA Y MULTUIPLICACION DE DOS NUMEROS
        Scanner n = new Scanner(System.in);
        System.out.println("Escriba dos numeros par saber la suma y la multiplicacion de estos:");
        double num1 = n.nextDouble();
        double num2 = n.nextDouble();
        double suma = num1+num2;
        double multi = num1*num2;
        System.out.println("La suma de los dos numeros es: "+suma);
        System.out.println("La multiplicacion de los dos numeros es: "+multi);
    }
    
}
