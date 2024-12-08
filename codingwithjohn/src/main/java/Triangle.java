@Important
public class Triangle extends Shape{
    private Vertex vertexA, vertexB, vertexC;

    public Triangle(String type) {
        super(type);
    }

    public void setVertices(Vertex ... vertices){
        if (vertices.length != 3)
            throw new IllegalArgumentException("A triangle has three vertices");

        this.vertexA = vertices[0];
        this.vertexB = vertices[1];
        this.vertexC = vertices[2];
    }

    public Vertex getVertexA() {
        return vertexA;
    }

    public void setVertexA(Vertex vertexA) {
        this.vertexA = vertexA;
    }

    public Vertex getVertexB() {
        return vertexB;
    }

    public void setVertexB(Vertex vertexB) {
        this.vertexB = vertexB;
    }

    public Vertex getVertexC() {
        return vertexC;
    }

    public void setVertexC(Vertex vertexC) {
        this.vertexC = vertexC;
    }
}
