import javafx.animation.AnimationTimer;
import javafx.animation.RotateTransition;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class Game {

	private Group objects = new Group();
	public Scene gameplay = new Scene(objects);

	private final Image bg = new Image("phBlankFlat2tester2.png"); // Rename image, add looping background
	private final Image fg = new Image("phground.png");
	private final Image heroInit = new Image("placeholderHero3.png");
	private ImageView background = new ImageView(bg);
	private ImageView foreground = new ImageView(fg);
	private ImageView hero = new ImageView(heroInit);
	private boolean onGround = true;
    private boolean secondJumpReady = true;
    
    // VERY temporary
	Image crouch = new Image("placeholderHero3Crouch.png");
	Image spinpic = new Image("placeholderHeroSPIN3.png");

	
	public float velocityY;
	private final float gravity = 0.5f;
	
	public Game() {

		objects.getChildren().add(background);
		objects.getChildren().add(foreground);
		
		VBox verticalAlignment = new VBox(10.0); // Create vertical box with spacing 10.0
		verticalAlignment.setPadding(new Insets(180, 427, 50, 370));
		verticalAlignment.getChildren().add(hero); // Add player character to VBox to centre in stage
		

		background.setLayoutX(1500); background.setLayoutY(-760);
		
		objects.getChildren().add(verticalAlignment);
		
		foreground.setX(0); foreground.setY(200);
		
		new AnimationTimer() {
			public void handle(long now) { // Consider float

				
				if (velocityY != 0 || background.getY() > 0) {
					velocityY -= gravity;
				}
				
				background.setY(background.getY() + velocityY);
				background.setX(background.getX() - 10);
				
				// System.out.println(iv3.getX() + ", " + iv3.getY());
				
				/* Move the ground vertically according to velocity
				 * Illusion that the player character is jumping up or falling back down
				 */
				foreground.setY(foreground.getY() + velocityY);
				
				// System.out.println(lvl11.getX());
				
				if (background.getY() < 0) {
					velocityY = 0;
					// Slipshod way of "returning player character back to ground level" so that the ground doesn't go too high up
					background.setY(0);
					foreground.setY(280);
					onGround = true;
					hero.setImage(heroInit); // Set player animation state back to being on the ground
					secondJumpReady = true;
				}
				
			}
		}.start();
		
		gameplay.addEventFilter(KeyEvent.ANY, keyEvent -> {
			if (keyEvent.getCode() == KeyCode.D) {
				background.setLayoutX(background.getLayoutX() - 10);
			}
		});
		
		
		
		gameplay.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
				case W:
					if (onGround) { 
						velocityY = 12;
						onGround = false;
					}
					else if (secondJumpReady) {
						 // Smoothly rotate the player character about its centre over 0.8 seconds
						RotateTransition spin = new RotateTransition(Duration.millis(0.8*1000), hero);
				        spin.setByAngle(360);
				        spin.setCycleCount(1);
						spin.play();
						velocityY = 12;
						hero.setImage(spinpic); // Set player animation state to spinning to empower the double jump ability
						secondJumpReady = false;
					}
					break;
				case S:
					hero.setImage(crouch); // Set player animation state to crouched
					hero.setY(hero.getLayoutY() - 2000);
					break;
				default:
					break;
				}
			}
		});
		
		gameplay.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
				case W: break;
				case S:
					hero.setImage(heroInit); // Reset player animation state to standing
					hero.setY(hero.getLayoutY() + 2000);
					break;
				default:
					break;
				}
			}
		});
		
		gameplay.addEventFilter(KeyEvent.ANY, keyEvent -> {
			if (keyEvent.getCode() == KeyCode.D) {
				background.setLayoutX(background.getLayoutX() - 10);
			}
		});
	}
}
