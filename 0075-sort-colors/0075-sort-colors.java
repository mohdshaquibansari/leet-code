class Solution {
    public void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;


        for(int x = 0; x<nums.length;x++){

            if(nums[x] == 0)
                zero++;

            else if(nums[x] == 1)
                one++;

            else
                two++;
        }


        int i = 0;


        while(zero-- > 0){
            nums[i++] = 0;
        }

        while(one-- > 0){
            nums[i++] = 1;
        }

        while(two-- > 0){
            nums[i++] = 2;
        }

    }
}