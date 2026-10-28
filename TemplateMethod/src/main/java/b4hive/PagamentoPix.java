package b4hive;

public class PagamentoPix extends Pagamento {
    @Override 
    public String getMetodoPagamento() {
        return "Pix";
    }
}
