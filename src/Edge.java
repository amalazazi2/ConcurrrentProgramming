public class Edge {
    Coordinates firstPoint; // First Coordinates Object
    Coordinates secondPoint; // Second Coordinates Object

    /**
     * Constructor
     *
     * @param first
     * @param second
     */
    public Edge(Coordinates first, Coordinates second){
        firstPoint = first;
        secondPoint = second;
    }

    @Override
    public String toString() {
        return "firstPoint: " + firstPoint.toString() + "; secondPoint: " + secondPoint.toString();
    }
}
