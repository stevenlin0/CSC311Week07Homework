package org.example.javafxdb_sql_shellcode;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class App extends Application {

    private static Stage primaryStage;

    // Starts the app and shows the splash screen first.
    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        showSplashScreen();
    }

    // This method shows the splash screen and then switches to the main app after a delay.
    private void showSplashScreen() throws IOException {
        Scene splashScene = new Scene(loadFXML("splash").load(), 600, 400); // This loads the splash screen layout.
        primaryStage.setScene(splashScene);  // This sets the splash screen as the current view.
        primaryStage.show();  // This displays the splash screen.

        // This is to wait for 3 seconds before switching to the main app.
        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(event -> {
            try {
                showMainApp();  // This is to switch to the main app after the delay.
            } catch (IOException e) {
                e.printStackTrace();  // This is to print the error if loading the main app fails.
            }
        });
        delay.play();  // This is to start the delay timer.
    }

    // This method shows the main application screen.
    private void showMainApp() throws IOException {
        Scene mainScene = new Scene(loadFXML("primary").load(), 600, 400); // This loads the main app layout.
        primaryStage.setScene(mainScene);  // This sets the main app view as the current view.
        primaryStage.setTitle("My Application");  // This sets the window title.
        primaryStage.show();  // This displays the main app.
    }

    // This method loads an FXML file based on its name.
    public static FXMLLoader loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/org/example/javafxdb_sql_shellcode/" + fxml + ".fxml"));
        return fxmlLoader;  // This is to return the loader for the requested FXML file.
    }

    // This method switches the current view to a new FXML layout.
    public static void setRoot(String fxml) throws IOException {
        primaryStage.getScene().setRoot(loadFXML(fxml).load());  // This is to set a new layout as the current scene.
    }

    // This is the main method that launches the JavaFX application.
    public static void main(String[] args) {
        launch();  // Start the JavaFX application.
    }
}