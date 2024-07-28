//For Graph.java
import  java.util.*;
public class Graph {

    ArrayList<Node>nodes;
    int[][] matrix;

    Graph(int size) {
        nodes= new ArrayList<>();
        matrix= new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination]=1;
    }

    public boolean checkEdge(int source, int destination) {
        if(matrix[source][destination]==1) {
            return true;
        }
        else {
            return false;
        }

    }

    public void print () {
        System.out.print("  ");
        for(Node node:nodes) {
            System.out.print(node.data+" ");
        }
        System.out.println();

        for(int i=0;i< matrix.length;i++) {

            System.out.print(nodes.get(i).data+" ");
            for(int j=0;j< matrix[i].length;j++) {

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void breadthFirstSearch(int source) {
        Queue<Integer> q1= new LinkedList<>();
        boolean[] visited= new boolean[matrix.length];
        q1.offer(source);
        visited[source]=true;

        while(q1.size() != 0) {
            source = q1.poll();
            System.out.println(nodes.get(source).data + " visited.");


            for (int i = 0; i < matrix[source].length; i++) {
                if (matrix[source][i] == 1 && !visited[i]) {
                    q1.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}
