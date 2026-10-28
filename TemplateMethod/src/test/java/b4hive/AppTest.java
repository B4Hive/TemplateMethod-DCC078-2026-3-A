package b4hive;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test 
    public void testPagamentoDebito() {
        Pagamento pagamento = new PagamentoDebito();
        assertTrue(pagamento.processarPagamento().equals("Débito"));
    }
    @Test 
    public void testPagamentoCredito() {
        Pagamento pagamento = new PagamentoCredito();
        assertTrue(pagamento.processarPagamento().equals("Crédito"));
    }
    @Test
    public void testPagamentoPix() {
        Pagamento pagamento = new PagamentoPix();
        assertTrue(pagamento.processarPagamento().equals("Pix"));
    }
}
