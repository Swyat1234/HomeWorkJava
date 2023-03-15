package HomeWork13_03_23;

import java.util.HashMap;
import java.util.Map;

public class Database<K extends Number,V> {
    Map<K,V> map = new HashMap<>();
public void add(K key,V value){
    map.put(key,value);
}

    @Override
    public String toString() {
        return "Database{" +
                "map=" + map +
                '}';
    }
}
