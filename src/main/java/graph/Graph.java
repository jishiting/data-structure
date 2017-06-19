package graph;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by 111 on 6/18/2017.
 */
public class Graph {

    private int[][] adjacentMatrix;
    private List<Vertex> vertices ;

    public Graph(int graphSize) {
        adjacentMatrix=new int[graphSize][graphSize];
        vertices = new ArrayList<Vertex>(graphSize);
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
}
