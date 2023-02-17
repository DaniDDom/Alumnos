package alumno;

/**
 * Alumno.java Definición de la clase Alumno
 *
 * @version 1.1
 * @since 1.0
 * @author Daniel Dominguez
 */
/**
 * Esta seria la clase Alumno, en ella tendremos los atributos propios de la
 * clase y sus distintos metodos.
 */
public class Alumno {

    /**
     * El nombre del alumno.
     */
    public String nombre;
    /**
     * La nota del alumno.
     */
    public double nota = 0.0;

    /**
     * Este seria el constructor sin pasarle ningún atributo, más adelante se le
     * podra asignar con el setter.
     */
    public Alumno() {
        this.nombre = "";
        this.nota = 0.0;
    }

    /**
     * En este constructor creamos el objeto directamente con los dos atributos
     * pasados como parametros.
     *
     * @param nombre , el nombre del alumno.
     * @param nota , la nota del alumno.
     */
    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
    }

    /**
     * Nos devuelve el nombre del alumno indicado.
     *
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Nos permite modificar o añadir un nombre al alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Nos devuelve la nota del alumno indicado.
     *
     *
     * @return nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * Nos permite modificar o añadir una nota al alumno.
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

}
