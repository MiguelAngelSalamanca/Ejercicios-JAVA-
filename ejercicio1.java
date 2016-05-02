import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        // TODO code application logic here
        /*Diseñe un algoritmo que permita determinar 
        el área y volumen de un cilindro dado 
        su radio(R) y altura (H).
        p <- 3.14;
	area <- (2 * p * radio * (radio + altura));
	volumen <- p * radio^2 * altura;*/
        Scanner r = new Scanner(System.in);
        System.out.println("Escriba el radio del Cilindro");
        double radio = r.nextDouble();
        System.out.println("Escriba la altura del Cilindro");
        double altura = r.nextDouble();
        //PROCESO...
        double area = 2*3.14*radio*(radio+altura);
        double volumen = 3.14*radio*radio*altura;
        //salida...
        System.out.println("El area del Cilindro es: "+area);
        System.out.println("El volumen del Cilindro es: "+volumen);
    }
    
}
