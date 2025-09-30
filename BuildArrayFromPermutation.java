public class BuildArrayFromPermutation {
   public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        Solution sol = new Solution();
        int[] result = sol.buildArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
   }
}

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}