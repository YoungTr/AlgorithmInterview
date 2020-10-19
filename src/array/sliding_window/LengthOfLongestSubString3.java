package array.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString3 {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int l = 0, r = -1;  // 滑动窗口
        int res = 0;
        while (l < s.length()) {
            if (r < s.length() - 1 && !set.contains(s.charAt(r + 1))) {
                r++;
                set.add(s.charAt(r));
            } else {
                set.remove(s.charAt(l++));
            }

            res = Math.max(res, r - l + 1);
        }


        return res;
    }
}
