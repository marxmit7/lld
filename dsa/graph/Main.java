
package dsa.graph;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args){

        List<List<Integer>> edges = new ArrayList<>();
        Map<Integer,List<Integer>> mp  = new HashMap<>();
        int n = 10;

        for(int i=0;i<n;i++){
            mp.put(i, new ArrayList<>());
        }

        for(List<Integer> edge:edges){
            mp.get(edge.get(0)).add(edge.get(1));
            mp.get(edge.get(1)).add(edge.get(0));
        }

        int[] visited = new int[n];
        int[] parent = new int[n];
        Arrays.fill(visited, -1);
        Arrays.fill(parent, -1);


        int noOfConnectedComponents = 0;

        for(int i =0;i<n;i++){
            if(visited[i]==-1){
                noOfConnectedComponents++;
                bfs(mp,visited,i);
            }
        }
    }



    private static void bfs(Map<Integer, List<Integer>> mp , int[] visited, int node ){

        if(visited[node]!=-1) return;
        Queue<Integer> queue =  new LinkedList<>();
        queue.offer(node);
        visited[node] = 1;

        while(!queue.isEmpty()){
            int currNode = queue.poll();
            for(Integer nei:mp.get(currNode)){
                if(visited[nei]!=-1) continue;

                queue.offer(nei);
                visited[nei]=1;
            }

        }
    }

    private static void dfs( Map<Integer,List<Integer>> mp, int[] visited, int node){

        if(visited[node]!=-1) return ;

        visited[node]=1;

        for(Integer nei: mp.getOrDefault(node,new ArrayList<>())){
            if(visited[nei]==-1)
            dfs(mp,visited,nei);
        }
    }
}
