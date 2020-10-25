package collection;


public class IsIsomorphic205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[128];
        int[] mapT = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (mapS[cs] != mapT[ct]) {
                return false;
            }

            if (mapS[cs] == 0) {
                mapS[cs] = i + 1;
                mapT[ct] = i + 1;
            }
        }

        return true;
    }
}
