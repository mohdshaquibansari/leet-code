class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int a =1, ans= nums[0];
        for(int i =1; i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                a++;
            }else{
                a=1;
                ans=nums[i];
            }

            if(a>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
    
}