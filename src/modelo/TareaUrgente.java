package modelo;

import contrato.Accionable;

/**
 * Representa una tarea urgente del sistema.
 */
public class TareaUrgente extends Tarea implements Accionable {

    /**
     * Constructor de la tarea urgente.
     *
     * @param id Identificador de la tarea.
     * @param nombre Nombre de la tarea.
     * @param prioridad Prioridad de la tarea.
     */
    public TareaUrgente(int id, String nombre, String prioridad) {
        super(id, nombre, prioridad);
    }

    /**
     * Marca la tarea como completada.
     */
    @Override
    public void completar() {
        setCompletada(true);
    }
}