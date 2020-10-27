package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort451 {

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer count = map.getOrDefault(c, 0) + 1;
            map.put(c, count);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        maxHeap.addAll(map.entrySet());

        StringBuilder builder = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> poll = maxHeap.poll();
            int count = poll.getValue();
            while (count > 0) {
                builder.append(poll.getKey());
                count--;
            }
        }

        return builder.toString();
    }
}
