package lk.ijse.project.ticTacToeGame.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import lk.ijse.project.ticTacToeGame.Game.*;
import lk.ijse.project.ticTacToeGame.Util.Util;

import java.net.URL;
import java.util.ResourceBundle;

public class BoardController implements Initializable, BoardUI {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userName.setText(Util.name.toUpperCase());
    }

    @FXML
    private Button b1;

    @FXML
    private Button eight;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Label userName;

    BoardImpl board;
    HumanPlayer human;
    AiPlayer aiPlayer;

    boolean isGameOver = false;

    public BoardController() {
        board = new BoardImpl();
        human = new HumanPlayer(board);
        aiPlayer = new AiPlayer(board);
    }

    @FXML
    void ButtonAction(ActionEvent event) {

    }

    @FXML
    void buttonAction(ActionEvent event) {

    }

    @Override
    public void updateBoard(int row, int col, boolean isHuman) {

    }

    @Override
    public void NotifyWinner(Piece winner) {

    }
}