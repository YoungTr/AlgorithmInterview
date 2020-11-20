package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfBoomerangs447 {

    public int numberOfBoomerangs(int[][] points) {

        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                int dis = dx * dx + dy * dy;
                if (!map.containsKey(dis)) {
                    map.put(dis, 1);
                } else {
                    int n = map.get(dis);
                    ans += 2 * n;
                    map.put(dis, n + 1);
                }

            }
            map.clear();

        }

        return ans;

    }
}
