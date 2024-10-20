package org.example.javafxdb_sql_shellcode;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class RegistrationController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField emailField;

    @FXML
    private void handleRegister() {

    }

    @FXML
    private void goToLogin() throws IOException {
        // This loads the login page
        Parent root = FXMLLoader.load(getClass().getResource("/org/example/javafxdb_sql_shellcode/login.fxml"));
        Stage stage = (Stage) usernameField.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}