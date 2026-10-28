package b4hive;

public class PagamentoCredito extends Pagamento {
    @Override 
    public String getMetodoPagamento() {
        return "Crédito";
    }
}
