package Structral.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private Map<String, IPublication> map = new HashMap<>();

    public IPublication getPublications(String key) {
        return map.get(key);
    }

    public void put(String key, IPublication value) {
        if (map.get(key) == null) {
            map.put(key, value);
        }
    }

}
