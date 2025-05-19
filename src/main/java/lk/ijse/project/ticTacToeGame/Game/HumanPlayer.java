package lk.ijse.project.ticTacToeGame.Game;

public class HumanPlayer extends Player {

    public HumanPlayer(BoardImpl board) {
        super(board);
    }

    @Override
    public void move(int row, int col) {
        board.updateMove(row , col , Piece.X);
    }
}
