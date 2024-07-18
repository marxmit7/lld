package dsa.graph;

import java.util.Queue;

public class TopologicalSort{
    public static void main(String[] args){

        int n =10;
        int[][] graph = new int[n][n];
        List<Integer> result ;
        result = usingIndegree(graph);
        result = usingDfs(graph);

    }

    private static List<Integer> usingIndegree(int[][] graph){
        int n = graph.length;
        int[] indegrees = new int[n];
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new List<>();
        
        for(int i=0;i<n;i++){
            for(int j:graph[i]){
                indegrees[j]++;
            }
        }

        for(int i=0;i<n;i++){
            if(indegrees[i]==0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.poll();
            result.add(curr);

            for(int nei: graph[nei]){
                indegrees[nei]--;

                if(indegrees[nei]==0){
                    q.offer(nei);
                }
            }
        }

        return result;



    }

    private static List<Integer> usingDfs(int[][] graph ){
        int n =graph.length;
        boolean[] visited = new boolean[n];
        Stack<Integer> stk = new Stack<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(graph,i,stk,visited);
            }
        }
        while(!stk.size()==0){
            result.add(stk.pop());
        }
        return result;
    }

    private void dfs(int[][] graph, int node, Stack<Integer> stk, boolean[] visited){
        visited[node]=true;

        for(int nei:graph[node]){
            if(!visited[nei]){
                dfs(graph,nei,stk,visited);
            }
        }
        stk.push(node);
    }


}