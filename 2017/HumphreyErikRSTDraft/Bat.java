// Enemy that would act as a tutorial for jumping and attacking, as it is a flying bat

import javafx.scene.image.Image;

public class Bat extends Enemy { // Inherits Enemy class (consider making Enemy an interface instead of a class)
	public Bat() {
		health = 1;
	}
	
	public void nextFrame() {
		for (int i = 1; i < 6; i++)
			setImage(new Image("enemy/bat/" + i + ".png"));
	}
}
