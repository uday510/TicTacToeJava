package strategies.botPlayingStrategy;

import models.*;

public class EasyBotWinningStrategy implements BotPlayingStrategy {


    @Override
    public Move makeMove(Board board, Bot bot) {

        for (int i = 0; i <board.getSize(); ++i) {
            for (int j = 0; j < board.getSize(); ++j) {
                Cell cell = board.getBoard().get(i).get(j);
                cell.setCellState(cell.getCellState());

                if (cell.getCellState() == CellState.EMPTY) {
                    cell.setCellState(CellState.FILLED);
                    cell.setPlayer(bot);
                    Move move = new Move();
                    move.setPlayer(bot);
                    move.setCell(cell);

                    return move;
                }
            }
        }
        return null;
    }
}
