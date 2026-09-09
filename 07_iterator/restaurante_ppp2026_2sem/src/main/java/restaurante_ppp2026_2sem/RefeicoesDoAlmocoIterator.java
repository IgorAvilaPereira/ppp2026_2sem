package restaurante_ppp2026_2sem;

import java.util.Iterator;

public class RefeicoesDoAlmocoIterator implements Iterator<String> {
    private String[] refeicoes;
    private int pos;

    public RefeicoesDoAlmocoIterator(String refeicoes[]) {
        this.refeicoes = refeicoes;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return this.pos < this.refeicoes.length;
    }

    @Override
    public String next() {
        return this.refeicoes[pos++];
    }

}
