package hashing.collision.strings;

import org.junit.Assert;

import org.junit.Test;

public class StringHashingCollisionTests {

    @Test
    public void testStringHashCodeCollision1() {
        int n = 1;
        String s1 = CollisionStringGenerator.generate(n);
        String s2 = CollisionStringGenerator.generate(n);
        output(s1, s2);
        Assert.assertEquals("StringHashingColliding:", s1.hashCode(), s2.hashCode());
    }
    @Test
    public void testStringHashCodeCollision2() {
        int n = 2;
        String s1 = CollisionStringGenerator.generate(n);
        String s2 = CollisionStringGenerator.generate(n);
        output(s1, s2);
        Assert.assertEquals("StringHashingColliding:", s1.hashCode(), s2.hashCode());
    }
    @Test
    public void testStringHashCodeCollision11() {
        int n = 11;
        String s1 = CollisionStringGenerator.generate(n);
        String s2 = CollisionStringGenerator.generate(n);
        output(s1, s2);
        Assert.assertEquals("StringHashingColliding:", s1.hashCode(), s2.hashCode());
    }
    
    private void output(String s1, String s2) {
        System.out.println("s1: " + s1 + ", hash: " + s1.hashCode() + "\n" 
                + "s2: " + s2 + ", hash: " + s2.hashCode());
    }

}
