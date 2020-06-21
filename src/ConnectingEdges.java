import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConnectingEdges implements Runnable {
    // Lock for when creating Edges
    private static Lock lock = new ReentrantLock();

    // Game object to retrieve Coordinates and Edges ArrayLists
    Game game;

    public ConnectingEdges(Game gameObj){
        game = gameObj;
    }

    public void run(){
        lock.lock();
        try{
            // Combine coordinates in edges (2 Coordinates in 1 Edge)
            for (int i=0; i<=game.getSet().size(); i++){
                if (game.getSet().size() > 1){
                    Coordinates coord1 = game.removeFirstSet();
                    Coordinates coord2 = game.removeFirstSet();
                    Edge edge1 = new Edge(coord1, coord2);
                    game.addEdge(edge1);
                    System.out.println(Thread.currentThread().getName()+": Added " + coord1.toString() +" and " + coord2);
                } else if (game.getSet().size() == 1) {
                    // If 1 coordinate left with no partner then display below message
                    System.out.println("There is only 1 coordinate left which has no free partner");
                } else {
                    // If 0 coordinate left to create edges then display below message
                    System.out.println("There is only no more coordinates to connect");
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
