/*Una compraventa de automóviles necesita un sistema que permita informar a sus clientes el
detalle del costo de un vehículo al comprarlo, es decir un comprobante que indique el costo total del
vehículo y costo adicional que debe pagar el comprador por distintos conceptos.
Para ello se debe tener en cuenta que el costo de un vehículo nuevo para un comprador es la suma total del
costo del vehículo, del porcentaje de la ganancia del vendedor, de los impuestos locales, e impuestos
estatales aplicables (sobre el precio de venta).
Suponer una ganancia del vendedor del 8% para cada vehículo
Impuesto local del 3%
Impuesto estatal del 3%*/
import java.util.Scanner;
public class ejercicio13 {
     public static void main(String[] args) {
         Scanner valor = new Scanner (System.in);
         System.out.println("Escriba el valor del auto");
         int auto = valor.nextInt();
         double gananciaVende = auto*8/100;
         double Ilocal = auto*3/100;
         double Iestatal = auto*3/100;
         System.out.println("La ganancia del vendedor es: "+gananciaVende);
         System.out.println("El impuesto local: "+Ilocal);
         System.out.println("El impuesto estatal: "+Iestatal);
         System.out.println("Costo total del vehiculo es"+(auto+gananciaVende+Ilocal+Iestatal));
         
       
         
     }
    
}
