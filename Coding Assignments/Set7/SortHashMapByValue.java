package Set7;

import java.util.*;

public class SortHashMapByValue {
    public Map<Integer, Integer> sort(Map<Integer,Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            list.add(entry);
        }
        Collections.sort(list, (e1, e2) -> {return Integer.compare(e1.getValue(), e2.getValue());});


        Map<Integer, Integer> map2= new HashMap<>();
        for(Map.Entry<Integer, Integer> entry: list) {
            map2.put(entry.getKey(), entry.getValue());
        }
        return map2;
    }
}
