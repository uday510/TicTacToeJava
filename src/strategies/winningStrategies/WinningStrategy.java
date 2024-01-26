package strategies.winningStrategies;

import models.Board;
import models.Move;

public interface WinningStrategy {

    public  boolean checkWinner(Move move, Board board);
    public void handleUndo(Move move, Board board);

}
