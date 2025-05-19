package lk.ijse.project.ticTacToeGame.Game;

public interface BoardUI {
    void updateBoard(int row, int col, boolean isHuman);
    void NotifyWinner(Piece winner);
}
