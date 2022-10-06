package kata2;

import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;
import java.util.Iterator;

public class Kata2 {

    public static void main(String[] args) {
        String [] data = {"Alejandro", "Alberto", "Rubén", "Alberto", "Giusepe", "Carlos", "Alberto", "Giusepe", "Rubén", "Mario", "Rosa", "Maria", "Marta", "Rubén", "Marta", "Maria", "Maria", "Maria", "Rosa", "Alejandro"};
        
        HistogramGenerator histogramGenerator = new HistogramGenerator(data);
        Map<String, Integer> map = histogramGenerator.getHistogram();
        
        
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
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
