package graph;

/**
 * Created by 111 on 6/19/2017.
 */
public class GraphBuilder {
    int INVALID_NUMBER = -1;
    Graph graph ;
    public void buildGraph(String vertexNamesInputs,String pathNamesInputs){
        char[] vertexNames = vertexNamesInputs.toCharArray();
        graph=new Graph(vertexNames.length);

        initializeVertexList(vertexNames);

        initializeEdgeListForMatrix(pathNamesInputs);

    }

    private void initializeVertexList(char[] results) {
        for (int i = 0; i < results.length; i++) {
            graph.insertVertex(String.valueOf(results[i]),i);
        }
    }

    private void initializeEdgeListForMatrix(String inputs) {
        String[] result = inputs.split(",");
        int startIndex=INVALID_NUMBER;
        int endIndex=INVALID_NUMBER;

        for (int i = 0; i < result.length; i++) {
            char[] letters =result[i].toCharArray();
            for (Vertex v :graph.getVertices()) {
                startIndex = getGetIndex(startIndex, letters[0], v);
                endIndex = getGetIndex(endIndex,letters[1],v);
            }
            if(isEffectiveIndex(startIndex, endIndex)){
                graph.insertEdge(startIndex,endIndex,Integer.valueOf(String.valueOf(letters[2])));
                startIndex=INVALID_NUMBER;
                endIndex=INVALID_NUMBER;
            }
        }
    }

    private boolean isEffectiveIndex(int startIndex, int endIndex) {
        return startIndex>=0 && endIndex>=0;
    }

    private int getGetIndex(int index, char letter, Vertex v) {
        if(INVALID_NUMBER==index){
          return v.getIndexByName(String.valueOf(letter));
        }
        return index;
    }

    public Graph getGraph() {
        return graph;
    }
}
