/*Tres amigos reúnen sus ahorros para comprar un vehículo.
Cada una de ellos aporta una cantidad distinta de dinero. 
Desarrolle el algoritmo que determine el porcentaje que cada amigo aporta con
respecto a la cantidad total reunida.*/
import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args){
        Scanner monto = new Scanner(System.in);
        System.out.println("Ingrese monto aportado del primer amigo");
        int monto1 = monto.nextInt();
        System.out.println("Ingrese monto aportado del segundo amigo");
        int monto2 = monto.nextInt();
        System.out.println("Ingrese monto aportado del tercer amigo");
        int monto3 = monto.nextInt();
        int total = monto1+monto2+monto3;
        double porcent1 = monto1*100/total;
        double porcent2 = monto2*100/total;
        double porcent3 = monto3*100/total;
        System.out.println("El primer amigo aporta el siguiente porcentaje: "+porcent1);
        System.out.println("El segundo aporta el siguiente porcentaje: "+porcent2);
        System.out.println("El tercer amigo aporta el siguiente porcentaje: "+porcent3);
        
    }
}
