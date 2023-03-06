package cogent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonArrayElements {
    // 10 WAP to find all common array elements
    public static List<Integer> findCommon(int[] array1, int[] array2) {
        List<Integer> list = new ArrayList<>();
        if(array1 == null || array2 == null) {
            return list;
        }
        Map<Integer, Integer> map1 = buildMap(array1);
        Map<Integer, Integer> map2 = buildMap(array2);
        for(int num: map1.keySet()) {
            if(map2.containsKey(num)) {
                addToList(num, Math.min(map1.get(num), map2.get(num)), list);
            }
        }
        return list;
    }

    public static Map<Integer, Integer> buildMap(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }

    public static void addToList(int val, int times, List<Integer> list) {
        while(times-- > 0) {
            list.add(val);
        }
    }
}
