import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Enemy extends ImageView {
	
	int health = 3;
	Image sprite = new Image("placeholderLevel1.png");
	
	/** constructor
	 * pre: none
	 * post: An Enemy object is created. Its health is initialized as 3. */
	public Enemy() {
		health = 3; // Number of attacks required to kill the monster
	}
	
	/** constructor
	 * pre: none
	 * post: An Enemy object is created. Its health and coordinate positions are initalized. */
	public Enemy(int hp, int x, int y) {
		health = hp;
		setX(x);
		setY(y);
	}
	
	/** Remove health when taking damage, remove object if health is 0
	 * pre: none
	 * post: Health has been reduced by 1 */
	public boolean hurt() {
		health--;
		
		if (health == 0) {
			return true;
		}
		else return false;
	}
	
	/** Gets the sprite image that represents the object
	 * pre: none
	 * post: An image has been returned. */
	public Image getSprite() {return sprite;}
}
