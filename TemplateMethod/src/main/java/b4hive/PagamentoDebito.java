package b4hive;

public class PagamentoDebito extends Pagamento {
    @Override 
    public String getMetodoPagamento() {
        return "Débito";
    }
}
