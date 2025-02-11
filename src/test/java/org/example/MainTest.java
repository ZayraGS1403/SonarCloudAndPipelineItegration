package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

/**
 * Pruebas unitarias para la clase Main.
 */
public class MainTest {
    private Main app;

    @Before
    public void setUp() {
        app = new Main();
    }

    @Test
    public void testSumar() {
        assertEquals(5, app.sumar(2, 3));
        assertEquals(-1, app.sumar(2, -3));
        assertEquals(0, app.sumar(0, 0));
    }

    @Test
    public void testEsPar() {
        assertTrue(app.esPar(4));
        assertFalse(app.esPar(7));
        assertTrue(app.esPar(0));
    }
}
