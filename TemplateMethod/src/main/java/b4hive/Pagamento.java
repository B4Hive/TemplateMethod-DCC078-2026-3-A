package b4hive;

public abstract class Pagamento {
    public abstract String getMetodoPagamento();
    public String processarPagamento() {
        return getMetodoPagamento();
    }
}
