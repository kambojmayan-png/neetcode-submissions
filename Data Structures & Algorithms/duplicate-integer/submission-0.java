class Solution {
    public static boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        boolean output = false;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if(nums[i] == nums[j]){
                    output = true;
                }
            }
        }
        return output;
    }
    public static void main(String[] args){
        int[] nums = {};
        hasDuplicate(nums);
    }
}