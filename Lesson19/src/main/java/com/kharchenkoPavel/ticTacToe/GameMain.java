package com.kharchenkoPavel.ticTacToe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GameMain extends Application {

    private Stage primaryStage;
    private Player firstPlayer;
    private Player secondPlayer;

    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        gotoLoginPage();
    }

    public void gotoLoginPage() throws IOException {
        FXMLLoader loader =
                new FXMLLoader(this.getClass().getResource("login.fxml"));
        Parent root = loader.load();

        LoginController controller = loader.getController();
        controller.setApplication(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();
    }

    public void gotoProfilePage() throws IOException {
        FXMLLoader loader =
                new FXMLLoader(this.getClass().getResource("profile.fxml"));
        Parent root = loader.load();

        ProfileController controller = loader.getController();
        controller.setApplication(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Profile");
        primaryStage.show();
    }

    public void gotoGameStart() throws IOException {
        firstPlayer = new Human("Alex", 23, 'X');
        secondPlayer = new Human("Igor", 20, 'O');
        Board board = new Board(firstPlayer, secondPlayer);
        BoardGame ticTacToe = new TicTacToe(board, firstPlayer, secondPlayer);
        GridPane gridPane = new GridPane();
        TextField textField = new TextField();
        textField.setPrefSize(300, 50);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button("");
                button.setPrefSize(100, 100);
                button.setId(i + "" + j);
                int a = i;
                int b = j;
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (!ticTacToe.gameFinished()) {
                            Alert alert = new Alert(Alert.AlertType.ERROR, "This position is not free", ButtonType.OK);
                            if (button.getText().equals("X") || button.getText().equals("O")) alert.show();
                            if (button.getText().equals("")) {
                                button.setText("" + ticTacToe.makeMove(b, a));
                            }
                        }
                        if (ticTacToe.gameFinished()) {
                            textField.setText(ticTacToe.getWinner());
                        }
                    }
                });
                gridPane.add(button, i, j);
            }
        }
        gridPane.addRow(3, textField);
        gridPane.setColumnSpan(textField, 3);
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
