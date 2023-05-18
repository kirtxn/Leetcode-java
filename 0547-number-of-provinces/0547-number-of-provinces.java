class Solution {
    
    public static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj){
        
        vis[node]=true;
        
        for(Integer it: adj.get(node)){
            if(vis[it]==false){
                dfs(it,vis,adj);
            }
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        
        
        int V=isConnected.length;
        
        ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<V;i++){
           adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        
        
        boolean vis[]= new boolean[V]; 
        // int vis[]=new vis[V];
    
        int count =0;
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                count++;
                dfs(i,vis,adj);
            }
        }
        return count;
        
        
    }
}