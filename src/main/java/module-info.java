module lk.ijse.project.ticTacToeGame {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.project.ticTacToeGame.Controller to javafx.fxml;
    exports lk.ijse.project.ticTacToeGame.Controller;
}