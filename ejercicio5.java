import java.util.Scanner;
public class ejercicio5 {
    /*Introducir el sueldo básico de un empleado por teclado, 
    hallar el total ganado considerando que debe 
    introducir el monto por horas extras,
    considerar un descuento del 20%. 
    Desplegar el sueldo
    básico, el total del descuento y el total ganado.*/
    public static void main(String[] args){
        Scanner monto = new Scanner(System.in);
        System.out.println("Ingrese el sueldo base del empleado:");
        int sueldoBase = monto.nextInt();
        System.out.println("Ingrese Valor de la hora extra:");
        int horaExtra = monto.nextInt();
        System.out.println("Ingrese la cantidad de horas extras:");
        double cantHoraExtra = monto.nextDouble();
        //PROCESO
        double pagoHora = horaExtra*cantHoraExtra;
        double totalSueldo = sueldoBase+pagoHora;
        double descuento = totalSueldo*20/100;
        double sueldoMes = totalSueldo-descuento;
        System.out.println("El total de descuento es: "+descuento);
        System.out.println("El sueldo total del mes es: "+sueldoMes);
         
        
            
        
    }
}
