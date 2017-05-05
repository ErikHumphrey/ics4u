import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

import java.util.Random;

public class TargetPractice extends Application {

	int points = 0;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage st) {
		st.setTitle("Empty Form");
		
		Group root = new Group();
		Scene sc = new Scene(root);
		st.setScene(sc);;
		
		Canvas cv = new Canvas(500,500);
		
		root.getChildren().add(cv);
		
		// Import the bullseye image
		GraphicsContext gc = cv.getGraphicsContext2D();
		Image bullseye = new Image("apple.png");
		
		// Draw the blank background
		gc.setFill(new Color(0.439215686, 0.670588235, 0.980392157, 1.0));
		gc.fillRect(0, 0, 512, 512);
		
		gc.setFill(Color.ALICEBLUE);
		String pointsText = "Points: " + points;
		
		Button btn = new Button("Play");
		btn.setLayoutX(370);
		btn.setLayoutY(20);
		root.getChildren().add(btn);
		
		Circle targetData = new Circle(100, 100, 32);
		
		btn.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent arg0) {
				gc.fillText(pointsText, 360, 36);
				gc.strokeText(pointsText, 360, 36);
				// Draw the bullseye
				gc.drawImage(bullseye,
						     targetData.getCenterX() - targetData.getRadius(),
						     targetData.getCenterY() - targetData.getRadius());
				root.getChildren().remove(btn);
				
				Image neatCursor = new Image("testCursor.png");
				root.setCursor(new ImageCursor(neatCursor, neatCursor.getWidth() / 2, neatCursor.getHeight() /2));
			}});
		
		st.show();
		
		sc.setOnMouseClicked(
			new EventHandler<MouseEvent>()
			{
				public void handle(MouseEvent e)
				{
					System.out.println("Mouse coordinates: " + e.getX() + ", " + e.getY());

					if (targetData.contains(e.getX(), e.getY())) { // Hit
						points++;
						
						// Move targetData Circle to a new random spot
						double x = 50 + 400 * Math.random();
						double y = 50 + 400 * Math.random();
						targetData.setCenterX(x);
						targetData.setCenterY(y);
						
						Random rand = new Random();
						
						// Clear the canvas
						gc.setFill(new Color ((double)(rand.nextInt(100)) / 100, (double)(rand.nextInt(100)) / 100, (double)(rand.nextInt(100)) / 100, 1.0));
						gc.fillRect(0, 0, 512, 512);
						
						// Draw the bullseye
						gc.drawImage(bullseye,
								     targetData.getCenterX() - targetData.getRadius(),
								     targetData.getCenterY() - targetData.getRadius());
						
						// Format and display points total (same as before)
						gc.setFill(Color.ALICEBLUE);
						String pointsText = "Points: " + points;
						gc.fillText(pointsText, 360, 36);
						gc.strokeText(pointsText, 360, 36);
						System.out.println("Player hit target.");
					}
					else { // Miss
						points = 0;
						String pointsText = "Points: " + points;
						gc.fillText(pointsText, 360, 36);
						gc.strokeText(pointsText, 360, 36);
						System.out.println("Player missed target.");
					}
				}
			}
			);
	}
}