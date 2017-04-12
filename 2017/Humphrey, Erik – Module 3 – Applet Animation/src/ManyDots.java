import java.applet.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ManyDots extends Applet implements Runnable {

	// Global variables to hold the x and y coordinates of the balls
	int redX, redY, blackX, blackY;
	// Global variables to hold each radius;
	int redRadius, blackRadius;
	// Global variables to hold the velocity of the two dots
	int redVelX, redVelY, blackVelX, blackVelY;
	
	public void init () {
		// Initial values for x,y coordinates
		redX = 80;
		redY = 80;
		
		blackX = 40;
		blackY = 70;
		
		// Initial values for radius
		redRadius = 20;
		blackRadius = 20;
		
		// Initial values for velocity
		redVelX = 2;
		redVelY = 1;
		blackVelX = -1;
		blackVelY = -2;
		
		// Necessary for animation - Start the timer
		Thread t =  new Thread(this);
		t.start();
	}

	public void paint(Graphics g) {
	this.setSize(500,500);
	
	// Draw the red ball at (80,80) with radius 20
	g.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
	g.setColor(new Color(250, 0, 0));
	g.drawString("a red ball", redX, redY);
	
	// Draw the black ball at (40,70) with radius 20)
	g.setFont(new Font("Euclid", Font.BOLD, 20));
	g.setColor(new Color(0, 0, 0));
	g.drawString("a black ball", blackX, blackY);
	
	System.out.println("Red (" + redX + ", " + redY + ")");
	System.out.println("Black (" + blackX + ", " + blackY + ")");
	}
	
	public void run() {
		while(true) // always
		{
			try
			{
				// Move the dots
				redX += redVelX;
				redY += redVelY;
				blackX += blackVelX;
				blackY += blackVelY;
				Thread.sleep(7); // milliseconds
				repaint();
				
				// Did they hit a wall?
				// If so, change their direction
				// Or, as Scratch blocks say, "if on edge, bounce"
				
				if ((redX >= 500) || (redX <= 0)) {
					redVelX *= -1;
				}
				
				if ((redY >= 500) || (redY <= 0)) {
					redVelY *= -1;
				}
				
				if ((blackX >= 500) || (blackX <= 0)) {
					blackVelX *= -1;
				}
				
				if ((blackY >= 500) || (blackY <= 0)) {
					blackVelY *= -1;
				}
			}
			catch (Exception e){}
		}
		
	}
}
