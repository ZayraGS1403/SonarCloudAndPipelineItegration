package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Pruebas unitarias para la clase Main.
 */
public class MainTest {
    private Main app;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        app = new Main();
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMain() {
        Main.main(new String[]{});
        String expectedOutput = "La suma es: 5" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
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
