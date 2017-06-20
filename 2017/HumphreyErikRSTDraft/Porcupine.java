// This enemy would act as a tutorial for ducking and attacking.
// The porcupine is short enough that standing attacks would miss.
// The porcupine would deal damage if bumped into, but it doesn't pursue the player.

public class Porcupine extends Enemy {
	/** constructor
	 * pre: none
	 * post: Porcupine object created. Its health is intialized as 1. */
	public Porcupine() {
		health = 1;
	}
	
	/** Returns the name of the class represented by the object as a String
	 * pre: none
	 * post: Class of the object has been returned as a string. */
	public String getName() {
		return getClass().getName();
	}
}
