import java.util.Random;

public class Coin {
    int faceUp = 0;

    public int showFace() {
        return (faceUp);
    }

    public void flipCoin() {
        Random rnd = new Random();
        faceUp = rnd.nextInt(2);
    }

    public String toString() {
        flipCoin();
        if (showFace() == 0) {
            return "The coin lands heads up.";
        } else {
        	return "The coin lands tails up.";
        }
    }
}