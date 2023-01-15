package fuel_injection_perfection;

import java.math.BigInteger;

public class BigIntegerSolution {
    public static int solution(String x) {
        int steps = 0;
        BigInteger value = new BigInteger(x);

        while (!value.equals(BigInteger.ONE)) {

            BigInteger valuePlus1 = value.add(BigInteger.ONE);
            BigInteger valueMinus1 = value.subtract(BigInteger.ONE);
            BigInteger valueMinus2 = valueMinus1.subtract(BigInteger.ONE);
            boolean valueIs3 = value.equals(BigInteger.valueOf(3));

            boolean isEven = value.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO);

            if (isEven) {
                value = value.divide(BigInteger.valueOf(2));
            } else if (valueIs3 || valuePlus1.and(value).compareTo(valueMinus1.and(valueMinus2)) > 0) {
                value = value.subtract(BigInteger.ONE);
            } else {
                value = value.add(BigInteger.ONE);
            }

            steps++;
        }
        return steps;
    }
}

