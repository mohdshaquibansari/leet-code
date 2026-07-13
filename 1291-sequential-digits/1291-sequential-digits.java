class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        int min = String.valueOf(low).length();
        int max = String.valueOf(high).length();
        List<Integer> ans = new ArrayList<>();
        for(int i=min;i<=max;i++){
            for(int j = 0;j+i<=9;j++){
                String subStr = s.substring(j,j+i);
                int num = Integer.parseInt(subStr);
                if(num>=low && num <= high){
                    ans.add(num);
                }
            }
        }
        return ans;
       
        
    }
}