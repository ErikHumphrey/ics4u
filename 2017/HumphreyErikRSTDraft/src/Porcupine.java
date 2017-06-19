import javafx.scene.image.Image;

public class Porcupine extends Enemy {
	public Porcupine() {
		health = 1;
	}
	
	public String nextFrame() {
		return getClass().getName();
	}
}
