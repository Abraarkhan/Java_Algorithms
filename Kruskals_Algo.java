import java.util.Arrays;
import java.util.Scanner;
 
public class kruskals {
 
    public static class edge implements Comparable<edge> {
        int u;
        int v;
        int weight;
 
        public edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
 
        public String toString() {
            return this.u + " " + this.v + " " + this.weight;
        }
 
        // sorting of the edges will be done on the basis of weights.
        @Override
        public int compareTo(edge o) {
            return this.weight - o.weight;
        }
    }
 
    public static void main(String[] args) {
 
        Scanner scn = new Scanner(System.in);
        int nodes = scn.nextInt();
        int[][] graph = new int[nodes + 1][nodes + 1];
        int numEdges = scn.nextInt();
        edge[] edges = new edge[numEdges];
        for (int edge = 0; edge < numEdges; edge++) {
            int u = scn.nextInt(), v = scn.nextInt(), w = scn.nextInt();
            /*
             * as the graph will be bidirectional then 'v' will be
             *  neighbour of 'u' and vice-versa
             */
            graph[u][v] = graph[v][u] = w;
 
            /* add the edge in the edges array which will be 
                         * sorted later */
            edges[edge] = new edge(u, v, w);
        }
 
        kruskalsAlgo(nodes, numEdges, edges, graph);
 
    }
 
    public static void kruskalsAlgo(int numVertices, int numEdges, edge[] edges, int[][] graph) {
 
        /* for storing minimum spanning tree formed */
        int[][] mst = new int[graph.length][graph.length];
        /* sort the edges on the basis of their weights 
         * in an increasing order */
        Arrays.sort(edges);
 
        /* we use parents & size array for creating disjoint sets */
        int[] parents = new int[numVertices + 1];
        int[] size = new int[numVertices + 1];
        for (int vertex = 1; vertex < graph.length; vertex++) {
            /*
             * initially all the vertices are a set in 
             * themselves, hence, they are the parent of their
             * own set, and the size of their set is also one
             */
            parents[vertex] = vertex;
            size[vertex] = 1;
        }
 
        int edgeCounter = 0;
        int edgedTaken = 1;
        /* for connecting all the vertices we need to have 
         * atleast vertices-1 edges */
        while (edgedTaken <= numVertices - 1) {
            edge e = edges[edgeCounter];
            edgeCounter++;
            /*
             * we will include only those edges which does 
             * not create any cycle in the constructed minimum 
             * spanning tree
             */
            if (isCyclic(e.u, e.v, parents))
                continue;
            /*
             * for combining the edge into the MST, we first
             * need to find the parents of both the vertices, 
             * and then the put combine the smaller set with 
             * larger set
             */
            union(findParent(e.u, parents), findParent(e.v, parents), parents, size);
            mst[e.u][e.v] = e.weight;
            edgedTaken++;
        }
 
        /* tree display */
        for (int u = 1; u < mst.length; u++) {
            for (int v = 0; v < mst.length; v++) {
                if (mst[u][v] != 0) {
                    System.out.println(u + " " + v + " " + mst[u][v]);
                }
            }
        }
 
    }
 
    public static boolean isCyclic(int u, int v, int[] parents) {
        /*
         * if the parents of both the vertices of the 
         * edge are same, this means they are connected 
         * to a common vertex, and hence if we put this
         *  edge in the MST then it will create a cycle.
         */
        return findParent(u, parents) == findParent(v, parents);
    }
 
    public static void union(int u, int v, int[] parents, int[] size) {
        /*find the parent of both the vertices in the current
         * edge, and merge the larger disjoint set with smaller
         * disjoint set*/
         u = findParent(u, parents);
         v = findParent(v, parents);
        if (size[u] > size[v]) {
            parents[v] = u;
            size[u] += size[v];
        } else {
            parents[u] = v;
            size[v] += size[u];
        }
    }
 
    public static int findParent(int u, int[] parents) {
        /*if the parent of any vertex is the vertex itself,
         * then this is the parent of the the vertex of the
         *  current edge being processed*/
        if (parents[u] == u) {
            return u;
        } else {
            /*path compression*/
            parents[u] = findParent(parents[u], parents);
            return parents[u];
        }
    }
 
}
