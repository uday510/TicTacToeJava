package models;
import Factories.BotPlayingStrategyFactory;
import strategies.botPlayingStrategy.BotPlayingStrategy;
import strategies.botPlayingStrategy.EasyBotWinningStrategy;

import java.util.Scanner;

public class Bot extends Player{
    BotDifficultyLevel botDifficultyLevel;

    public Bot(String name, int id, Symbol symbol, PlayerType playerType) {
        super(name, id, symbol, playerType);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("It's " + getName() + "'s turn");
        BotPlayingStrategy strategy = BotPlayingStrategyFactory.getStrategy(botDifficultyLevel);
        Move move = strategy.makeMove(board, this);
        System.out.println("Bot made a move on row: " + move.getCell().getRow() + " " + move.getCell().getCol());

        return move;
    }
}
