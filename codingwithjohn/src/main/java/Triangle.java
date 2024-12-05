@Important
public class Triangle extends Shape{
    private Vertex vertexA, vertexB, vertexC;

    public Triangle(String type) {
        super(type);
    }

    public void setVertices(Vertex[] vertices){
        
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
