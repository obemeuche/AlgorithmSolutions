public class PatternMatching {

    // Pattern Matching Algorithm.
    public static boolean patternMatching (String text, String pattern) {
        int count = 0;
        boolean result = false;
        int tlen = text.length();
        int plen = pattern.length();
        char t,p;

        for (int i = 0; i < tlen - plen; i++) {
            t = text.charAt(i);
            p = pattern.charAt(0);

            if (t == p) {
                for (int j = i, k = 0; j < i + plen; j++, k++) {
                    t = text.charAt(j);
                    p = pattern.charAt(k);

                    if (t == p) {
                        count++;
                    }
                }
            }
        }
        if (count == plen) return true;
        else return false;

        // Optimized Solution
//        boolean contain = text.contains(pattern);
//        if (contain == true) return true;
//        else return false;
    }

    public static void main(String[] args) {
        System.out.println(PatternMatching.patternMatching("Hello", "lol"));
    }
}
