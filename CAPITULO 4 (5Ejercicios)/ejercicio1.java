import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        /*Construya un algoritmo usando DFD y seudocódigo, 
        que permita saber cuál es el mayor de 4
        números que ingresa el usuario.*/
    Scanner n = new Scanner(System.in);   
    System.out.println("escriba los 4 numero a comparar:");
    double n1 = n.nextDouble();
    double n2 = n.nextDouble();
    double n3 = n.nextDouble();
    double n4 = n.nextDouble();
    double numMayor=0;
    if (n1>n2) {
        numMayor=n1;
    }else{
        if (n2>numMayor) {
            numMayor=n2;
        }else{
            if (n3>numMayor) {
                numMayor=n3;           
        }else{
                if (n4>numMayor){
                    numMayor=n4;
                }
            }           
        }            
    }
    System.out.println("el numero mayor es: "+numMayor);
    }
    
}
