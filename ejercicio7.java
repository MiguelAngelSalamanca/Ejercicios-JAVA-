import java.util.Scanner;
public class ejercicio7 {
    /*Una persona necesita calcular el número de pulsaciones que debe tener por cada 10 segundos
de ejercicio.
La formula es: num_pulsaciones = (220 - edad)/10*/
    public static void main(String[] args){
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = intro.nextInt();
        int pulsaciones = (220-edad)/10;
        System.out.println("Su pulsacion normal e 10 segundos deveria ser: "+pulsaciones+" pusaciones");
        
        
    }
    
}
