
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
      int []indices=new int[2];
        
        if(numbers == null || numbers.length<0){
            return indices;
        }
        int left=0;
        int right=numbers.length-1;
        
        while(left<right){
            int v = numbers[left]+numbers[right];
            if(v==target){
                return new int[]{left+1,right+1};
            }
            else if(v>target){
                right--;
            }
            else{
                left++;
            }
            
        }
        return new int[]{};
}
}