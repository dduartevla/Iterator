public class Pagamento extends Transacao{

    public Pagamento(String descricao, double valor){
        super(descricao,valor, "Pagamento");
    }
    @Override
    public double getValorCalculo() {
        return this.getValor()*(-1);
    }
}
