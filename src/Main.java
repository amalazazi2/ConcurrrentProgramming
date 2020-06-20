import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Coordinates> set = new ArrayList<Coordinates>();
        ArrayList<Edge> edges = new ArrayList<Edge>();

        Scanner in = new Scanner(System.in);
        System.out.print("Please type in count of random points: ");
        int n = in.nextInt();

        System.out.print("Please type in count of threads: ");
        int t = in.nextInt();

        while (t > n){
            System.out.print("Please type count of threads (less than points): ");
            t = in.nextInt();
        }

        System.out.print("Please type in number of seconds: ");
        int m = in.nextInt();

        Game game = new Game(set);
        game.startGame(n, t, m);

        // Replace code below with code to create t threads to run/start
//        for (int i=0; i<t; i++){
//            ConnectingEdges c1 = new ConnectingEdges(set, edges);
//            c1.start();
//        }
        System.out.println(edges.toString());
    }
}
