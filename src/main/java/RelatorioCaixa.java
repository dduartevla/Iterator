import java.util.Iterator;

public class RelatorioCaixa {

    public static Double totalCompras(Caixa caixa){
        double totalCompras = 0.0;
        for(Transacao transacao : caixa){
            if(transacao.getTipo().equals("Compra")){
                totalCompras = totalCompras + transacao.getValor();
            }
        }
        return totalCompras;
    }

    public static Double totalVendas(Caixa caixa){
        double totalVendas = 0.0;
        for(Transacao transacao : caixa){
            if(transacao.getTipo().equals("Venda")){
                totalVendas = totalVendas + transacao.getValor();
            }
        }
        return totalVendas;
    }

    public static Double totalPagamentos(Caixa caixa){
        double totalPagamentos = 0.0;
        for(Transacao transacao : caixa){
            if(transacao.getTipo().equals("Pagamento")){
                totalPagamentos = totalPagamentos + transacao.getValor();
            }
        }
        return totalPagamentos;
    }

    public static Double lucro(Caixa caixa){
        double lucro = 0.0;
        for(Transacao transacao : caixa){
            lucro = lucro + transacao.getValorCalculo();
        }
        return lucro;
    }

    public static Integer contarTotalTransacoes(Caixa caixa) {
        int quantidade = 0;
        for (Iterator a = caixa.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
