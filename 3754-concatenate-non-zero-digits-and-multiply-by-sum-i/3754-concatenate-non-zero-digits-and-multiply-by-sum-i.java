class Solution {
    public long sumAndMultiply(int n) {

        long num = 0;
        int sum = 0;
        String s = "";
        while(n > 0){
            int digit = n % 10;
            n = n / 10;
            if(digit != 0){
                sum += digit;
                s = digit + s;
            }
        }
        if(s.length() == 0)
            return 0;
        num = Long.parseLong(s);
        return num * sum;
    }
}