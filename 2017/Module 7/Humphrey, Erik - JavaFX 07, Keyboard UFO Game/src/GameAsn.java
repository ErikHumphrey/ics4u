import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.animation.AnimationTimer;
import javafx.scene.shape.*;

public class GameAsn extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public int gameStatus = 1;

    public void start(Stage theStage) {
        theStage.setTitle("AnimationTimer Example");

        Group root = new Group();
        Scene theScene = new Scene(root);
        theStage.setScene(theScene);

        Canvas canvas = new Canvas(512, 512);
        root.getChildren().add(canvas);
        
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // We need 3 images for this class
        // Remember to move them into the src folder!
        Image earth = new Image("earth.png");
        Image sun = new Image("sun.png");
        Image space = new Image("space.png");
        Image ufoBlue = new Image("ufo_blue.png");
        Image ufoRed = new Image("ufo_red.png");
        Image asteroid = new Image("asteroid.png");

        // Rectangle to hold place of UFO - starts near top-left
        Rectangle ufoBlueData = new Rectangle(10, 10, 20, 20);
        Rectangle ufoRedData = new Rectangle(460, 460, 20, 20);
        Circle earthData = new Circle(300, 300, 22);
        Circle sunData = new Circle(260, 260, 50);
        Circle asteroid1Data = new Circle(40, 80, 22);
        Circle asteroid2Data = new Circle(80, 80, 22);

        // Only for testing
        // root.getChildren().add(earthData);
        // root.getChildren().add(sunData);

        final long startNanoTime = System.nanoTime(); // 60 times per second

        theScene.addEventFilter(KeyEvent.ANY, keyEvent -> {
            // Move the UFO up
            if (keyEvent.getCode() == KeyCode.W) {
                ufoBlueData.setY(ufoBlueData.getY() - 10);
            }

            // Move the UFO left
            if (keyEvent.getCode() == KeyCode.A) {
                ufoBlueData.setX(ufoBlueData.getX() - 10);
            }

            // Move the UFO down
            if (keyEvent.getCode() == KeyCode.S) {
                ufoBlueData.setY(ufoBlueData.getY() + 10);
            }

            // Move the UFO right
            if (keyEvent.getCode() == KeyCode.D) {
                ufoBlueData.setX(ufoBlueData.getX() + 10);
            }

            // Move the UFO up
            if (keyEvent.getCode() == KeyCode.UP) {
                ufoRedData.setY(ufoRedData.getY() - 10);
            }

            // Move the UFO left
            if (keyEvent.getCode() == KeyCode.LEFT) {
                ufoRedData.setX(ufoRedData.getX() - 10);
            }

            // Move the UFO down
            if (keyEvent.getCode() == KeyCode.DOWN) {
                ufoRedData.setY(ufoRedData.getY() + 10);
            }

            // Move the UFO right
            if (keyEvent.getCode() == KeyCode.RIGHT) {
                ufoRedData.setX(ufoRedData.getX() + 10);
            }
        });

        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                double t = (currentNanoTime - startNanoTime) / 500000000.0;

                double earthX = 232 + 128 * Math.cos(t) * 0.7;
                double earthY = 232 + 128 * Math.sin(t) * 0.8;

                double asteroid1X = 232 + 200 * Math.cos(t) * -1;
                double asteroid2X = 232 + 200 * Math.cos(t);

                double asteroid1Y = 232 + 200 * Math.sin(t) * -1;
                double asteroid2Y = 232 + 200 * Math.sin(t);

                // Clear the canvas
                gc.clearRect(0, 0, 512, 512);

                earthX++;
                asteroid1X++;
                asteroid2Y++;

                // Background image clear canvas
                gc.drawImage(space, 0, 0); // Draw the background
                // Draw the earth in a new location each tick
                gc.drawImage(sun, 196, 196);


                if (gameStatus == 1) {
                    gc.drawImage(earth, earthX, earthY);
                } else if (gameStatus == 2 || gameStatus == 3) {
                    gc.drawImage(asteroid, asteroid1X, asteroid1Y);
                    gc.drawImage(asteroid, asteroid2X, asteroid2Y);
                }

                // Move the data behind the object
                earthData.setCenterX(earthX + 24);
                earthData.setCenterY(earthY + 24);
                asteroid1Data.setCenterX(asteroid1X + 24);
                asteroid1Data.setCenterY(asteroid1Y + 24);
                asteroid2Data.setCenterX(asteroid2X + 24);
                asteroid2Data.setCenterY(asteroid2Y + 24);

                // Add the UFOs
                if (gameStatus != 3 || gameStatus != 5)
                	gc.drawImage(ufoBlue, ufoBlueData.getX(), ufoBlueData.getY());
                if (gameStatus != 2 || gameStatus != 5)
                	gc.drawImage(ufoRed, ufoRedData.getX(), ufoRedData.getY());

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");

                final String fail = "Mission failed!";

                if (gameStatus == 1) {
                    // Check if UFO is colliding with the Earth
                    if (ufoBlueData.intersects(earthData.getBoundsInLocal())) {
                        this.stop(); // Stop the timer
                        gameStatus = 2;
                        alert.setHeaderText("Abduction!");
                        alert.setContentText("You captured a human and destroyed Earth, now escape the solar system!");
                        // With more time, the player who did not reach Earth first would be able to shoot down asteroids with the mouse to help the other player
                        Image cursor = new Image("reticleRed.png");
                		root.setCursor(new ImageCursor(cursor, cursor.getWidth() / 2, cursor.getHeight() / 2));
                        alert.showAndWait();
                        this.start();
                    }
                    if (ufoRedData.intersects(earthData.getBoundsInLocal())) {
                        this.stop();
                        gameStatus = 3;
                        alert.setHeaderText("Abduction!");
                        alert.setContentText("You captured a human and destroyed Earth, now escape the solar system!");
                        Image cursor = new Image("reticleBlue.png");
                		root.setCursor(new ImageCursor(cursor, cursor.getWidth() / 2, cursor.getHeight() / 2));
                        alert.showAndWait();
                        this.start();
                    }
                }

                if (gameStatus == 2) {
                    // Check if UFO is colliding with an asteroid
                    if (ufoBlueData.intersects(asteroid1Data.getBoundsInLocal()) || ufoRedData.intersects(asteroid2Data.getBoundsInLocal())) {
                        gameStatus = 4;
                        alert.setHeaderText(fail);
                        alert.setContentText("Lost contact with blue vessel\nCrew presumed dead");
                        alert.showAndWait();
                    	System.exit(0);
                    }

                    if (ufoRedData.intersects(asteroid1Data.getBoundsInLocal()) || ufoRedData.intersects(asteroid2Data.getBoundsInLocal())) {
                        gameStatus = 4;
                        alert.setHeaderText(fail);
                        alert.setContentText("Lost contact with red vessel\nCrew presumed dead");
                        alert.showAndWait();
                    	System.exit(0);
                    }
                    
                    
                    // Check if UFO has escaped the bounds of the stage
                    if (!ufoBlueData.intersects(canvas.getBoundsInLocal()) && gameStatus != 5)
                    {
                        gameStatus = 5;
                    	alert.setHeaderText("Victory!");
                        alert.setContentText("You escaped!");
                    	alert.showAndWait();
                    	System.exit(0);
                    }
                    // This stopped working for the red vessel and I don't know why
                    if (!ufoRedData.intersects(canvas.getBoundsInLocal()) && gameStatus != 5)
                    {
                    	gameStatus = 5;
                    	alert.setHeaderText("Victory!");
                        alert.setContentText("You escaped!");
                    	alert.showAndWait();
                    	System.exit(0);
                    }
                }

                // Check if UFO is colliding with the Sun
                if (ufoBlueData.intersects(sunData.getBoundsInLocal())) {
                    this.stop();
                    alert.setHeaderText(fail);
                    alert.setContentText("Lost contact with blue vessel\nCrew presumed dead");
                    alert.show();
                }
                if (ufoRedData.intersects(sunData.getBoundsInLocal())) {
                    this.stop();
                    alert.setHeaderText(fail);
                    alert.setContentText("Lost contact with red vessel\nCrew presumed dead");
                    alert.show();
                }
                // Check if UFO is colliding with another UFO
                if (ufoBlueData.intersects(ufoRedData.getBoundsInLocal())) {
                    this.stop();
                    alert.setHeaderText(fail);
                    alert.setContentText("Lost contact with space vessels\nCrew presumed dead");
                    alert.show();
                }
            }
        }.start();

        theStage.show();
    }

}