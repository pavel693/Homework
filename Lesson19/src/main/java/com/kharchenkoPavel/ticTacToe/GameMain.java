package com.kharchenkoPavel.ticTacToe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;

public class GameMain extends Application {

    private Stage primaryStage;
    private Player firstPlayer;
    private Player secondPlayer;
    private ProfileController profileController = new ProfileController();
    private ProfileController2 profileController2 = new ProfileController2();
    private JdbcConnection jdbcConnection = new JdbcConnection();

    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        gotoProfilePage();
    }

    public void gotoProfilePage() throws IOException {
        FXMLLoader loader =
                new FXMLLoader(this.getClass().getResource("profile.fxml"));
        Parent root = loader.load();

        profileController = loader.getController();
        profileController.setApplication(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Profile 1");
        primaryStage.show();
    }

    public void gotoProfilePage2() throws IOException {
        FXMLLoader loader =
                new FXMLLoader(this.getClass().getResource("profile2.fxml"));
        Parent root = loader.load();

        profileController2 = loader.getController();
        profileController2.setApplication(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Profile 2");
        primaryStage.show();
    }

    public void showStatistic() {
        TextArea textField = new TextArea();
        textField.setPrefSize(300, 300);
        try {
            textField.setText(jdbcConnection.getStatistic(jdbcConnection.jdbcConnection()));
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        HBox hBox = new HBox(textField);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPrefSize(310, 310);

        Scene scene = new Scene(hBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Statistics");
        primaryStage.show();
    }

    public void checkDataBase() {
        User firstUser = new User(profileController.getFirstname(), Integer.parseInt(profileController.getAge()));
        User secondUser = new User(profileController2.getFirstname(), Integer.parseInt(profileController2.getAge()));
        try {
            LinkedList<User> linkedList = jdbcConnection.getPlayers(jdbcConnection.jdbcConnection());
            if (!linkedList.contains(firstUser)) {
                jdbcConnection.addPlayer(jdbcConnection.jdbcConnection(), firstUser.getName(), firstUser.getAge());
            }
            if (!linkedList.contains(secondUser)) {
                jdbcConnection.addPlayer(jdbcConnection.jdbcConnection(), secondUser.getName(), secondUser.getAge());
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public void gotoGameStart() throws IOException {
        firstPlayer = new Human(profileController.getFirstname(), Integer.parseInt(profileController.getAge()), 'X');
        secondPlayer = new Human(profileController2.getFirstname(), Integer.parseInt(profileController2.getAge()), 'O');

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
                            if (ticTacToe.getWinner() != null) {
                                textField.setText("Winner is " + ticTacToe.getWinner().toString());
                            } else {
                                textField.setText("Draw");
                                try {
                                    jdbcConnection.addResultToStatistic(jdbcConnection.jdbcConnection(), firstPlayer.getName(), firstPlayer.getAge(), secondPlayer.getName(), secondPlayer.getAge(), Result.DRAW);
                                    jdbcConnection.addResultToGameData(jdbcConnection.jdbcConnection(), firstPlayer.getName(), firstPlayer.getAge(), secondPlayer.getName(), secondPlayer.getAge(), Result.DRAW);
                                } catch (SQLException | IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            if (firstPlayer.equals(ticTacToe.getWinner())) {
                                try {
                                    jdbcConnection.addResultToStatistic(jdbcConnection.jdbcConnection(), firstPlayer.getName(), firstPlayer.getAge(), secondPlayer.getName(), secondPlayer.getAge(), Result.FIRST_PLAYER);
                                    jdbcConnection.addResultToGameData(jdbcConnection.jdbcConnection(), firstPlayer.getName(), firstPlayer.getAge(), secondPlayer.getName(), secondPlayer.getAge(), Result.FIRST_PLAYER);
                                } catch (SQLException | IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            if (secondPlayer.equals(ticTacToe.getWinner())) {
                                try {
                                    jdbcConnection.addResultToStatistic(jdbcConnection.jdbcConnection(), secondPlayer.getName(), secondPlayer.getAge(), firstPlayer.getName(), firstPlayer.getAge(), Result.SECOND_PLAYER);
                                    jdbcConnection.addResultToGameData(jdbcConnection.jdbcConnection(), firstPlayer.getName(), firstPlayer.getAge(), secondPlayer.getName(), secondPlayer.getAge(), Result.SECOND_PLAYER);
                                } catch (SQLException | IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                });
                gridPane.add(button, i, j);
            }
        }
        gridPane.addRow(3, textField);
        gridPane.setColumnSpan(textField, 3);
        Button startButton = new Button("Start");
        startButton.setPrefSize(150, 50);
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    gotoGameStart();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        Button finishButton = new Button("Statistics");
        finishButton.setPrefSize(150, 50);
        finishButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showStatistic();
            }
        });
        HBox hBox = new HBox(startButton, finishButton);
        gridPane.addRow(4, hBox);
        gridPane.setColumnSpan(hBox, 3);
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
