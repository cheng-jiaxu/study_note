package com.aijk.leecode;
import java.util.HashMap;
import java.util.Map;

public class leeCode1HashMap {
    public int[] twosums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Np");

    }
}
