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
}
