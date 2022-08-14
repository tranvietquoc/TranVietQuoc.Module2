package ss10_generic_stack_queue.codegym;

import java.util.*;

public class Count {
    public static void main(String[] args) {
        String str = "Xin chào mọi người, chào cô chú, chào các bạn";
        str = str.replaceAll(",", "");
        String[] arr = str.split(" ");
        String key = "";
        Integer value;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String s : arr) {
            key = s;
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
        // print result
        Set<String> set = map.keySet();
        for (String s : set) {
            key = s;
            System.out.println("Word '" + key + "' appear " + map.get(key) + " time");
        }
    }
}
