module lk.ijse.project.ticTacToeGame {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.project.ticTacToeGame to javafx.fxml;
    exports lk.ijse.project.ticTacToeGame;
}