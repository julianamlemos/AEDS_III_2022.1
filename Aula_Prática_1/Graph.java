public class Graph {
    private int countNodes;
    private int countEdges;
    private int[][] adjMatrix;

    public Graph(int countNodes) {
        this.countNodes = countNodes;
        this.adjMatrix = new int[countNodes][countNodes];
    }

    public int getCountNodes() {
        return countNodes;
    }

    public int getCountEdges() {
        return countEdges;
    }

    public int[][] getAdjMatrix() {
        return adjMatrix;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        String str = "";
        for (int i = 0; i < this.adjMatrix.length; i++) {
            for (int j = 0; j < this.adjMatrix[i].length; j++) {
                str += this.adjMatrix[i][j] + "\t";
            }
            str += "\n";
        }
        return str;
    }

    /**
     * @param source
     * @param sink
     * @param weight
     */
    public void addEdge(int source, int sink, int weight) {
        if (source < 0 || source > this.countNodes - 1
                || sink < 0 || sink > this.countNodes - 1
                || weight <= 0) {
            // System.err.println("Invalid values for source, sink or weight");
            System.err.println("Invalid edge:" + source + sink + weight);
            return;
        }
        this.adjMatrix[source][sink] = weight;
        this.countEdges++;
    }

    /**
     * @param node
     * @return
     */
    public int degree(int node) {
        if (node < 0 || node > this.countNodes - 1)
            System.err.println("Invalid node: " + node);
        int degree = 0;
        for (int j = 0; j < this.adjMatrix[node].length; j++) {
            if (this.adjMatrix[node][j] != 0) {
                degree++;
            }
        }
        return degree;
    }
}
