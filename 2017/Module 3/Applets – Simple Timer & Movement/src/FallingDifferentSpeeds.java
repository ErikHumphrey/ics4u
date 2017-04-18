import java.applet.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class FallingDifferentSpeeds extends Applet implements Runnable {

	// Global variables to hold the x and y coordinates of the balls
	int redX, redY, blackX, blackY, blueY, blueX, greenX, greenY, orangeX, orangeY, pinkY, pinkX, pinkVelX, pinkVelY, orangeVelX, orangeVelY;
	// Global variables to hold each radius;
	int redRadius, blackRadius, blueRadius, greenRadius, pinkRadius, orangeRadius;
	// Global variables to hold the velocity of the two dots
	int redVelX, redVelY, blackVelX, blackVelY, greenVelX, greenVelY, blueVelX, blueVelY;
	
	public void init () {
		
		// Initial values for x,y coordinates
		redX = 20;
		redY = 80;
		
		blackX = 80;
		blackY = 80;
		
		orangeX = 140;
		orangeY = 80;
		
		blueX = 200;
		blueY = 80;
		
		greenX = 260;
		greenY = 80;
		
		pinkX = 320;
		pinkY = 80;
		
		
		// Initial values for velocity
		redVelY = 4;
		blackVelY = 7;
		blueVelY = 2;
		orangeVelY = 3;
		pinkVelY = 5;
		greenVelY = 4;
		
		// Necessary for animation - Start the timer
		Thread t =  new Thread(this);
		t.start();
	}

	public void paint(Graphics g) {
	this.setSize(500,500);
	

	
	g.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
	g.setColor(new Color(250, 0, 0));
	g.drawString("j", redX, redY);
	
	g.setFont(new Font("Arial", Font.BOLD, 80));
	g.setColor(new Color(0, 0, 0));
	g.drawString("A", blackX, blackY);
	
	g.setFont(new Font("Impact", Font.TRUETYPE_FONT, 80));
	g.setColor(new Color(40, 200, 90));
	g.drawString("v", orangeX, orangeY);
	
	g.setFont(new Font("Lithos Pro", Font.PLAIN, 80));
	g.setColor(new Color(255, 102, 0));
	g.drawString("A", blueX, blueY);
	
	g.setFont(new Font("Cooper Std", Font.PLAIN, 80));
	g.setColor(new Color(255, 192, 203));
	g.drawString("?", greenX, greenY);
	
	g.setFont(new Font("Cooper Std", Font.PLAIN, 80));
	g.setColor(new Color(0, 0, 255));
	g.drawString("!", pinkX, pinkY);
	
	}
	
	public void run() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true) // always
		{
			try
			{
				redY += redVelY;
				blackY += blackVelY;
				greenY += greenVelY;
				orangeY += orangeVelY;
				pinkY += pinkVelY;
				blueY += blueVelY;
				Thread.sleep(7); // milliseconds
				repaint();
				
				// Did they hit a wall?
				// If so, change their direction
				// Or, as Scratch blocks say, "if on edge, bounce"

				if ((redY >= 500) || (redY <= 0)) {
					redVelY *= -1;
				}
				if ((blackY >= 500) || (blackY <= 0)) {
					blackVelY *= -1;
				}
				if ((greenY >= 500) || (greenY <= 0)) {
					greenVelY *= -1;
				}
				if ((orangeY >= 500) || (orangeY <= 0)) {
					orangeVelY *= -1;
				}
				if ((pinkY >= 500) || (pinkY <= 0)) {
					pinkVelY *= -1;
				}
				if ((blueY >= 500) || (blueY <= 0)) {
					blueVelY *= -1;
				}
				
				
			}
			catch (Exception e){}
		}
		
	}
}
