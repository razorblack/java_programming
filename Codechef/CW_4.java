import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class CW_4 {

    static int V; // Total vertices
    static LinkedList<Integer>[] adjList; //Adjacency list
    static ArrayList<ArrayList<Integer>> components = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String s = scanner.nextLine();
        int numberEdges = scanner.nextInt();

        V = (s.length() - 1) / 2;
        adjList = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList();
        }


        for (int i = 0; i < numberEdges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            addEdge(u, v);
        }

        // Logic performing DFS
        DFS();

        // Output
        System.out.println(numberOfConnectedComponents());
    }

    // Adding edge into graph
    public static void addEdge(int u, int v)
    {
        adjList[u].add(v);
        adjList[v].add(u);
    }

    static int numberOfConnectedComponents() {
        return components.size();
    }

    static void DFS()
    {
        boolean[] isVisited = new boolean[V];
        for (int i = 0; i < V; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            if (!isVisited[i]) {
                DFSUtil(i, isVisited, list);
                components.add(list);
            }
        }
    }

    static void DFSUtil(int v, boolean[] isVisited, ArrayList<Integer> list) {
        isVisited[v] = true;
        list.add(v);
        System.out.print(v + " ");

        for (int n : adjList[v]) {
            if (!isVisited[n])
                DFSUtil(n, isVisited, list);
        }
    }
}
