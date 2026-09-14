package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TareaTest {

    private Tarea tarea;

    @BeforeEach
    void setUp() {
        tarea = new Tarea(
                1,
                "Estudiar Java",
                "Alta");
    }

    @Test
    void crearTarea() {
        assertEquals(1, tarea.getId());
        assertEquals("Estudiar Java", tarea.getNombre());
        assertEquals("Alta", tarea.getPrioridad());
        assertFalse(tarea.isCompletada());
    }

    @Test
    void completarTarea() {
        tarea.setCompletada(true);

        assertTrue(tarea.isCompletada());
    }
}