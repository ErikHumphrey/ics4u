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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
	
	@Override
	public void start(Stage mainWindow) {
		mainWindow.setTitle("Hometown Hero");
		mainWindow.setWidth(854);
		mainWindow.setHeight(480);
        mainWindow.centerOnScreen();
		mainWindow.setResizable(false);

		mainWindow.show();
		Button btnStart = new Button("Start");
		Button btnStart2 = new Button("Options");
		Button btnStart3 = new Button("Quit");
		
		Group buttons = new Group();
		Scene menu = new Scene(buttons);
		
		// GitHub github = new GitHub();
		
		
		buttons.getChildren().add(btnStart);

		BorderPane bp = new BorderPane();
		
		VBox vb = new VBox(); // Create box of vertically aligned elements
		vb.setPadding(new Insets(70, 427, 50, 50));
		vb.setSpacing(10);
		
		HBox hb = new HBox(); // Create box of horizontally aligned elements
		hb.setPadding(new Insets(20));
		hb.setSpacing(10);
		//bp.setCenter(vb);
		

        Text title = new Text("Placeholder");
        title.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 15));
        vb.getChildren().add(title);
		vb.getChildren().add(btnStart);
		vb.getChildren().add(btnStart2);
		vb.getChildren().add(btnStart3);
        
        // GridPane layout = new GridPane();
        //vb.getChildren().add(btnStart);
        
        // 

		
		Image placeholder = new Image("placeholderHero3.png");
		ImageView iv1 = new ImageView(placeholder);
		//iv1.setImage(placeholder);
		
		Image ground = new Image("phground.png");
		Image platform = new Image("phplatform.png");
		

		ImageView iv2 = new ImageView(platform);

		ImageView iv3 = new ImageView(ground);
		
		
        FlowPane fp = new FlowPane();
        buttons.getChildren().add(vb);
		
		mainWindow.setScene(menu);
		
		Group chars = new Group();
		Scene main = new Scene(chars);
		
		VBox vb2 = new VBox(); // Create box of vertically aligned elements
		vb2.setPadding(new Insets(180, 427, 50, 370));
		vb2.setSpacing(10);
		vb2.getChildren().add(iv1);

		System.out.println(iv3.getX());
		System.out.println(iv3.getLayoutX());
		iv3.setX(0);
		iv3.setY(280);


		Image lvl1 = new Image("phBlankFlat2tester2.png");
		Image crouch = new Image("placeholderHero3Crouch.png");
		Image spinpic = new Image("placeholderHeroSPIN3.png");

		
		ImageView lvl11 = new ImageView(lvl1);
		chars.getChildren().add(lvl11);

		chars.getChildren().add(iv3);
		chars.getChildren().add(vb2);		
		
		btnStart.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				mainWindow.setScene(main);
			}
		});

		lvl11.setLayoutY(-760);
		lvl11.setLayoutX(1500);
		
		main.addEventFilter(KeyEvent.ANY, keyEvent -> {
			if (keyEvent.getCode() == KeyCode.D) {
				lvl11.setLayoutX(lvl11.getLayoutX() - 10);
			}
		});
		
		
        final long startNanoTime = System.nanoTime();
        
		new AnimationTimer() {
			public void handle(long time) { // Consider float
				double t = (time - startNanoTime) / 1000000000.0;
				
				
				if (velocityY != 0 || lvl11.getY() > 0) {
					velocityY -= gravity;
				}
				
				lvl11.setY(lvl11.getY() + velocityY);
				lvl11.setX(lvl11.getX() - 30);
				// System.out.println(lvl11.getX());
				
				if (lvl11.getY() < 0) {
					velocityY = 0;
					lvl11.setY(0);
					onGround = true;
					iv1.setImage(placeholder);
					secondJumpReady = true;
				}
			}
		}.start();
		
		RotateTransition spin = new RotateTransition(Duration.millis(1000), iv1);
        spin.setByAngle(360);
        spin.setDuration(Duration.millis(800));
        spin.setCycleCount(1);
		
		main.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
				case W:
					if (onGround) { 
						velocityY = 12;
						onGround = false;
					}
					else if (secondJumpReady) {
						spin.play();
						velocityY = 12;
						iv1.setImage(spinpic);
						secondJumpReady = false;
					}
					break;
				case S:
					iv1.setImage(crouch);
					iv1.setY(iv1.getLayoutY() - 2000);
					break;
				}
			}
		});
		
		main.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
				case W: break;
				case S:
					iv1.setImage(placeholder);
					iv1.setY(iv1.getLayoutY() + 2000);
					break;
				}
			}
		});
	}

}
