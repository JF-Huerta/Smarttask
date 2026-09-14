package app;

import java.util.Scanner;

import modelo.Tarea;
import modelo.TareaNormal;
import modelo.TareaUrgente;
import servicio.GestorTareas;

/**
 * Clase principal del sistema SmartTask.
 * Permite al usuario administrar tareas mediante un menú en consola.
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();

        int opcion;

        do {

            System.out.println("\n===== SMARTTASK =====");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

            case 1:

                System.out.print("Ingrese el ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ingrese el nombre de la tarea: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la prioridad (Alta, Media o Baja): ");
                String prioridad = scanner.nextLine();

                System.out.println("Tipo de tarea:");
                System.out.println("1. Normal");
                System.out.println("2. Urgente");
                System.out.print("Seleccione una opción: ");

                int tipo = scanner.nextInt();
                scanner.nextLine();

                Tarea tarea;

                if (tipo == 1) {
                    tarea = new TareaNormal(id, nombre, prioridad);
                } else {
                    tarea = new TareaUrgente(id, nombre, prioridad);
                }

                gestor.agregarTarea(tarea);
                break;

            case 2:
                gestor.listarTareas();
                break;

            case 3:
                System.out.print("Ingrese el ID de la tarea: ");
                int idCompletar = scanner.nextInt();
                gestor.marcarComoCompletada(idCompletar);
                break;

            case 4:
                System.out.print("Ingrese el ID de la tarea a eliminar: ");
                int idEliminar = scanner.nextInt();
                gestor.eliminarTarea(idEliminar);
                break;

            case 5:
                System.out.println("¡Hasta luego!");
                break;

            default:
                System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}