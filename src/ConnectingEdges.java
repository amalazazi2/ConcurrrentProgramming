import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConnectingEdges implements Runnable {
    // Lock for when creating Edges
    private static Lock lock = new ReentrantLock();
    static int counter = 0;

    // Game object to retrieve Coordinates and Edges ArrayLists
    Game game;

    public ConnectingEdges(Game gameObj){
        game = gameObj;
    }

    public void run(){
        lock.lock();
        try{
            if (counter == 20){
                System.out.println("Thread attempted 20 times so it was stopped");
                Thread.currentThread().interrupt();
            }
            // Combine coordinates in edges (2 Coordinates in 1 Edge)
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
                System.out.println("There is no more coordinates to connect");
            }
            counter++;
        } finally {
            lock.unlock();
        }
    }
}
