package hashing.collision.strings;

import java.util.Random;

public final class CollisionStringGenerator {
    private final static String comp[] = new String[]{"Aa","BB"};
    private CollisionStringGenerator() {
        throw new UnsupportedOperationException();
    }
    /** 
     * this method generates a string with 2N length,
     * for all generated string with the same length, the
     * hash code for the strings are the same. 
     */
    public static String generate(int n) {
        StringBuilder sb = new StringBuilder(2*n);
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            // get uniformly at random for each i the subcomponent
            // at position ether 0 or 1.
            sb.append(comp[rand.nextInt(2)]);
        }
        return sb.toString();        
    }
}
