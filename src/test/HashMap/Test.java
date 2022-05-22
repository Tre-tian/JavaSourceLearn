package test.HashMap;


import java.util.HashMap;
import java.util.Map;

/**
 * Write the code. Change the world.
 *
 * @author rsyan
 * Created on 2022-04-15
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("k1", 0.1);
        map.put("k2", 0.2);
        map.put("k3", 0.3);
        map.put("k4", 0.4);
        for (Map.Entry<String, Double> stringDoubleEntry : map.entrySet()) {
            System.out.println(stringDoubleEntry);
        }
    }
}
