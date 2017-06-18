package graph;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by 111 on 6/18/2017.
 */
public class Graph {

    private int[][] adjacentMatrix;
    private Set<Vertex> vertices = new HashSet<Vertex>();
    private Edge[] edges;
    public void init(){
        System.out.print("hello graph");
    }
    public void initializeByMatrix(String inputs){
        inputs = inputs.replace("\\s","");
        String [] splitInputs = inputs.split(",");
        initializeVertexListForMatrix(inputs);
        initializeEdgeListForMatrix(inputs);
        initializeData();
        for (int i = 0; i < splitInputs.length; i++) {
            char[] tempResult = splitInputs[i].toCharArray();

        }
    }

    private void initializeData() {
        adjacentMatrix = new int[vertices.size()][vertices.size()];
        for (int i = 0; i < adjacentMatrix.length; i++) {
            for (int j = 0; j < adjacentMatrix[i].length; j++) {
                adjacentMatrix[i][j]=0;
            }
        }
    }

    private void initializeEdgeListForMatrix(String inputs) {

    }

    private void initializeVertexListForMatrix(String inputs) {
        inputs = inputs.replaceAll("[^A-Z]","");
        char[] results = inputs.toCharArray();
        for (char c :results) {
            vertices.add(new Vertex(String.valueOf(c)));
        }
    }

    public int[][] getAdjacentMatrix() {
        return this.adjacentMatrix;
    }

}
