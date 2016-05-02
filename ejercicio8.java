import java.util.Scanner;
public class ejercicio8 {
    /*Se pide desarrollar un algoritmo que permita calcular 
    el nuevo salario de un trabajador si obtuvo un incremento
    del 10% sobre su salario anterior.*/
    public static void main(String[] args){
        Scanner dinero = new Scanner(System.in);
        System.out.println("Escriba el sueldo del trabajador: ");
        int sueldo = dinero.nextInt();
        System.out.println("Ingrese el porcentaje de aumento: ");
        int aumento = dinero.nextInt();
        int sueldoFinal = ((sueldo*aumento)/100)+sueldo;
        System.out.println ("El sueldo a pagar sera de: "+sueldoFinal);
    }
}
    
