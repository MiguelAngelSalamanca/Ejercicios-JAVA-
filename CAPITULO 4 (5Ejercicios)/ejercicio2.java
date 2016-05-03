import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner money = new Scanner (System.in);
        System.out.println("Escriba el monto a evaluar: ");
        int monto = money.nextInt();
        int B20 = monto/20000;
        monto = monto-(B20*20000);
        int B10 = monto/10000;
        monto = monto-(B10*10000);
        int B5 = monto/5000;
        monto = monto-(B5*5000);
        int B2 = monto/2000;
        monto = monto-(B2*2000);
        int B1 = monto/1000;
        monto = monto-(B1*1000);
        int M500 = monto/500;
        monto = monto-(M500*500);
        int M100 = monto/100;
        monto = monto-(M100*100);
        int M50 = monto/50;
        monto = monto-(M50*50);
        int M10 = monto/10;
        monto = monto-(M10*10);
        int M5 = monto/5;
        monto = monto-(M5*5);
        int M1 = monto/1;
        
        System.out.println("Billetes de veinte mil: "+B20);
        System.out.println("Billetes de dies mil: "+B10);
        System.out.println("Billetes de cinco mil: "+B5);
        System.out.println("Billetes de dos mil: "+B2);
        System.out.println("Billetes de mil: "+B1);
        System.out.println("monedas de quiniento: "+M500);
        System.out.println("monedas de cien: "+M100);
        System.out.println("monedas de cincuenta: "+M50);
        System.out.println("monedas de dies: "+M10);
        System.out.println("monedas de cinco: "+M5);
        System.out.println("monedas de uno: "+M1);
        
        
        
    }
}
