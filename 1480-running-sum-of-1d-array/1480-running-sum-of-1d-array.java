class Solution {
    public int[] runningSum(int[] nums) {
        
      int sum[] = new int[nums.length];
        sum[0]=nums[0];
        int count=nums[0];
        for(int i=1;i<nums.length;i++){
            count=count+nums[i];
            sum[i]=count;
        }
        return sum;
      
       
    }
}