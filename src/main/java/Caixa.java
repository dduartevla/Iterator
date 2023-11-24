import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Caixa implements Iterable<Transacao>{

    private List<Transacao> transacoes = new ArrayList<Transacao>();
    public Caixa(Transacao...transacoes){
        this.transacoes= Arrays.asList(transacoes);
    }

    public Iterator<Transacao> iterator(){
        return transacoes.iterator();
    }
}
