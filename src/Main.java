public class Main {
    public static void main(String[] args) {

        Player player1=new Player();
        Player player2=new Player();
        CardGame game=new CardGame(player1, player2);
        game.startGame();
        int result=game.getResult();
        if (result==1) {
            System.out.println("First player won!");
        }
        else if (result==2) {
            System.out.println("Second player won!");
        }
        else {
            System.out.println("Nobody won");
        }

    }
}

