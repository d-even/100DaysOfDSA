package Array;

import java.util.*;

public class TwoSum{
    public static void main(String[] args) {
        
        int[] arr = {2,3,5,7,1};
        int target = 8;

        int[] ans = twoSum(arr, target);
        if (ans.length == 2) {
            System.out.println("Indices: [" + ans[0] + ", " + ans[1] + "]");
        } else {
            System.out.println("No pair found");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}