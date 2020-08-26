package com.svlugovoy;

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

//        Map<Integer, String> map2 = new TreeMap<>();
//        map2.put(1, "one");
//        map2.put(2, "two");
//        map2.put(null, "three");
//
//        System.out.println(map2);

//        Map<MyKeyObj, String> map3 = new TreeMap<>();
//
//        MyKeyObj key = new MyKeyObj("key");
//        map3.put(key, "one");
//
//        System.out.println(map3);
    }
}

@Data
@AllArgsConstructor
class MyKeyObj {
    String str;

}
