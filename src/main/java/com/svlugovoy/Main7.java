package com.svlugovoy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main7 {

  public static void main(String[] args) {

    System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 1, 6, 7, 8, 2})); //true

    System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5})); //false

    System.out.println(containsDuplicate(new int[]{1, 1})); //true

  }


  public static boolean containsDuplicate(int[] nums) {

//    for (int i = 0; i < nums.length; i++) {
//      for (int j = i + 1; j < nums.length; j++) {
//        if (nums[i] == nums[j]) {
//          return true;
//        }
//      }
//    }
//    return false;


//    Set<Integer> set = new HashSet<>();
//    for (int num : nums) {
//      set.add(num);
//    }
//
//    return set.size() == nums.length;


    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.merge(num, 1, Integer::sum);
    }

    for (Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        return true;
      }
    }

    return false;
  }

}




