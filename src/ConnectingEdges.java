import java.util.ArrayList;

public class ConnectingEdges extends Thread {
    ArrayList<Coordinates> set;
    ArrayList<Edge> edges;
    public ConnectingEdges(ArrayList<Coordinates> setArr, ArrayList<Edge> edgesArr){
        this.set = setArr;
        this.edges = edgesArr;
    }

    public synchronized void run(){
        if (set.size() > 1){
            Coordinates coord1 = set.remove(0);
            Coordinates coord2 = set.remove(1);
            Edge edge1 = new Edge(coord1, coord2);
            edges.add(edge1);
        } else if (set.size() == 1) {
            System.out.println("There is only 1 coordinate left which has no free partner");
        } else {
            System.out.println("There is only no more coordinates to connect");
        }
    }
}
