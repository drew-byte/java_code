import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bowling {
    HashMap<String, Integer> players = new HashMap<>();

    public Bowling() {
    }

    public void addPlayer(String name, Integer score) {
        players.put(name, score);
    }

    public String getWinner() {
        int highest = 0;
        String winner = "";

        for (Map.Entry<String, Integer> player : players.entrySet()) {
            if (player.getValue() > highest) {
                highest = player.getValue();
                winner = player.getKey();
            }
        }

        return winner;
    }

    public static void main(String[] args) {
        Bowling bowling = new Bowling();

        Scanner sc = new Scanner(System.in);
        String[] first = sc.nextLine().split(" ");
        String[] second = sc.nextLine().split(" ");
        String[] third = sc.nextLine().split(" ");

        bowling.addPlayer(first[0], Integer.parseInt(first[1]));
        bowling.addPlayer(second[0], Integer.parseInt(second[1]));
        bowling.addPlayer(third[0], Integer.parseInt(third[1]));

        System.out.println(bowling.getWinner());
        sc.close();
    }
}
