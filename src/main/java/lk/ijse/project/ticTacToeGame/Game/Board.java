package lk.ijse.project.ticTacToeGame.Game;

public interface Board {
    void initializeBoard();

    boolean isLegalMove(int row, int col);

    void updateMove(int row, int col, Piece piece);

    void printBoard();
}


