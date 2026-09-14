package servicio;

import java.util.ArrayList;
import modelo.Tarea;

/**
 * Administra las tareas del sistema SmartTask.
 * Permite agregar, listar, completar y eliminar tareas.
 */
public class GestorTareas {

    // Lista donde se almacenan todas las tareas
    private ArrayList<Tarea> tareas;

    /**
     * Constructor de la clase GestorTareas.
     * Inicializa la lista de tareas vacía.
     */
    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    /**
     * Agrega una nueva tarea a la lista.
     *
     * @param tarea Tarea que será agregada.
     */
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    /**
     * Muestra todas las tareas registradas.
     */
    public void listarTareas() {

        for (Tarea tarea : tareas) {

            System.out.println("ID: " + tarea.getId());
            System.out.println("Nombre: " + tarea.getNombre());
            System.out.println("Prioridad: " + tarea.getPrioridad());
            System.out.println("Completada: " + tarea.isCompletada());
            System.out.println("------------------------------");
        }

    }

    /**
     * Marca una tarea como completada según su ID.
     *
     * @param id Identificador de la tarea.
     */
    public void marcarComoCompletada(int id) {

        for (Tarea tarea : tareas) {

            if (tarea.getId() == id) {
                tarea.setCompletada(true);
                System.out.println("Tarea marcada como completada.");
                return;
            }

        }

        System.out.println("No se encontró una tarea con ese ID.");
    }

    /**
     * Elimina una tarea según su ID.
     *
     * @param id Identificador de la tarea que se eliminará.
     */
    public void eliminarTarea(int id) {

        for (Tarea tarea : tareas) {

            if (tarea.getId() == id) {
                tareas.remove(tarea);
                System.out.println("Tarea eliminada correctamente.");
                return;
            }

        }

        System.out.println("No se encontró una tarea con ese ID.");
    }
    
    /**
     * Devuelve la lista de tareas registradas.
     *
     * @return Lista de tareas.
     */
    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

}