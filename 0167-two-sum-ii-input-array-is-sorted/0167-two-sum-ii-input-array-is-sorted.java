
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
       Map <Integer,Integer> mp = new HashMap<>();

       for(int i=0;i<numbers.length;i++){
           int diff = target-numbers[i];
           if(mp.containsKey(diff)){
               return new int[]{mp.get(diff)+1,i+1};
           }
           mp.put(numbers[i],i);
       }
      return new int[]{};
}
}