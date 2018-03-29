// runs o ( E + V) ~ very fast

public class DepthFirstSearch {
	private boolean[] isMarked;    
    private int count; 
  
    // compute the verticies in a graph related to selected node
    public DepthFirstSearch(Graph G, int s) {
        isMarked = new boolean[G.V()];
        isNodeInGraph(s);
        dfs(G, s);
    }

    /* depth first search from v (selected node)
    Visit (recursively) all the vertices that are 
    adjacent to it and that have not yet been marked.*/
    private void dfs(Graph G, int v) {
        count++;
        isMarked[v] = true;
        for (int w : G.adj(v)) {
            if (!isMarked[w]) {
                dfs(G, w);
            }
        }
    }
    
    // mark node as visited.
    public boolean isMarked(int v) {
        isNodeInGraph(v);
        return isMarked[v];
    }

    // returns the sum of verticies connected to 
    public int count() {
        return count;
    }

    // error occurs if the node doesnt exist in path
    private void isNodeInGraph(int v) {
        int V = isMarked.length;
        
        if (v < 0 || v >= V)
            System.out.println("Error. Not a valid vertex");
    }
}