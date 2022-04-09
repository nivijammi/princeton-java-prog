package edu.princeton.week3;

import junit.framework.TestCase;
import org.junit.Test;

public class DiscreteDistributionTest  {
    @Test
    public void shouldReturnMRandomIndicesChoosingEachIndexIWithProbabilityProportionalToAi(){
        DiscreteDistribution object = new DiscreteDistribution();
        int[] n = {10,10,10,10,10,10,50};
        object.uniqueIndex(n);

    }
 {
    }
}
