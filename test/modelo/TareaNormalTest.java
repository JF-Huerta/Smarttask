package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TareaNormalTest {

    private TareaNormal tarea;

    @BeforeEach
    void setUp() {

        tarea = new TareaNormal(
                1,
                "Estudiar Java",
                "Alta");

    }

    @Test
    void completarTarea() {

        tarea.completar();

        assertTrue(tarea.isCompletada());

    }

}