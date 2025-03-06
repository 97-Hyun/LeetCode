class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dict = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            if (dict.containsKey(value)) {
                return new int[] {dict.get(value), i};
            } else {
                int sub = target - value;
                dict.put(sub, i);
            }
        }

        return new int[] {};
    }
}