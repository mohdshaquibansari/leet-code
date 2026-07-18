class Solution {
    public int findGCD(int[] nums) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < minNum) {
                minNum = num;
            }
            if (num > maxNum) {
                maxNum = num;
            }
        }
        
       return gcd(maxNum, minNum);
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}