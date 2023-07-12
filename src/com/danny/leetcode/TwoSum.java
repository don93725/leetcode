package com.danny.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

	}

	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int res = target - num;
            if(numMap.containsKey(res)) {
                return new int[]{numMap.get(res), i};
            }
            numMap.put(num, i);
        }
        return new int[] {};
    }
}
