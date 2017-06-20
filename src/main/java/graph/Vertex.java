package graph;


/**
 * Created by 111 on 6/18/2017.
 */
public class Vertex {
    private final String vertexName;
    private int index=0;

    public Vertex(String vertexName,int index) {
        this.vertexName = vertexName;
        this.index = index;
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

        if (index != vertex.index) return false;
        return vertexName != null ? vertexName.equals(vertex.vertexName) : vertex.vertexName == null;
    }

    @Override
    public int hashCode() {
        int result = vertexName != null ? vertexName.hashCode() : 0;
        result = 31 * result + index;
        return result;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "vertexName='" + vertexName + '\'' +
                ", index=" + index +
                '}';
    }
}
