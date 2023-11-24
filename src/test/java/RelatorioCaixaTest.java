import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioCaixaTest {

    @Test
    void deveRetornarTotalQuantidadeTransacoes(){
        Caixa caixa = new Caixa(
                new Pagamento("Conta de Luz",100.00),
                new Compra("Mudas",100.00),
                new Venda("Restaurante", 400.00),
                new Venda("Cliente1",50.00)
        );
        assertEquals(4, RelatorioCaixa.contarTotalTransacoes(caixa));
    }

    @Test
    void deveRetornarTotalCompras(){
        Caixa caixa = new Caixa(
                new Pagamento("Conta de Luz",100.00),
                new Compra("Mudas",100.00),
                new Venda("Restaurante", 400.00),
                new Venda("Cliente1",50.00)
        );
        assertEquals(100.00, RelatorioCaixa.totalCompras(caixa));
    }

    @Test
    void deveRetornarTotalPagamentos(){
        Caixa caixa = new Caixa(
                new Pagamento("Conta de Luz",100.00),
                new Compra("Mudas",100.00),
                new Venda("Restaurante", 400.00),
                new Venda("Cliente1",50.00)
        );
        assertEquals(100.00, RelatorioCaixa.totalPagamentos(caixa));
    }

    @Test
    void deveRetornarTotalVendas(){
        Caixa caixa = new Caixa(
                new Pagamento("Conta de Luz",100.00),
                new Compra("Mudas",100.00),
                new Venda("Restaurante", 400.00),
                new Venda("Cliente1",50.00)
        );
        assertEquals(450.00, RelatorioCaixa.totalVendas(caixa));
    }

    @Test
    void deveRetornarLucro(){
        Caixa caixa = new Caixa(
                new Pagamento("Conta de Luz",100.00),
                new Compra("Mudas",100.00),
                new Venda("Restaurante", 400.00),
                new Venda("Cliente1",50.00)
        );
        assertEquals(250.00, RelatorioCaixa.lucro(caixa));
    }
}