package xo;

import xo.model.Field;
import xo.model.Figure;
import xo.model.Game;
import xo.model.Player;
import xo.view.ConsoleView;

public class XOCli {
    public static void main(String[] args) {
        final String name1 = "Bobbi";
        final String name2 = "Ron";

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[1] = new Player(name2, Figure.O);



        final Game gameXO = new Game(players, new Field(3), "XO");

        final ConsoleView consoleView = new ConsoleView();

        consoleView.show(gameXO);
        while(consoleView.move(gameXO)) {
            consoleView.show(gameXO);
        }



    }
}
