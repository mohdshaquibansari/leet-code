class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        int  x = k%n ;
        int[]  ans=new int[n] ;
        int j=0;
        for(int i =n-x; i<n; i++ ){
            ans[j++]=nums[i];
        }
        for(int i=0;i<n-x;i++){
            ans[j++]=nums[i];
        }
       for(int i =0;i<n;i++){
        nums[i]=ans[i];
       }
    }
}