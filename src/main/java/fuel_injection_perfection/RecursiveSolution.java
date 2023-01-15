package fuel_injection_perfection;

import java.math.BigInteger;

public class RecursiveSolution {
    public static int solution(String x) {
        int[] min = {Integer.MAX_VALUE};
        countSteps(new BigInteger(x), 0, min);
        return min[0];
    }

    static void countSteps(BigInteger value, int step, int[] min) {
        if (value.equals(BigInteger.ONE)) {
            if (min[0] > step) min[0] = step;
            return;
        }

        if (value.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
            countSteps(value.divide(BigInteger.valueOf(2)), step + 1, min);
        } else if (value.equals(BigInteger.valueOf(3)) || value.mod(BigInteger.valueOf(4)).equals(BigInteger.valueOf(1))) {
            countSteps(value.subtract(BigInteger.ONE), step + 1, min);
        } else {
            countSteps(value.add(BigInteger.ONE), step + 1, min);
        }
    }
}
