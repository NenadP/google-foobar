package i_love_lance_and_janice;

class Solution {

    public static String solution(String x) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String reversedAlphabet = new StringBuilder(alphabet).reverse().toString();

        StringBuilder decoded = new StringBuilder();

        for (Character c : x.toCharArray()) {
            if (!reversedAlphabet.contains(c.toString())) {
                decoded.append(c);
            } else {
                decoded.append(
                        alphabet.charAt(reversedAlphabet.indexOf(c))
                );
            }
        }

        return decoded.toString();
    }
}
