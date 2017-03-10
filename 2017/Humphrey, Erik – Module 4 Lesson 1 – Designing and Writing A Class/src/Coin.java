import java.util.Random;

public class Coin {
int faceUp = 0;

public int showFace() {
	return(faceUp);
}

public void flipCoin() {
Random rnd = new Random();
faceUp = rnd.nextInt(2);
}
}
