package Set7;

import java.util.HashMap;
import java.util.Map;

public class GetDistinctCharacters {
    public Map<Character, Integer> countChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
