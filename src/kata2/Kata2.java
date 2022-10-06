package kata2;

import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;
import java.util.Iterator;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {2, 4, 1, 4, 6, 7, 4, 6, 1, 9, 5, 3, 0, 1, 0, 3, 3, 3, 5, 2};
        
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < data.length; i++) {
            map.put(data[i], map.containsKey(data[i])? map.get(data[i]) + 1 : 1);
            
        }
        
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        /*System.out.println("··········");
        for (Integer key: map.keySet()) {
            System.out.println("key: " + key + ", value: " + map.get(key));
        }
        System.out.println("··········");
        for (Integer value: map.values()) {
           System.out.println("key: ······ , value: " + value);
        }
        System.out.println("··········");
        Iterator<Map.Entry<Integer, Integer>> iteratorEntries = map.entrySet().iterator();
        while (iteratorEntries.hasNext()) {
            Map.Entry<Integer, Integer> iteration = iteratorEntries.next();
            System.out.println("key: " + iteration.getKey() + ", value: " + iteration.getValue());
        }*/
        
    }
    
}
