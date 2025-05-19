package lk.ijse.project.ticTacToeGame.Game;

public abstract class Player {

 protected BoardImpl board;

 public Player(BoardImpl board) {
  this.board = board;
 }

 public abstract void move(int row, int col);

}
