package collection;

import java.util.*;

public class GroupAnagrams49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            byte[] bytes = s.getBytes();
            Arrays.sort(bytes);
            String temp = new String(bytes);
            List<String> list = map.getOrDefault(temp, new ArrayList<>());
            list.add(s);
            map.put(temp, list);
        }
        return new ArrayList<>(map.values());
    }
}
