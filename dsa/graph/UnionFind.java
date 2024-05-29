package dsa.graph;


public class UnionFind{

    private int[] parent;
    private int[] rank;
    private int count;

    public UnionFind(int n ){
        this.count = n;
        this.parent = new int[n];
        this.rank = new int[n];

        for(int i =0;i<n;i++){
            parent[i]=i;
            rank[i]=0;
        }
    }

    public int find(int node){
        if(parent[node]!=node){
            parent[node] = find(parent[node]);
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
                parent[rootP] = rootQ;
            } else {
                parent[rootQ]=rootP;
                rank[rootP]++;
            }
            count--;
        }
    }

    public int  getCount(){
        return count;
    }

}