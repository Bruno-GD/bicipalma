package edu.poniperro.appalma.domain.bicicleta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {
    Bicicleta bici;

    @BeforeEach
    void setUp() {
        this.bici = new Bicicleta(999);
    }

    @Test
    void getId() {
        assertEquals(999, bici.getId());
    }

    @Test
    void testToString() {
        assertEquals("Bicicleta{id=999}", bici.toString());
    }
}