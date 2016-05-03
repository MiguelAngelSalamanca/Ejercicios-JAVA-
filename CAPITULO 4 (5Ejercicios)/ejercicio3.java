/*1,0 y 3,9 􀃆 Insuficiente
4,0 y 4,9 􀃆 Suficiente
5,0 y 5,9 􀃆 Bien
6,0 y 7,0 􀃆 Muy bien*/
import java.util.Scanner;
public class ejercicio3 {
     public static void main(String[] args){
         Scanner nota = new Scanner(System.in);
         System.out.println("Ingrese nota: ");
         double n = nota.nextDouble();
         if (n<4 && n>1){
             System.out.println("Insuficiente");
         }else{
             if (n<5 && n>=4){
                 System.out.println("Suficiente");
             }else{
                 if (n<6 && n>=5){
                     System.out.println("Bien");
                 }else{
                     if (n<=7 && n>=6){
                         System.out.println("Muy Bien");
                     }else
                         System.out.println("Nota Fuera de Rango");                     
                    }
                }
            }
        }
    }

