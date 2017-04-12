import java.applet.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Stationary extends Applet implements Runnable {

	// Global variables to hold the x and y coordinates of the balls
	int redX, redY, blackX, blackY;
	// Global variables to hold each radius;
	int redRadius, blackRadius;
	
	public void init () {
		// Initial values for x,y coordinates
		redX = 80;
		redY = 80;
		
		blackX = 40;
		blackY = 70;
		
		// Initial values for radius
		redRadius = 20;
		blackRadius = 20;
	}

	public void paint(Graphics g) {
	this.setSize(500,500);
	// Draw the red ball at (80,80) with radius 20
	g.setColor(new Color(250, 0, 0));
	g.drawString("red ball", redX, redY);
	// g.fillOval(redX, redY, redRadius, redRadius);
	
	// Draw the black ball at (40,70) with radius 20)
	g.setColor(new Color(0, 0, 0));
	g.drawString("black ball", blackX, blackY);
	//g.fillOval(blackX, blackY, blackRadius, blackRadius);
	}
	
	public void run() {

		
	}
}
