package collection;

import java.util.HashMap;
import java.util.Map;

public class WordPattern209 {

    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        if (pattern.length() != split.length) {
            return false;
        }

        Map<Character, String> record = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!record.containsKey(c)) {
                if (record.containsValue(split[i])) {
                    return false;
                }
                record.put(c, split[i]);
            } else {
                String v = record.get(c);
                if (!v.equals(split[i])) {
                    return false;
                }
            }

        }

        return true;
    }
}
