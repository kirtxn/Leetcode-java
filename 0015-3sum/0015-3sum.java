class Solution {
    
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums.length<3){
            return result;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            
            int n1= nums[i];
            int target = -n1;
            twoSum(nums,target,i+1,nums.length-1);
        }
        return result;
    }
    public void twoSum(int []nums,int target,int i,int j){
        while(i<j){
            if(nums[i]+nums[j]> target){
                j--;
            }
            else if(nums[i]+nums[j]<target){
                i++;
            }
            else{
                while(i<j && nums[i]==nums[i+1]) i++;
                while(i<j && nums[j]==nums[j-1]) j--;
                result.add(Arrays.asList(-target,nums[i],nums[j]));
                i++;
                j--;
                
            }
        }
    }
}