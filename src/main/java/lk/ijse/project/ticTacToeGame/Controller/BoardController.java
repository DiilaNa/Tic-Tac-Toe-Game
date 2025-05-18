package lk.ijse.project.ticTacToeGame.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import lk.ijse.project.ticTacToeGame.Util.Util;

import java.net.URL;
import java.util.ResourceBundle;

public class BoardController implements Initializable {
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

    @FXML
    void ButtonAction(ActionEvent event) {

    }

    @FXML
    void buttonAction(ActionEvent event) {

    }

}