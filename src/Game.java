import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Game {
    ArrayList<Coordinates> set; // ArrayList of all generated Coordinates
    ArrayList<Edge> edges; // ArrayList of all connections/Edges

    /**
     * Constructor
     */
    public Game(){
        set = new ArrayList<Coordinates>();
        edges = new ArrayList<Edge>();
    }

    /**
     * Start game and generate random points/coordinates
     *
     * @param numbers
     */
    public void startGame(int numbers) {
        Random r = new Random();
        double x;
        double y;
        // Fill up the Coordinates ArrayList with random Coordinates
        while (set.size() < numbers){
            // Generate x and y coordinates
            x = r.nextDouble() * 1000;
            y = r.nextDouble() * 1000;

            // Initialize coordinate object with the x and y points
            Coordinates c = new Coordinates(x, y);

            // If ArrayList does not include exact same coordinates then add to ArrayList
            if (!set.contains(c)){
                addSet(c);
            }
        }
    }

    // Add to Coordinates list
    public void addSet(Coordinates c){
        set.add(c);
    }

    // Remove and return first Coordinates set
    public Coordinates removeFirstSet(){
        return set.remove(0);
    }

    // Add Edge to ArrayList
    public void addEdge(Edge e){
        edges.add(e);
    }

    // Get Coordinates ArrayList
    public ArrayList<Coordinates> getSet(){
        return set;
    }

    // Get Edges ArrayList
    public ArrayList<Edge> getEdges(){
        return edges;
    }
}
