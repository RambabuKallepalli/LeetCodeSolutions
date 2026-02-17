package org.leetCode;

import java.util.HashMap;

public class S1_TwoSum {
    public int[] twoSum_a1 (int[] nums, int target) {
        for (int i=0;i<nums.length-1;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public int[] twoSum_a2 (int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if(hashMap.containsKey(target-nums[i])) {
                return new int[] {hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
