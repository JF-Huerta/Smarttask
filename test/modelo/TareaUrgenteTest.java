package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TareaUrgenteTest {

    private TareaUrgente tarea;

    @BeforeEach
    void setUp() {

        tarea = new TareaUrgente(
                2,
                "Entregar trabajo",
                "Alta");

    }

    @Test
    void completarTarea() {

        tarea.completar();

        assertTrue(tarea.isCompletada());

    }

}