import javafx.application.Application;
import javafx.stage.Stage;
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
        Image ufo = new Image("ufo_0.png");
        
        // Rectangle to hold place of UFO - starts near top-left
        Rectangle ufoData = new Rectangle(10, 10, 25, 30);
        Circle earthData = new Circle(10, 10, 22);
        Circle sunData = new Circle(260, 260, 50);
        
        // Only for testing
        // root.getChildren().add(earthData);
        // root.getChildren().add(sunData);

        final long startNanoTime = System.nanoTime(); // 60 times per second

        theScene.addEventFilter(KeyEvent.ANY, keyEvent -> {
        	
        	// Move the UFO right
        	if (keyEvent.getCode() == KeyCode.RIGHT) {
        		ufoData.setX(ufoData.getX() + 10);
        	}
        	
        	// Move the UFO up
        	if (keyEvent.getCode() == KeyCode.UP) {
        		ufoData.setY(ufoData.getY() - 10);
        	}
        	
        	// Move the UFO left
        	if (keyEvent.getCode() == KeyCode.LEFT) {
        		ufoData.setX(ufoData.getX() - 10);
        	}
        	
        	// Move the UFO down
        	if (keyEvent.getCode() == KeyCode.DOWN) {
        		ufoData.setY(ufoData.getY() + 10);
        	}
        });
        
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
                
                // Move the earthData behind earth
                earthData.setCenterX(x + 24);
                earthData.setCenterY(y + 24);

                // Add the UFO
                gc.drawImage(ufo, ufoData.getX(), ufoData.getY());
                
                // Check if UFO is colliding with the Earth
                if (ufoData.intersects(earthData.getBoundsInLocal())) {
                	System.out.println("COLLISION");
                	this.stop();
                	
                	Alert alert = new Alert(AlertType.INFORMATION);
                	alert.setTitle("Information Dialog");
                	alert.setHeaderText("Collision!");
                	alert.setContentText("Aliens have invaded earth");
                	alert.show();
                }
                
                // Check if UFO is colliding with the Sun
                if (ufoData.intersects(sunData.getBoundsInLocal())) {
                	System.out.println("COLLISION");
                	this.stop();
                	
                	Alert alert = new Alert(AlertType.INFORMATION);
                	alert.setTitle("Information Dialog");
                	alert.setHeaderText("Mission failed!");
                	alert.setContentText("Lost contact with space vessel\nCrew presumed dead");
                	alert.show();
                }
            }
        }.start();

        theStage.show();
    }

}