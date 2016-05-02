import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args){
        /*Desarrolle un algoritmo para que un alumno calcule su 
    calificación final en la materia de Algoritmos. 
    La cual se compone de los siguientes porcentajes:
     
    Calificaciones parciales 505
    Promedio de talleres 25
    Promedio de tareas 1558
    Exposicion del tema de
    investigación 10*/
        Scanner calificacion = new Scanner(System.in);
        System.out.println("Escriba su promedio de las calificaciones parciales:");
        double parciales = calificacion.nextDouble();
        System.out.println("Escriba el promedio de los talleres: ");
        double talleres = calificacion.nextDouble();
        System.out.println("Escriba el promedio de las tareas: ");
        double tareas = calificacion.nextDouble();
        System.out.println("Escriba la nota de investigacion:");
        double trabajo = calificacion.nextDouble();
        double notaFinal = (parciales*50+talleres*25+tareas*15+trabajo*10)/100;
        System.out.println("nota final: "+notaFinal);
    }
}
