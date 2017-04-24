import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.animation.AnimationTimer;

public class FrameBasedAnimation extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage theStage) {
        theStage.setTitle("AnimationTimer Example 2");

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

        AnimatedImage ufo = new AnimatedImage();
        Image[] ufoArray = new Image[6];
        for (int i = 0; i < 6; i++)
            ufoArray[i] = new Image("ufo_" + i + ".png");
        ufo.frames = ufoArray;
        ufo.duration = 0.100;

        AnimatedImage star = new AnimatedImage();
        Image[] starArray = new Image[6];
        for (int i = 0; i < 6; i++)
            starArray[i] = new Image("happystar" + i + ".png");
        star.frames = starArray;
        star.duration = 0.100;

        final long startNanoTime = System.nanoTime();

        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                double t = (currentNanoTime - startNanoTime) / 1000000000.0;

                double x = 232 + 128 * Math.cos(t);
                double y = 232 + 128 * Math.sin(t) * Math.tan(t) / 2;

                // Clear the canvas
                gc.clearRect(0, 0, 512, 512);

                x = x + 1;
                // Background image clear canvas
                gc.drawImage(space, 0, 0); // Draw the background
                gc.drawImage(earth, x, y); // Draw the earth in a new location each tick
                gc.drawImage(sun, 196, 196);

                gc.drawImage(star.getFrame(t), 60, 400);
                gc.drawImage(ufo.getFrame(t), 450, 25);
            }
        }.start();

        theStage.show();
    }

}