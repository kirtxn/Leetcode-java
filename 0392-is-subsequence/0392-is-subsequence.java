class Solution {
    public boolean isSubsequence(String s, String t) {
        
            int j=0;
            if(s.length()<1){
                return true;
            }

           for(int i=0;i<t.length()&&j<s.length();i++){
               if(s.charAt(j)==t.charAt(i)){
                   j++;
               }
               if(s.length()==j){
                   return true;
               }
           }
            return false;
    }
}