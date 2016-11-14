package com.kharchenkoPavel.ticTacToe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProfileController {

    @FXML
    private TextField firstname;

    @FXML
    private TextField age;

    private GameMain application;

    public void setApplication(GameMain application) {

        this.application = application;
    }

    public void okAction(ActionEvent actionEvent) throws IOException {
        application.gotoProfilePage2();
    }

    public String getFirstname() {
        return firstname.getText();
    }

    public String getAge() {
        return age.getText();
    }
}
