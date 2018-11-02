package TwoSum;

import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int length = nums == null ? 0 : nums.length;
        if(length < 2) {
            return new int[]{};
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<length ; i++) {
            if(!hashMap.containsKey(nums[i])) {
                hashMap.put(target - nums[i], i);
            } else {
                return new int[]{hashMap.get(nums[i]), i};
            }
        }
        return new int[]{};
    }
}
