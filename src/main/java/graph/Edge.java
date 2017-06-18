package graph;

/**
 * Created by 111 on 6/18/2017.
 */
public class Edge {
    private Vertex endVertex;
    private int weight;

    public Edge(Vertex endVertex, int weight) {
        this.endVertex = endVertex;
        this.weight = weight;
    }

    public Vertex getEndVertex() {
        return endVertex;
    }

    public void setEndVertex(Vertex endVertex) {
        this.endVertex = endVertex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Edge)) return false;

        Edge edge = (Edge) o;

        if (getWeight() != edge.getWeight()) return false;
        return getEndVertex() != null ? getEndVertex().equals(edge.getEndVertex()) : edge.getEndVertex() == null;
    }

    @Override
    public int hashCode() {
        int result = getEndVertex() != null ? getEndVertex().hashCode() : 0;
        result = 31 * result + getWeight();
        return result;
    }
}
