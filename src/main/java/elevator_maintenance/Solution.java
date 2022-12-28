package elevator_maintenance;

import java.util.Arrays;

public class Solution {

    public static String[] solution(String[] l) {
        return Arrays.stream(l).sorted((String a, String b) -> {
            String[] aParts = a.split("\\.");
            String[] bParts = b.split("\\.");

            int minLength = Math.min(bParts.length, aParts.length);

            for (int i = 0; i < minLength; i++) {
                int aPart = Integer.parseInt(aParts[i]);
                int bPart = Integer.parseInt(bParts[i]);

                if (aPart != bPart) {
                    return aPart - bPart;
                }
            }

            return aParts.length - bParts.length;
        }).toArray(String[]::new);
    }
}
