package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MainTest {
    @Test
    public void testSum() {
        Main app = new Main();
        assertEquals(5, app.sum(2, 3));
    }

}
