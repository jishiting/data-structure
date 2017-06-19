package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 111 on 6/18/2017.
 */
public class Vertex {
    private final String vertexName;
    private int index=0;
    private List<Edge> edges = new ArrayList<Edge>();

    public Vertex(String vertexName,int index) {
        this.vertexName = vertexName;
        this.index = index;
    }
    public void addEdge(Edge edge){
        edges.add(edge);
    }

    public int getIndexByName(String vertexName){
        if(this.vertexName.equals(vertexName)){
            return this.index;
        }
        return -1;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertex)) return false;

        Vertex vertex = (Vertex) o;

        if (vertexName != null ? !vertexName.equals(vertex.vertexName) : vertex.vertexName != null) return false;
        return edges != null ? edges.equals(vertex.edges) : vertex.edges == null;
    }

    @Override
    public int hashCode() {
        int result = vertexName != null ? vertexName.hashCode() : 0;
        result = 31 * result + (edges != null ? edges.hashCode() : 0);
        return result;
    }
}
