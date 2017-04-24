import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.animation.RotateTransition;
import javafx.util.Duration;

public class JavaFXForm extends Application {

    int attempts = 5;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");

        primaryStage.show();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Create the button and position it on the bottom right
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        // Add a Text control
        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);

        Scene scene = new Scene(grid, 350, 275);
        primaryStage.setScene(scene);

        // Create a Text object that cannot be edited
        Text sceneTitle = new Text("D4rkN3t Login");
        sceneTitle.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 40));
        grid.add(sceneTitle, 0, 0, 2, 1); // Adds the sceneTitle to the layout grid
        // The title is in position (0, 0) - top left
        // The title spans 2 columns and 1 row

        // Create a Label object with text userName at column 0, row 1
        Label userName = new Label("Username:");
        grid.add(userName, 0, 1);

        // Create a TextField object that can be edited
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        // grid.setGridLinesVisible(true);

        // Registers an event handler that sets actionTarget to "Sign in button pressed" in red
        btn.setOnAction(new EventHandler < ActionEvent > () {
            @Override
            public void handle(ActionEvent e) {
                Alert alertBox = new Alert(AlertType.INFORMATION);

                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Sign in button pressed");

                if (checkPassword(userTextField.getText(), pwBox.getText())) {
                    alertBox.setTitle("Login Successful");
                    alertBox.setHeaderText("Welcome");
                    alertBox.setContentText("You are now in the system");
                    actionTarget.setFill(Color.MEDIUMSEAGREEN);
                    actionTarget.setText("Access granted");
                    alertBox.showAndWait();

                    // oh man this is great the animation is so smooth
                    RotateTransition rtTitle = new RotateTransition(Duration.millis(1000), sceneTitle);
                    rtTitle.setByAngle(360);
                    rtTitle.setCycleCount(3);
                    rtTitle.setAutoReverse(true);
                    rtTitle.play();

                } else {
                    attempts--;
                    alertBox.setTitle("Login Failed");
                    alertBox.setHeaderText("Access Denied");
                    String noun = " attempt";
                    if (attempts != 1) noun += "s"; // Make noun plural unless there is one attempt left
                    alertBox.setContentText("Invalid username/password combination (" + attempts + noun + " remain)");
                    actionTarget.setText("Invalid password");
                    alertBox.showAndWait();

                    if (attempts == 0) {
                        alertBox.setHeaderText("Too many attempts");
                        alertBox.setContentText("You've reached the maximum failed password attempts\nand have been locked out of the system. Try again later.");
                        actionTarget.setText("Access suspended");
                        alertBox.showAndWait();
                        System.exit(0); // Close the program
                    }

                    pwBox.clear(); // Reset password entry field
                }
            }
        });
    }

    public Boolean checkPassword(String user, String pass) {
        if (user.equals("MsMcDougall") && pass.equals("ICS3U") ||
            user.equals("John") && pass.equals("snappy") ||
            user.equals("CharlieM") && pass.equals("123456") ||
            user.equals("Katie") && pass.equals("katie1"))
            return true;
        else
            return false;
    }
}