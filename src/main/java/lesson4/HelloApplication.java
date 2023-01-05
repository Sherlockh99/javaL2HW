package lesson4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * 1. Create a window for the client part of the chat:
 * a large text field for displaying correspondence in the center of the window.
 * A one-line text field for entering messages and a button for sending messages on the bottom panel.
 * The message should be sent either by pressing a button on the form,
 * or by pressing the Enter button.
 * When "sending" the message is thrown from the lower field to the central one.
 */

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}