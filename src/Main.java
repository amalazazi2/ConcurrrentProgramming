import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        Game game = new Game();
        game.startGame(n, t, m);

    }
}
