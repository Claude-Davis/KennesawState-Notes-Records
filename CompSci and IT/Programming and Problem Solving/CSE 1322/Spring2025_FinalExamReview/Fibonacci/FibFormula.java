//package Fibonacci;

import java.math.*;

public class FibFormula implements FindFib{

    @Override
    public int calculateFib(int n){
        double goldenRatio = ((1 + Math.sqrt(5))/2);
        double goldenRatioConjugate = ((1 - Math.sqrt(5))/2);

        double binet0 = ( (Math.pow(goldenRatio, n))-(Math.pow(goldenRatioConjugate, n))) / Math.sqrt(5);

        int binet = (int) binet0;
        return binet;
    }
}
