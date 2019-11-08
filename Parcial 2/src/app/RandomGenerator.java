package app;

import java.util.Random;

/**
 * RamdomGenerator
 */
@Generator
public class RandomGenerator {
    
    @SeedValueAttribute(value = 98765)
    private long seed;

    public long getSeed() {
        return seed;
    }

    public void setSeed(long seed) {
        this.seed = seed;
    }

    public double randomGenerator(){
        Random generator = new Random(seed);
        double num = generator.nextDouble();
        return num;
    }
    
}