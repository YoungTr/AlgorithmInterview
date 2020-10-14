package array;

public class ReverseVowels {
    public String reverseVowels(String s) {
        byte[] bytes = s.getBytes();
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !isVowels(bytes[l])) {
                l++;
            }
            while (l < r && !isVowels(bytes[r])) {
                r--;
            }

            // swap
            byte t = bytes[l];
            bytes[l] = bytes[r];
            bytes[r] = t;


            l++;
            r--;

        }

        return new String(bytes);


    }

    private boolean isVowels(byte ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
