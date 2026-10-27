package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LancheTest {

    @Test
    void deveRetornarPrecoHamburguer() {
        Lanche lanche = new Hamburguer(100.0f);

        assertEquals(100.0f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijoExtra() {
        Lanche lanche = new QueijoExtra(new Hamburguer(100.0f));

        assertEquals(110.0f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoHamburguerComBacon() {
        Lanche lanche = new Bacon(new Hamburguer(100.0f));

        assertEquals(120.0f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoHamburguerComMolhoEspecial() {
        Lanche lanche = new MolhoEspecial(new Hamburguer(100.0f));

        assertEquals(105.0f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijoExtraMaisBacon() {
        Lanche lanche = new QueijoExtra(new Bacon(new Hamburguer(100.0f)));

        assertEquals(132.0f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoHamburguerComBaconMaisMolhoEspecial() {
        Lanche lanche = new Bacon(new MolhoEspecial(new Hamburguer(100.0f)));

        assertEquals(126.0f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoHamburguerComQueijoExtraMaisBaconMaisMolhoEspecial() {
        Lanche lanche = new QueijoExtra(new Bacon(new MolhoEspecial(new Hamburguer(100.0f))));

        assertEquals(138.6f, lanche.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoHamburguer() {
        Lanche lanche = new Hamburguer();

        assertEquals("Hamburguer", lanche.getDescricao());
    }

    @Test
    void deveRetornarDescricaoHamburguerComQueijoExtra() {
        Lanche lanche = new QueijoExtra(new Hamburguer());

        assertEquals("Hamburguer + Queijo Extra", lanche.getDescricao());
    }

    @Test
    void deveRetornarDescricaoHamburguerComBacon() {
        Lanche lanche = new Bacon(new Hamburguer());

        assertEquals("Hamburguer + Bacon", lanche.getDescricao());
    }

    @Test
    void deveRetornarDescricaoHamburguerComMolhoEspecial() {
        Lanche lanche = new MolhoEspecial(new Hamburguer());

        assertEquals("Hamburguer + Molho Especial", lanche.getDescricao());
    }

    @Test
    void deveRetornarDescricaoHamburguerComQueijoExtraMaisBacon() {
        Lanche lanche = new QueijoExtra(new Bacon(new Hamburguer()));

        assertEquals("Hamburguer + Bacon + Queijo Extra", lanche.getDescricao());
    }

    @Test
    void deveRetornarDescricaoHamburguerComQueijoExtraMaisBaconMaisMolhoEspecial() {
        Lanche lanche = new QueijoExtra(new Bacon(new MolhoEspecial(new Hamburguer())));

        assertEquals("Hamburguer + Molho Especial + Bacon + Queijo Extra", lanche.getDescricao());
    }

}
