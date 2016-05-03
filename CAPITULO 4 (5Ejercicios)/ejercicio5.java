import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args){
        
        Scanner intro = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de trabajadores a evaluar: ");
        int trabajadores = intro.nextInt();
        int cont = 0;
        /*Grado Sueldo Base
        1 $450.000
        2 $550.000
        3 $700.000
         while (cont < 9) {
            cont++;
            System.out.print(cont + "   ");
        }
*/
        while (cont<trabajadores){
        cont++;      
        int sueldo = 0;
        System.out.println ("Evaluacion trabajador "+cont);
        System.out.println("Ingrese su grado como trabajador: ");
        int grado = intro.nextInt();
        if (grado==1){
            sueldo = 450000;
        }else{
            if (grado==2){
                sueldo = 550000;
            }else{
                if (grado==3){
                    sueldo = 700000;
                }else{
                    System.out.print("Grado  Incorrecto...");                   
                }
            }            
        }  
        System.out.println("Ingrese cantidad de horas extras: ");
        int horaExtra = intro.nextInt();
        int valorHora = 0;
        /*Entre 1 y 3 $2.000
        Entre 4 y 7 $3.000
        Más de 7 $3.500*/
        if (horaExtra<4 && horaExtra>1){
            valorHora = 2000;
        }else{
            if (horaExtra<8 && horaExtra>4){
                valorHora = 3000;
            }else{
                if (horaExtra>7){
                    valorHora = 3500;
                }
            }
        }
        int pagoHora = valorHora*horaExtra;
        System.out.println("ISAPRE "+
        "Elija su isapre ingresando el numero correspondiente: ");
        System.out.println("1 Colmena");
        System.out.println("2 Ban Médica");
        System.out.println("3 Vida");
        System.out.println("4 Fonasa");
        int isapre = intro.nextInt();
        System.out.println("Elija su AFP segun como se le indicara: ");
        System.out.println("1 BanSander    ");
        System.out.println("2 Geometrica SA");
        System.out.println("3 Cumprum ");
        System.out.println("4 Provida");
        int afp = intro.nextInt();
        /*ISAPRE %    descuento
                                          AFP % Descuento
1 Colmena    6,5%                         1 BanSander     12%
2 Ban Médica 7,3%                         2 Geometrica SA 13,4%
3 Vida       3 7%                         3 Cumprum       12,3%
4 Fonasa     7%                           4 Provida       12,9%
 */
    double Tdescuento = 0;
        if (isapre==1){
            Tdescuento = sueldo*6.5/100;
        }else{
            if (isapre==2){
                Tdescuento = sueldo*7.3/100;
            }else{
                if (isapre==3){
                    Tdescuento = sueldo*3.7/100;
                }else{
                    if (isapre==4){
                        Tdescuento = sueldo*7/100;
                    }else
                        System.out.println("Opcion incorrecta: ");                   
                    }
                }
            }      
    double DesAfp = 0;
        if (afp==1){
            DesAfp = sueldo*12/100;
        }else{
            if (afp==2){
                DesAfp = sueldo*13.4/100;
            }else{
                if (afp==3){
                    DesAfp = sueldo*12.3/100;
                }else{
                    if (afp==4){
                        DesAfp = sueldo*12.9/100;
                    }else
                        System.out.println("Opcion incorrecta: ");
                }
            }
        }
        double sueldoMes = sueldo-DesAfp-Tdescuento+pagoHora;
        System.out.println("Total de horas extras a pagar: "+pagoHora);
        System.out.println("total descuento de AFP: "+DesAfp);
        System.out.println("Total de descuento de la Isapre: "+Tdescuento);
        System.out.println("El sueldo final sera: "+sueldoMes);
        }
    }
}
