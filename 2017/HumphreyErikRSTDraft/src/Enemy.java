import java.util.TimerTask;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Enemy extends ImageView {
	
	int health = 3;
	Image sprite = new Image("placeholderLevel1.png");
	Animation an = new Animation();
	
	public Enemy() {
		health = 3; // Number of attacks required to kill the monster
		
	}
	
	public Enemy(int x, int y) {
		
	}
	
	public boolean hurt() {
		health--;
		
		if (health == 0) {
			return true;
		}
		else return false;
	}
	
	public Image getSprite() {return sprite;}
}