package gearing_up_for_destruction;

public class BruteForceSolution {
    public static int[] solution(int[] pegs) {
        boolean isEven = pegs.length % 2 == 0;

        int a = -1;
        int b = isEven ? 3 : 1;

        int firstDist = pegs[1] - pegs[0];
        int bruteForceRange = isEven ? firstDist * 3 : firstDist;

        for (int i = 0; i < bruteForceRange; i++) {
            int lastGearNumerator = getLastGearNumerator(pegs, i, b);
            int expectedLastGearNumerator = (i + (isEven ? 0: 1)) / 2;
            if (lastGearNumerator == expectedLastGearNumerator) {
                a = i;
                break;
            }
        }
        if (a == -1) {
            return new int[]{-1, -1};
        }

        if (isEven && a % 3 == 0) {
            a = a / 3;
            b = 1;
        }
        return new int[]{a, b};
    }

    static int getLastGearNumerator(int[] pegs, int numerator, int denominator) {
        int lastGearNumerator = numerator;
        for (int i = 0; i < pegs.length - 1; i++) {
            int distance = (pegs[i + 1] - pegs[i]) * denominator;

            if (lastGearNumerator < denominator) {
                return -1;
            }
            lastGearNumerator = distance - lastGearNumerator;
        }
        return lastGearNumerator;
    }
}
