/*En una clínica existen 4 áreas: Kinesiología. Ginecología, Pediatría, y Traumatología. 
El presupuesto anual de la clínica se reparte según se especifica en la siguiente tabla:
Desarrolle un algoritmo que permita obtener la cantidad de dinero que recibirá cada área,
para cualquier monto presupuestado.
Kinesiología 20
Ginecología 25
Traumatología 30
Pediatría 25*/
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args){
        Scanner monto = new Scanner (System.in);
        System.out.println("Escriba el presupuesto anual:");
        int presupuesto = monto.nextInt();
        double Kinesiología = presupuesto*20/100;
        double Ginecología = presupuesto*25/100;
        double Traumatología = presupuesto*30/100;
        double Pediatría = presupuesto*25/100;
        System.out.println("El monto para Kinesiología es:"+Kinesiología);
        System.out.println("El monto para Ginecología es:"+Ginecología);
        System.out.println("El monto para Traumatología es:"+Traumatología);
        System.out.println("El monto para Pediatría es:"+Pediatría);
    }
    
}
