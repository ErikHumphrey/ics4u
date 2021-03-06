import javafx.scene.image.Image;

public class AnimatedImage {
    // Assumes animation loops
    // Each image display for equal time
    public Image[] frames;
    public double duration;

    public Image getFrame(double time) {
        int index = (int)((time % (frames.length * duration)) / duration);
        return frames[index];
    }
}