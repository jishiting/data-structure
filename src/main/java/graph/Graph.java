package graph;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by 111 on 6/18/2017.
 */
public class Graph {

    private int[][] adjacentMatrix;
    private Set<Vertex> vertices = new HashSet<Vertex>();
    public void initializeByMatrix(String inputs,String vertexName){
        inputs = inputs.replaceAll("\\s*","");
        initializeVertexListForMatrix(vertexName);
        initializeData();
        initializeEdgeListForMatrix(inputs);

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
        String[] result = inputs.split(",");
        int startIndex=-1;
        int endIndex=-1;

        for (int i = 0; i < result.length; i++) {
            char[] letters =result[i].toCharArray();
            Iterator<Vertex> iter =vertices.iterator();
            while (iter.hasNext()){
                Vertex v = iter.next();
                if(-1==startIndex){
                    startIndex=v.getIndexByName(String.valueOf(letters[0]));
                }
                if(-1==endIndex){
                    endIndex=v.getIndexByName(String.valueOf(letters[1]));
                }

            }
            if(startIndex>=0 && endIndex>=0){
                adjacentMatrix[startIndex][endIndex]=Integer.valueOf(String.valueOf(letters[2]));
                startIndex=-1;
                endIndex=-1;
            }
        }
    }

    public void initializeVertexListForMatrix(String inputs) {
        char[] results = inputs.toCharArray();
        for (int i = 0; i < results.length; i++) {
            vertices.add(new Vertex(String.valueOf(results[i]),i));
        }
    }

    public int[][] getAdjacentMatrix() {
        return this.adjacentMatrix;
    }

}
