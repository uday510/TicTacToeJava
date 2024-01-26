import controllers.GameController;
import exceptions.BotCountException;
import exceptions.PlayerCountDimensionMismatchException;
import exceptions.SymbolCountException;
import models.*;
import strategies.winningStrategies.OrderOneWinningStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws BotCountException, SymbolCountException, PlayerCountDimensionMismatchException {
        GameController gameController = new GameController();

        // Todo Take input from user to get player details
        // If the user enters 3 players, then create a board of size 4

        Player player1 = new Player("player 1", 1, new Symbol('X'), PlayerType.HUMAN);
//        Player player2 = new Player("player 2", 2, new Symbol('O'), PlayerType.HUMAN);

        Player player2 = new Bot("bot", 3, new Symbol('O'), PlayerType.BOT);

        Game game =  gameController.startGame(3, Arrays.asList(player1, player2), new OrderOneWinningStrategy(3));
        System.out.println("Game is starting...");

        while (gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }

        if (gameController.checkState(game).equals(GameState.ENDED)) {
            System.out.print("Winner " + game.getWinner().getSymbol().getaChar());
            return;
        }

        if (gameController.checkState(game).equals(GameState.DRAW)) {
            System.out.print("Game Draw");
        }
    }
}