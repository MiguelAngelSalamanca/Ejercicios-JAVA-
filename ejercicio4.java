import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args){
        /*Se solicita diseñar un algoritmo que permita Introducir tres números por teclado, 
        para hallar el promedio de los tres números, 
        la suma y desplegar del primer número el doble, 
        del segundo número el triple y del tercer número el cuadrado.*/
        Scanner num = new Scanner(System.in);
        System.out.println("Escriba tres numeros:");
        double num1 = num.nextDouble();
        double num2 = num.nextDouble();
        double num3 = num.nextDouble();
        double promedio = (num1+num2+num3)/3;
        double suma = (num1+num2+num3);
        double doble1= num1*2;
        double triple2 = num2*3;
        double cuadrado = num3*num3;
        System.out.println("El promedio de los tres numeros ingresados es: "+promedio);
        System.out.println("La suma de los tres numeros ingresados es: "+suma);  
        System.out.println("El doble del primer numero es: "+doble1);
        System.out.println("El triple del segundo numero ingresado es: "+triple2);
        System.out.println("El cuadrado del tercer nukmero ingresado es: "+cuadrado);
        
    }
    
}
