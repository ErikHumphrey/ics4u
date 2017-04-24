import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.animation.AnimationTimer;

public class TheGameLoop extends Application {
    public static void main(String[] args) {
        launch(args);
    }


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

        final long startNanoTime = System.nanoTime();

        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                double t = (currentNanoTime - startNanoTime) / 1000000000.0;

                double x = 232 + 128 * Math.cos(t); // Move the x coordinate on a cosine path
                double y = 232 + 128 * Math.sin(t); // Move the y coordinate on a sine path

                // Clear the canvas
                gc.clearRect(0, 0, 512, 512);

                x = x + 1;
                // Background image clear canvas
                gc.drawImage(space, 0, 0); // Draw the background
                gc.drawImage(earth, x, y); // Draw the earth in a new location each tick
                gc.drawImage(sun, 196, 196);


            }
        }.start();


        theStage.show();
    }

}