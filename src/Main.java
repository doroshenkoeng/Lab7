/**
 * <b>Laboratory work 7</b> <br>
 * <p>OOP paradigms </p> <br>
 * <b>Goal</b> <br>
 * <p>Learn OOP features in Java.</p>
 * <b>Task</b> <br>
 * <p>Rewrite your C++ laboratory work 1 in Java.</p>
 *
 * @author Sergey Doroshenko
 * @version 1
 */
public class Main {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
        CardGame game = new CardGame(player1, player2);
        game.startGame();
        int result = game.getResult();
        if (result == 1) {
            System.out.println("First player won!");

        } else if (result == 2) {
            System.out.println("Second player won!");

        } else {
            System.out.println("Nobody won");
        }
    }
}

