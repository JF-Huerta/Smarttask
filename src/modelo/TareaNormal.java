package modelo;

import contrato.Accionable;

/**
 * Representa una tarea normal del sistema.
 */
public class TareaNormal extends Tarea implements Accionable {

    /**
     * Constructor de la tarea normal.
     *
     * @param id Identificador de la tarea.
     * @param nombre Nombre de la tarea.
     * @param prioridad Prioridad de la tarea.
     */
    public TareaNormal(int id, String nombre, String prioridad) {
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