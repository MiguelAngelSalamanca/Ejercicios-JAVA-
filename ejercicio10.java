import java.util.Scanner;
public class ejercicio10 {
    /*Se requiere conocer los datos estadísticos de la asignatura de algoritmos, por lo tanto, se
necesita un algoritmo que lea el número de reprobados de la signatura, el número de aprobados, notables y
sobresalientes y de cómo resultado lo siguiente:
El porcentaje de alumnos que han aprobado la asignatura.
El porcentaje de alumnos que han reprobado la asignatura.
El porcentaje alumnos notables de la asignatura.
El porcentaje de alumnos sobresalientes de la asignatura.*/
    public static void main(String[] args) {
        Scanner alumnos = new Scanner(System.in);
        System.out.println("Escriba la cantidad de alumnos aprobados");
        int aprovados = alumnos.nextInt();
        System.out.println("Escriba la cantidad de alumnos notables");
        int notables = alumnos.nextInt();
        System.out.println("Escriba la cantidad de alumnos sobresalientes");
        int sobresalientes = alumnos.nextInt();
        System.out.println("Escriba la cantidad de alumnos Reprobados");
        int reprobado = alumnos.nextInt();
        int totalAlum = aprovados+notables+sobresalientes+reprobado;
        double porcentApro = aprovados*100/totalAlum;
        double porcentNota = notables*100/totalAlum;
        double porcentSobre = sobresalientes*100/totalAlum;
        double porcentRepro = reprobado*100/totalAlum;
        System.out.println("Porcentaje de alumnos aprobados es: "+porcentApro);
        System.out.println("Porcentaje de alumnos notables es :"+porcentNota);
        System.out.println("Porcentaje de alumnos sobresalientes es: "+porcentSobre);
        System.out.println("Porcentaje de alumnos reprobados es: "+porcentRepro);
                
        
        
        
    }
    
}
