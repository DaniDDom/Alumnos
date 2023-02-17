package alumnos;

import alumno.Alumno;
import java.util.Scanner;

/**
 * Esta es la clase principal que vamos a usar, la mayor parte del codigo ira
 * aqui. Desde la creación del objeto hasta la introducción de sus atributos.
 *
 * @author Daniel Domínguez
 */
public class Alumnos {

    /**
     * Esto es el main de nuestro proyecto.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /**
         * Creamos un array con el tamaño designado.
         */
        Alumno[] alumnos = new Alumno[5];

        /**
         * Solicitamos los datos de entrada para rellenar el array.
         */
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
        /**
         * El nombre del alumno.
         */
        String nombreIntroducido;
        /**
         * La nota del alumno.
         */
        double notaIntroducida;
        /**
         * Se pregunta por los atributos de cada alumno según indice, con cada
         * aumento del indice, aumentamos un puesto en el array a rellenar,
         * hasta completar el mismo. Para hacerlo menos específico he modificado
         * la duración del bucle.
         */
        for (int indice = 0; indice < alumnos.length; indice++) {

            alumnos[indice] = new Alumno();
            System.out.println("Alumno " + indice);
            System.out.print("Nombre: ");
            nombreIntroducido = entrada.nextLine();
            (alumnos[indice]).nombre = nombreIntroducido;
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            alumnos[indice].nota = notaIntroducida;
        }

        System.out.println("Los datos introducidos son los siguientes:");
        /**
         * Esta variable nos ayudara a sumar las notas de los alumnos.
         */
        double sumaDeNotas = 0;
        /**
         * El siguiente bucle, muestra por cada indice, los datos del alumno,
         * tras cada iteración se aumenta el indice para dar lugar al siguiente
         * alumno. Por motivos de reutilización, he modificado el bucle.
         */
        for (int indice = 0; indice < alumnos.length; indice++) {
            System.out.println("Alumno " + indice);
            System.out.println("Nombre: " + alumnos[indice].nombre);
            System.out.println("Nota media: " + alumnos[indice].nota);
            System.out.println("----------------------------");

            sumaDeNotas += alumnos[indice].nota;
        }
        /**
         * Por ultimo, tras el bucle anterior, la variable sumaDeMedias sera
         * mostrada por pantalla.
         */
        System.out.println("La media global de la clase es " + sumaDeNotas / 5);
    }
}
