package org.example.javafxdb_sql_shellcode;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SplashController {

    // This will display the splash image on the screen.
    @FXML
    private ImageView splashImage;

    // This runs automatically when the splash screen is displayed.
    @FXML
    public void initialize() {
        // This loads the splash image from the resources folder.
        Image image = new Image(getClass().getResourceAsStream("/org/example/javafxdb_sql_shellcode/splash.png"));

        // This sets the loaded image into the ImageView to display it.
        splashImage.setImage(image);
    }
}
