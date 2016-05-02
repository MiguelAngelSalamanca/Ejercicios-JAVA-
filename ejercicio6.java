import java.util.Scanner;
public class ejercicio6 {
     /*Completo italiano 690****
    Completo a la chilena 890******
    Hamburguesa queso 990
    Churrasco 1100
    Cerveza 700
    Bebida 500*/
    public static void main(String[] args){
        Scanner cantidad = new Scanner(System.in);
        System.out.println("Ingrese cantidad a llevar segun el produco:"
                + "llene el listado segun el pedido");
        System.out.print("Completo Italiano: ");
        int comIta = cantidad.nextInt();
         int totalComIta = comIta*690;
        System.out.print("Completo a la Chilena: ");
        int comChi = cantidad.nextInt();
        int totalComChi = comChi*890;
        System.out.print("Hamburgesa con Queso: ");
        int hamQue = cantidad.nextInt();
        int totalHamQue = hamQue*990;
        System.out.print("Churrasco Italiano: ");
        int chuIta = cantidad.nextInt();
        int totalChuIta = chuIta*1100;
        System.out.print("Cerveza: ");
        int cerveza = cantidad.nextInt();
        int totalCerveza = cerveza*700;
        System.out.print("Bebida: ");
        int bebida = cantidad.nextInt();
        int totalBebida = bebida*500;
        int total = totalComIta+totalComChi+totalHamQue+totalChuIta+totalCerveza+totalBebida;
        System.out.println("El total neto es: "+total+" pesos");
        
        
                
        
        
        
        
        
    }
}
   