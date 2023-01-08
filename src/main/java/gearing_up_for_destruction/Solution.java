package gearing_up_for_destruction;

public class Solution {
    public static int[] solution(int[] pegs) {
        boolean isEven = pegs.length % 2 == 0;

        int numerator = getFirstGearNumerator(pegs);
        int denominator = isEven ? 3 : 1;

        if (!hasValidGears(pegs, numerator, denominator)) return new int[]{-1, -1};

        if (isEven && numerator % 3 == 0) {
            numerator /= 3;
            denominator = 1;
        }

        return new int[]{numerator, denominator};
    }

    static int getFirstGearNumerator(int[] pegs) {
        boolean isEven = pegs.length % 2 == 0;
        int numerator = -pegs[0];
        int sign = 1;
        for (int i = 1; i < pegs.length - 1; i++) {
            numerator += sign * 2 * pegs[i];
            sign = -sign;
        }
        numerator += (sign * pegs[pegs.length - 1]);

        numerator = isEven ? (int) ((numerator * (float) 2 / 3) * 3) : numerator * 2;
        return numerator;
    }

    static boolean hasValidGears(int[] pegs, int numerator, int denominator) {
        int numeratorToCheck = numerator;
        for (int i = 0; i < pegs.length - 1; i++) {
            int distance = (pegs[i + 1] - pegs[i]) * denominator;

            if (numeratorToCheck < denominator) {
                return false;
            }
            numeratorToCheck = distance - numeratorToCheck;
        }
        return true;
    }
}
