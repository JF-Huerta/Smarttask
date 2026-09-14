package modelo;

/**
 * Representa una tarea dentro del sistema SmartTask.
 * Cada tarea posee un identificador, un nombre,
 * una prioridad y un estado de completado.
 */
public class Tarea {

    // Atributos de la tarea
    private int id;
    private String nombre;
    private String prioridad;
    private boolean completada;

    /**
     * Constructor que crea una nueva tarea.
     *
     * @param id Identificador único de la tarea.
     * @param nombre Nombre de la tarea.
     * @param prioridad Nivel de prioridad de la tarea.
     */
    public Tarea(int id, String nombre, String prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;

        // Toda tarea nueva comienza sin completar.
        this.completada = false;
    }

    /**
     * Obtiene el identificador de la tarea.
     *
     * @return ID de la tarea.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre de la tarea.
     *
     * @return Nombre de la tarea.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la prioridad de la tarea.
     *
     * @return Prioridad de la tarea.
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Indica si la tarea está completada.
     *
     * @return true si la tarea está completada,
     *         false en caso contrario.
     */
    public boolean isCompletada() {
        return completada;
    }

    /**
     * Cambia el estado de completado de la tarea.
     *
     * @param completada Nuevo estado de la tarea.
     */
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}