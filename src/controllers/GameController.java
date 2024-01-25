package controllers;

import exceptions.BotCountException;
import exceptions.PlayerCountDimensionMismatchException;
import exceptions.SymbolCountException;
import models.Game;
import models.GameState;
import models.Player;
import strategies.winningStrategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws BotCountException, SymbolCountException, PlayerCountDimensionMismatchException {
        // create new game here.
                return Game.getBuilder()
                            .setDimension(dimension)
                            .setWinningStrategies(winningStrategies)
                            .build();
    }

    public GameController(Game game) {

    }

    public void makeMove(Game game) {}

    public void displayBoard(Game game) {}

    public Player getWinner(Game game) { return  null; }

    public GameState checkState(Game game) { return null; }

    public void undo() {}
}
