import com.google.common.collect.ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapTest {
    public static void main(String[] args) {
        Map<String, String> mutableMap = new HashMap<>();
        mutableMap.put("USA", "North America");
       // mutableMap.t
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(mutableMap);

        mutableMap.put("Canada", "North America");

        ImmutableMap<String, String> immutableMap = ImmutableMap.copyOf(mutableMap);
        System.out.println(immutableMap.containsKey("USA"));
       immutableMap.put("Canada", "North America");

       // mutableMap.remove("USA");
    }
}
