class Solution {
    // Cách 1 O(N ^ 2)
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Cách 2: Áp dụng quy tắc O(N)
    // public int numIdenticalPairs(int[] nums) {
    // int[] ans = new int[101];
    // int count = 0;
    // for (int i = 0; i < nums.length; i++) {
    // count += ans[nums[i]];
    // ans[nums[i]]++;
    // }

    // return count;
    // }
}
