import java.util.Timer;
import java.util.TimerTask;

import javafx.animation.AnimationTimer;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Main extends Application {
	public static void main(String[] args)  {
		launch(args);
	}
	
	float velocityY;
	float gravity = 0.5f;
    boolean onGround = true;
    boolean secondJumpReady = true;
    boolean gameStarted = true;
	Game g;
	Timer timer = new Timer();
	
	@Override
	public void start(Stage mainWindow) {
		mainWindow.setTitle("Hometown Hero");
		mainWindow.setWidth(854);
		mainWindow.setHeight(480);
        mainWindow.centerOnScreen();
		mainWindow.setResizable(false);
		
		Porcupine porc = new Porcupine();
		System.out.println(porc.nextFrame());
		
		mainWindow.show();
		Button btnStart = new Button("Continue Game");
		Button btnStart2 = new Button("Options");
		Button btnStart3 = new Button("Quit");
		
		Group buttons = new Group();
		Scene menu = new Scene(buttons);
		
		Group saveFiles = new Group();
		Scene saveSelect = new Scene(saveFiles);
		
		Button btnSelect = new Button("Select");
		saveFiles.getChildren().add(btnSelect);
		btnSelect.setLayoutX(660);
		btnSelect.setLayoutY(370);
		btnSelect.setFont(Font.font("Constantia", FontWeight.BOLD, 25));
		System.out.println(btnSelect.getLayoutX() + btnSelect.getLayoutY());
		
		Button btnDelete = new Button("Delete");
		saveFiles.getChildren().add(btnDelete);
		btnDelete.setLayoutX(64);
		btnDelete.setLayoutY(370);
		btnDelete.setFont(Font.font("Constantia", FontWeight.LIGHT, 25));
		System.out.println(btnDelete.getLayoutX() + btnDelete.getLayoutY());
		
		Rectangle save1 = new Rectangle(65, 25, 700, 100);
		save1.setFill(Color.rgb(239, 239, 239));
		save1.setStroke(Color.rgb(165, 165, 165));
		saveFiles.getChildren().add(save1);
		
		Rectangle save2 = new Rectangle(65, 140, 700, 100);
		save2.setFill(Color.rgb(239, 239, 239));
		save2.setStroke(Color.rgb(165, 165, 165));
		saveFiles.getChildren().add(save2);
		
		Rectangle save3 = new Rectangle(65, 255, 700, 100);
		save3.setFill(Color.rgb(239, 239, 239));
		save3.setStroke(Color.rgb(165, 165, 165));
		saveFiles.getChildren().add(save3);

        Text saveName = new Text("Save1");
        saveName.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 15));
		saveFiles.getChildren().add(saveName);
		
		// lol make this a class
		
		save1.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				save1.setFill(Color.rgb(239, 231, 172));
				save1.setStroke(Color.rgb(239, 205, 2));

				save2.setFill(Color.rgb(239, 239, 239));
				save2.setStroke(Color.rgb(165, 165, 165));

				save3.setFill(Color.rgb(239, 239, 239));
				save3.setStroke(Color.rgb(165, 165, 165));
				mainWindow.setScene(saveSelect);
			}
		});
		
		save2.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				save2.setFill(Color.rgb(239, 231, 172));
				save2.setStroke(Color.rgb(239, 205, 2));

				save1.setFill(Color.rgb(239, 239, 239));
				save1.setStroke(Color.rgb(165, 165, 165));

				save3.setFill(Color.rgb(239, 239, 239));
				save3.setStroke(Color.rgb(165, 165, 165));
				mainWindow.setScene(saveSelect);
			}
		});
		
		save3.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				save3.setFill(Color.rgb(239, 231, 172));
				save3.setStroke(Color.rgb(239, 205, 2));
				
				save1.setFill(Color.rgb(239, 239, 239));
				save1.setStroke(Color.rgb(165, 165, 165));

				save2.setFill(Color.rgb(239, 239, 239));
				save2.setStroke(Color.rgb(165, 165, 165));
				mainWindow.setScene(saveSelect);
			}
		});
		
		// Custom cursors are super neat, add them
		
		buttons.getChildren().add(btnStart);
		
		VBox vb = new VBox(); // Create box of vertically aligned elements
		vb.setPadding(new Insets(70, 427, 50, 50));
		vb.setSpacing(10);

        Text title = new Text("Hometown Hero");
        title.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 15));
        vb.getChildren().add(title);
		vb.getChildren().add(btnStart);
		vb.getChildren().add(btnStart2);
		vb.getChildren().add(btnStart3);
        
        buttons.getChildren().add(vb);
		
		mainWindow.setScene(menu);
		
		btnSelect.setOnMouseClicked(new EventHandler<MouseEvent>() {
		@Override public void handle(MouseEvent e) {
			g = new Game();
			mainWindow.setScene(g.gameplay);
		}
		});
		
		btnStart.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				mainWindow.setScene(saveSelect);
			}
		});

		
		timer.scheduleAtFixedRate(new TimerTask() {
		@Override
		public void run() {
			System.out.println("Every second this message appears.");
		}
		}, 0, 1000);
		
		Shape circle = new Circle(400, 210, 200);
		Shape rect = new Rectangle(0, 0, 854, 480);
		Shape region = Shape.subtract(rect, circle);
		region.setFill(Color.BLACK);
		/// saveFiles.getChildren().add(region);
	}

	// When the Application is closed, the stop() method is triggered
	@Override
	public void stop() {
		System.out.println("Application window is closing.");
		timer.cancel(); // Stop the timer so it doesn't keep running after program closed
		/// TODO: Put saving operation here
	}
}