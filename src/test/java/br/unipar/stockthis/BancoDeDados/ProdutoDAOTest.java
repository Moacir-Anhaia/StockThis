package br.unipar.stockthis.BancoDeDados;

import br.unipar.stockthis.Estoque.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoDAOTest {

    @Test
    //teste de adicionar o produto no banco de dados
    void inserir() {
        Produto teste = new Produto();
        teste.setCodigo(123);
        teste.setNome("Melancia");
        teste.setCategoria("Fruta");
        teste.setQuantidade(5);
        teste.setPreco(2.80);


        assertEquals(123, teste.getCodigo());
        assertEquals("Melancia", teste.getNome());
        assertEquals("Fruta", teste.getCategoria());
        assertEquals(5, teste.getQuantidade());
        assertEquals(2.80, teste.getPreco());
    }
@Test
        void NovoValor() {
    Produto teste = new Produto(123, "Melancia", "Fruta", 5, 2.80);
    assertEquals(2.80, teste.getPreco());

    teste.setPreco(3.00);

    assertEquals(3.00, teste.getPreco());
}
}
// 2 testes de valores exatos