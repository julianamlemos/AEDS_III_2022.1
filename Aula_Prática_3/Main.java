import java.io.IOException;

class Main {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        final Graph g1 = new Graph(10);
        g1.addEdgeUnoriented(7, 5, 1);
        g1.addEdgeUnoriented(7, 1, 1);
        g1.addEdgeUnoriented(7, 2, 1);
        g1.addEdgeUnoriented(1, 0, 1);
        g1.addEdgeUnoriented(1, 4, 1);
        g1.addEdgeUnoriented(2, 3, 1);
        g1.addEdgeUnoriented(5, 6, 1);
        g1.addEdgeUnoriented(6, 8, 1);
        System.out.println(g1.bfs(7));
        System.out.println(g1.connected());
        final Graph g2 = new Graph("grafo1.txt");
        System.out.println(g2);

    }
}
