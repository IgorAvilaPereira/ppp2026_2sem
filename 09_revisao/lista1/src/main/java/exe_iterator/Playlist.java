package exe_iterator;

import java.util.Iterator;

public class Playlist implements Iterator<Musica> {
    private Musica musicas[];
    private int pos;

    public Playlist(){
        this.musicas = new Musica[2];
        this.musicas[0] = new Musica("Chão de giz", "Zé ramalho");
        this.musicas[1] = new Musica("Garçom", "Reginaldo Rossi");
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return this.pos < musicas.length;

    }

    @Override
    public Musica next() {
        return this.musicas[pos++];
    }

}
