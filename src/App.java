// Título: Calificación Final de un estudiante 

/*  
 * Descripción: Este programa calcula la calificación final de un estudiante en Informática basándose en calificaciones
 * con ponderaciones de participación, primer examen parcial, segundo examen parcial y examen final.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        float participacion, primerexamen, segundoexamen, examenfinal, notafinal;

        // Solicita y almacena el porcentaje de la nota de la participación
        System.out.println("Digite el porcentaje de la nota de la participación: ");
        participacion = entrada.nextFloat();
        System.out.println("El porcentaje de participación es de: " + participacion);

        // Solicita y almacena el porcentaje de la nota del primer examen
        System.out.println("Digite el porcentaje de la nota del primer examen: ");
        primerexamen = entrada.nextFloat();
        System.out.println("El porcentaje del primer examen es de: " + primerexamen);

        // Solicita y almacena el porcentaje de la nota del segundo examen
        System.out.println("Digite el porcentaje de la nota del segundo examen: ");
        segundoexamen = entrada.nextFloat();
        System.out.println("El porcentaje del segundo examen es de: " + segundoexamen);

        // Solicita y almacena el porcentaje de la nota del examen final
        System.out.println("Digite el porcentaje de la nota del examen final: ");
        examenfinal = entrada.nextFloat();
        System.out.println("El porcentaje del examen final es de: " + examenfinal);

        // Calcula las ponderaciones de las calificaciones
        participacion = participacion * 0.10f;
        primerexamen = primerexamen * 0.25f;
        segundoexamen = segundoexamen * 0.25f;
        examenfinal = examenfinal * 0.40f;

        // Calcula la calificación final sumando las ponderaciones
        notafinal = participacion + primerexamen + segundoexamen + examenfinal;

        // Muestra la calificación final
        System.out.println("\nLa nota final es de: " + notafinal);
    }
}
