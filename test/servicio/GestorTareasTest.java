package servicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Tarea;
import modelo.TareaNormal;

class GestorTareasTest {

    private GestorTareas gestor;
    private Tarea tarea;

    @BeforeEach
    void setUp() {

        gestor = new GestorTareas();

        tarea = new TareaNormal(
                1,
                "Estudiar Java",
                "Alta");

        gestor.agregarTarea(tarea);
    }

    @Test
    void agregarTarea() {

        assertEquals(1, gestor.getTareas().size());

    }

    @Test
    void obtenerTareas() {

        assertEquals(1, gestor.getTareas().size());

    }
    
    @Test
    void eliminarTareaInexistente() {

        gestor.eliminarTarea(99);

        assertEquals(1, gestor.getTareas().size());

    }
    
    @Test
    void marcarComoCompletadaInexistente() {

        gestor.marcarComoCompletada(99);

        assertFalse(tarea.isCompletada());

    }
    
    @Test
    void marcarComoCompletada() {

        gestor.marcarComoCompletada(1);

        assertTrue(tarea.isCompletada());

    }

    @Test
    void eliminarTarea() {

        gestor.eliminarTarea(1);

        assertEquals(0, gestor.getTareas().size());

    }

    @Test
    void listarTareas() {

        gestor.listarTareas();

        assertEquals(1, gestor.getTareas().size());

    }
    
}