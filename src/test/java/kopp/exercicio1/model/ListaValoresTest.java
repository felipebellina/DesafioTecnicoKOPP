package kopp.exercicio1.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaValoresTest {

    ListaValores lista = new ListaValores();

    @Test
    void adicionarLista() {
        var item = 0.0;
        lista.adicionarLista(item);

        assertEquals(1, lista.getLista().size());
        assertTrue(lista.getLista().contains(item));
    }
}
