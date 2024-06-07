package dsa.graph;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class UndirectedCycle{

    public static void main(String[] args){

        UndirectedCycle undirectedCycle = new UndirectedCycle();
        List<List<Integer>> adjList = new ArrayList<>();
        undirectedCycle.detectCycle(adjList);

    }

    private static boolean detectCycle(List<List<Integer>> adjList){
        UnionFind uf = new UnionFind(adjList.size());

        int n = adjList.size();

        boolean[] visited = new boolean[n];
        boolean ans =false;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(detectCycleUsingBfs(adjList,i,visited)){
                    ans= true;
                    break;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(detectCycleUsingDfs(adjList,i,-1,visited)){
                    ans= true;
                    break;
                }
            }
        }


        for(List<Integer> edge:adjList){ // assuming adjList is nothing but edges only

            int u = edge.get(0);
            int v = edge.get(1);

            if(uf.find(u)==uf.find(v)){
                ans = true;
                break;
            }else {
                uf.union(u, v);
            }

        }
        return ans;

    }

    private static boolean detectCycleUsingBfs(List<List<Integer>> adjList, int start , boolean[] visited){

        Queue<int[]> qq = new LinkedList<>();
        qq.offer(new int[]{start,-1});
        visited[start]=true;

        while(!qq.isEmpty()){
            int[] node = qq.poll();

            int parent = node[1];
            int currNode = node[0];

            for(int nei: adjList.get(currNode)){
                if(!visited[nei]){
                    visited[nei] = true;
                    qq.offer(new int[]{nei,currNode});
                } else if(nei!=parent){
                    return true;
                }
            }
        }
        return false;

    }

    private static boolean detectCycleUsingDfs(List<List<Integer>> adjList, int start, int parent, boolean[] visited){

        visited[start]=true;
        for(int nei:adjList.get(start)){
            if(!visited[nei]){
                if(detectCycleUsingDfs(adjList,nei,start,visited)){
                    return true;
                }
            } else if(nei!=parent){
                return true;
            }
        }
        return false;
    }


static class UnionFind{

        private int[] parent;
        private int[] rank;

        public UnionFind(int size){
            parent = new int[size];
            rank = new int[size];

            for(int i=0;i<size;i++){
                parent[i]=i;
                rank[i]=0;
            }
        }


        public int find(int node){
            if(parent[node]!=node){
                parent[node]=find(parent[node]); // path compression
            }

            return parent[node];
        }

        public void union(int p, int q){

            int rootP = find(p);
            int rootQ = find(q);

            if(rootP!=rootQ){
                if(rank[rootP]>rank[rootQ]){
                    parent[rootQ]=rootP;
                } else if(rank[rootP]<rank[rootQ]){
                    parent[rootP]=rootQ;
                } else {
                    parent[rootP]=rootQ;
                    rank[rootQ]++;
                }
            }
        }
    }

   

     
}