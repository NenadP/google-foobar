package bomb_baby;

import java.math.BigInteger;

public class Solution {
    public static String solution(String x, String y) {
        BigInteger mach = new BigInteger(x);
        BigInteger facula = new BigInteger(y);

        BigInteger step = BigInteger.ZERO;

        boolean reached = false;
        boolean impossible = false;

        while (!reached && !impossible) {
            if (mach.compareTo(facula) > 0) {
                if (mach.compareTo(facula.multiply(BigInteger.TEN)) > 0) {
                    BigInteger multi = mach.divide(facula).subtract(BigInteger.ONE);
                    mach = mach.subtract(facula.multiply(multi));
                    step = step.add(multi);
                } else {
                    mach = mach.subtract(facula);
                    step = step.add(BigInteger.ONE);
                }
            } else {
                if (facula.compareTo(mach.multiply(BigInteger.TEN)) > 0) {
                    BigInteger multi = facula.divide(mach).subtract(BigInteger.ONE);
                    facula = facula.subtract(mach.multiply(multi));
                    step = step.add(multi);
                } else {
                    facula = facula.subtract(mach);
                    step = step.add(BigInteger.ONE);
                }
            }

            reached = mach.compareTo(BigInteger.ONE) == 0 && facula.compareTo(BigInteger.ONE) == 0;
            impossible = mach.compareTo(BigInteger.ONE) < 0 || facula.compareTo(BigInteger.ONE) < 0;
        }

        if (reached) {
            return step.toString();
        }

        return "impossible";
    }
}
