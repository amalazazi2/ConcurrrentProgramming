import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Game {
    ArrayList<Coordinates> set;

    public Game(ArrayList<Coordinates> arr){
        this.set = arr;
    }

    public void startGame(int numbers, int threads, int seconds) {
        Random r = new Random();
        double x;
        double y;
        while (set.size() < numbers){
            x = r.nextDouble() * 1000;
            y = r.nextDouble() * 1000;
            Coordinates c = new Coordinates(x, y);
            if (!set.contains(c)){
                set.add(c);
            }
        }
    }
}
