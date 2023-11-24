public class Compra extends Transacao{

    public Compra(String descricao, double valor){
        super(descricao,valor, "Compra");
    }
    @Override
    public double getValorCalculo() {
        return this.getValor()*(-1);
    }
}
