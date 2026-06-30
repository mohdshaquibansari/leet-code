class Solution {
    public int majorityElement(int[] nums) {
        int a = 0,ans=0;
        for(int i =0; i<nums.length; i++){
            if(a == 0){
                ans =nums[i];
            }
            if(nums[i]==ans){
                a++;
            }else{
                a--;
            }
           
        }
        return ans;
    }
    
}