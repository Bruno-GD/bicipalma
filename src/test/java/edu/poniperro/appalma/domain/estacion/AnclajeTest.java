package edu.poniperro.appalma.domain.estacion;

import edu.poniperro.appalma.domain.bicicleta.Bicicleta;
import edu.poniperro.appalma.domain.bicicleta.Movil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnclajeTest {
    Anclaje anclaje;
    Movil bici = new Bicicleta(999);

    @BeforeEach
    void setUp() {
        anclaje = new Anclaje();
        anclaje.anclarBici(bici);
    }

    @Test
    void isOcupado() {
        assertEquals(true, anclaje.isOcupado());
    }

    @Test
    void getBici() {
        assertEquals(bici, anclaje.getBici());
    }

    @Test
    void anclar_libera_Bici() {
        // liberar
        anclaje.liberarBici();
        assertNull(anclaje.getBici());
        assertFalse(anclaje.isOcupado());
        // anclar
        anclaje.anclarBici(bici);
        assertTrue(anclaje.isOcupado());
        assertEquals(bici, anclaje.getBici());
    }

    @Test
    void testToString() {
        assertEquals("Anclaje{isOcupado=true, bici=Bicicleta{id=999}}", anclaje.toString());
    }
}