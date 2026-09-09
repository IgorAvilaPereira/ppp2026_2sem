package restaurante_ppp2026_2sem;

import java.util.Iterator;
import java.util.List;

/**
 * CafeInvertidoIterator
 */
public class CafeInvertidoIterator implements Iterator<String>{
    private List<String> cafes;
    private int pos;

    public  CafeInvertidoIterator(List<String> cafes) {
        this.cafes = cafes;
        this.pos = this.cafes.size()-1;
    }

    @Override
    public boolean hasNext() {
        return this.pos >= 0;


    }

    @Override
    public String next() {
        return this.cafes.get(pos--);
    }


}
