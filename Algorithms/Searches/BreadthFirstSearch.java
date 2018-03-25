import java.util.*;

public class Graph {
    int[][] adjMatrix;
    int rootNode = 0;
    int NNodes;
    boolean[] visited;

    void printNode(int n) {
        System.out.println(n);
    }

    Graph(int N) {
        NNodes = N;
        adjMatrix = new int[N][N];
        visited = new boolean[N];
    }

    Graph(int[][] mat) {
        adjMatrix = new int[mat.length][mat.length];
        visited = new boolean[mat.length];

        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat.length; j++)
                adjMatrix[i][j] = mat[i][j];
    }

    public void breadthFirstSearch(){
        runBreadthFirstSearch();
    }

    // uses a queue
    // searches adjacent
    private void runBreadthFirstSearch() {
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(rootNode);
        visited[rootNode] = true; //need to keep track so we dont revisit duplicates
        printNode(rootNode);

        while (!q.isEmpty()) {
            int n = (q.peek()).intValue();
            int child = getUnvisitedChildNode(n);

            if (child != -1) {
                visited[child] = true;
                printNode(child);
                q.add(child);
            } else {
                q.remove();
            }
        }
    }

    private int getUnvisitedChildNode(int n) {

        for (int j = 0; j < NNodes; j++) {
            if (adjMatrix[n][j] > 0) {
                if (!visited[j])
                    return (j);
            }
        }
        return null;
    }
}
