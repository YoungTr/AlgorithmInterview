package array;

public class Palindrome125 {

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        if (s.length() <= 1) {
            return true;
        }

        s = s.toLowerCase();

        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            char start = s.charAt(l);
            char end = s.charAt(r);
            if (!valid(start)) {
                l++;
                continue;
            }
            if (!valid(end)) {
                r--;
                continue;
            }

            if (start != end) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

    private boolean valid(char ch) {
        return Character.isLetterOrDigit(ch);
    }
}
