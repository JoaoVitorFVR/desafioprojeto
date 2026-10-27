package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MesaTest {

    @Test
    void deveServirPratoItaliano() {
        FabricaAbstrata fabrica = new FabricaItaliana();
        Mesa mesa = new Mesa(fabrica);
        assertEquals("Pizza Margherita", mesa.servirPrato());
    }

    @Test
    void deveServirBebidaItaliana() {
        FabricaAbstrata fabrica = new FabricaItaliana();
        Mesa mesa = new Mesa(fabrica);
        assertEquals("Vinho Tinto", mesa.servirBebida());
    }

    @Test
    void deveServirPratoJapones() {
        FabricaAbstrata fabrica = new FabricaJaponesa();
        Mesa mesa = new Mesa(fabrica);
        assertEquals("Combo Sushi", mesa.servirPrato());
    }

    @Test
    void deveServirBebidaJaponesa() {
        FabricaAbstrata fabrica = new FabricaJaponesa();
        Mesa mesa = new Mesa(fabrica);
        assertEquals("Sake", mesa.servirBebida());
    }

}
