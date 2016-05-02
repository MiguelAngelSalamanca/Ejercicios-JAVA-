import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args){
        /*Un atleta de lunes a sábados corre la misma ruta y 
        cronometra los tiempos obtenidos,
        desarrolle un algoritmo que determine el tiempo promedio 
        que el atleta se demora en recorrer la ruta en
        una semana cualquiera.*/
        Scanner tiempo = new Scanner(System.in);
        System.out.println("Escriba el tiempo de los dias lunes a sabado:");
        System.out.println("Lunes");
        double lunes = tiempo.nextDouble();
        System.out.println("Martes");
        double martes = tiempo.nextDouble();
        System.out.println("Miercoles");
        double miercoles = tiempo.nextDouble();
        System.out.println("Jueves");
        double jueves = tiempo.nextDouble();
        System.out.println("Viernes");
        double viernes = tiempo.nextDouble();
        System.out.println("Sabado");
        double sabado = tiempo.nextDouble();
        double promedio = (lunes + martes + miercoles + jueves + viernes + sabado)/6;
        System.out.println("El promedio de todos los dias de lunes a viernes es: "+promedio+" segundos");
    }
}
