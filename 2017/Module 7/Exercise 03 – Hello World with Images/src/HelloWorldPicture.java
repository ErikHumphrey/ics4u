import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;

public class HelloWorldPicture extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage mainStage) {
		mainStage.setTitle("Canvas Example");
		
		Group root = new Group();
		Scene mainScene = new Scene(root);
		mainStage.setScene(mainScene);
		
		Canvas canvas = new Canvas(400,400);
		root.getChildren().add(canvas);
		
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		gc.setFill(Color.RED);
		gc.setStroke(Color.BLACK);
		gc.setLineWidth(2);
		gc.setFont(Font.font("Times New Roman", FontWeight.BOLD, 48));
		gc.fillText("Hello, World!",  60, 50);
		gc.strokeText("Hello, World!", 60, 50);
		
		gc.drawImage(new Image("earth.png"), 180, 100);
		
		mainStage.show();
	}
}
