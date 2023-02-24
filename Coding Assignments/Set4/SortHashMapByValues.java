package Set4;

import java.util.*;

public class SortHashMapByValues {
    public Map<Integer, Integer> sortByValues(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                return Integer.compare(entry1.getValue() , entry2.getValue());
            }
        });

        Map<Integer, Integer> result = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry: list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
