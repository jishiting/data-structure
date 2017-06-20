package graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by 111 on 6/18/2017.
 */
public class Graph {

    private int[][] adjacentMatrix;
    private List<Vertex> vertices ;
    private int[] isVisited ;
    public Graph(int graphSize) {
        adjacentMatrix=new int[graphSize][graphSize];
        vertices = new ArrayList<Vertex>(graphSize);
        isVisited=new int[graphSize];
        initializeData();
    }


    private void initializeData() {
        for (int i = 0; i < adjacentMatrix.length; i++) {
            for (int j = 0; j < adjacentMatrix[i].length; j++) {
                adjacentMatrix[i][j]=0;
            }
        }
    }

    public int[][] getAdjacentMatrix() {
        return this.adjacentMatrix;
    }

    public void insertVertex(String name, int index) {
        vertices.add(new Vertex(name,index));
    }

    public void insertEdge(int startIndex, int endIndex, int weight) {
            adjacentMatrix[startIndex][endIndex]=weight;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void DFS(int index){
        isVisited[index]=1;
        System.out.println(vertices.get(index).toString());
        for (int i = 0; i < vertices.size(); i++) {
            if(adjacentMatrix[index][i]!=0 && isVisited[i]==0){
                DFS(i);
            }
        }

    }
    public void DeepTraGraph(){
        for (int i = 0; i < vertices.size(); i++) {
            isVisited[i]=0;
        }
        for (int i = 0; i < vertices.size(); i++) {
            if(isVisited[i]==0){
                DFS(i);
            }
        }
    }
    public void BFS(int index){
        Queue<Integer> queue = new LinkedList<Integer>();
        isVisited[index]=1;
        for (int i = 0; i < vertices.size(); i++) {
            queue.add(index);
            if(!queue.isEmpty()){
                int temp = queue.poll();

            }
        }
    }
    public void BreathFirstTraGraph(){
        for (int i = 0; i < vertices.size(); i++) {
            isVisited[i]=0;
        }
        for (int i = 0; i < vertices.size(); i++) {
            BFS(i);
        }
    }
    public static void main (String[] args){
        GraphBuilder gb = new GraphBuilder();
        String input = "AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7";
        input = input.replaceAll("\\s*","");
        String vertexName = "ABCDE";
        gb.buildGraph(vertexName,input);
        Graph graph = gb.getGraph();
        graph.DeepTraGraph();
    }
}
