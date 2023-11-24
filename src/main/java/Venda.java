public class Venda extends Transacao{
    public Venda(String descricao, double valor){
        super(descricao,valor, "Venda");
    }
    @Override
    public double getValorCalculo() {
        return this.getValor();
    }
}
