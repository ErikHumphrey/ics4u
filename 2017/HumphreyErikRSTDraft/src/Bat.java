import javafx.scene.image.Image;

public class Bat extends Enemy {
	public Bat() {
		health = 1;
	}
	
	public void nextFrame() {
		for (int i = 1; i < 6; i++)
			setImage(new Image("enemy/bat/" + i + ".png"));
	}
}
