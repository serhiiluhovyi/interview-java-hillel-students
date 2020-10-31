package com.svlugovoy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import lombok.AllArgsConstructor;
import lombok.Data;

public class Main3 {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(null, "three");
        map1.put(null, "ten");

        System.out.println(map1);

        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(1, "one");
        map2.put(2, "two");
//        map2.put(null, "three");

        System.out.println(map2);

//        Map<MyKeyObj, String> map3 = new TreeMap<>();
        Map<MyKeyObj, String> map3 = new TreeMap<>();

        MyKeyObj key = new MyKeyObj("key");
        map3.put(key, "one");

        System.out.println(map3);

        Comparator<MyKeyObj> comparator =
            (s1, s2) -> s1.getStr().length() - s2.getStr().length();
        Map<MyKeyObj, String> map4 = new TreeMap<>(comparator);

    }
}

@Data
@AllArgsConstructor
class MyKeyObj implements Comparable<MyKeyObj> {

    private String str;

    @Override
    public int compareTo(MyKeyObj obj) {
        return this.str.compareTo(obj.getStr());
    }
}
