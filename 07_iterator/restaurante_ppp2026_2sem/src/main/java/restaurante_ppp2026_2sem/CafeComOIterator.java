package restaurante_ppp2026_2sem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * CafeComOIterator
 */
public class CafeComOIterator implements Iterator<Object> {
    private List<String> cafes;
    private ArrayList<String> cafesResult;
    private int pos;

    public CafeComOIterator(List<String> cafes){
        this.cafes = cafes;
        this.cafesResult = new ArrayList<String>();
        for (String cafe : cafes) {
            if (cafe.toUpperCase().startsWith("O")) {
                this.cafesResult.add(cafe);
            }
        }
        this.pos  = 0;
        

    }
    

    @Override
    public boolean hasNext() {
        return this.pos < this.cafesResult.size();

    }

    @Override
    public Object next() {
        return this.cafesResult.get(pos++);

    }

}
