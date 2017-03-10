/* Author: Erik Humphrey
 * Date started: February 9th, 2017
 * Date completed: February 13th, 2017
 * Project title: Module 2 Exercise - Intro to Java Applets
 * Description: Applet that uses 2D graphics drawing to render a landscape
 */

import java.applet.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class MySceneApplet extends Applet
{

public void init () {}

	public void paint (Graphics g)
    {
        setBackground(new Color(137, 207, 240)); // Background colour of applet

        this.setSize(500, 400);
        // Order of draw methods is important for layering of drawings e.g. sun behind horizon
		drawSun(g);
		drawHorizon(g);
        drawHouse(g);
		drawRoad(g);
        drawPylon(g);
		drawTree(g);
        drawLadder(g);
        try {
            drawFlower(g);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

    public static void drawSun(Graphics g)
    {
        g.setColor(Color.yellow);
        // Make a circle by drawing an oval with equal width and height
        g.fillOval(200, 155, 100, 100);
    }

    public static void drawHorizon (Graphics g)
    {
        // Draw grass to fill in the sky background
        g.setColor(new Color(18, 127, 16));
        g.fillRect (0, 200, 500, 400);
    }

    public static void drawHouse (Graphics g)
	{
        // Draw brick-coloured frame of house
        g.setColor(new Color(110, 31, 27));
        Polygon house;
        house = new Polygon();
        house.addPoint(100, 175);
        house.addPoint( 65, 150);
        house.addPoint( 30, 175);
        house.addPoint( 30, 250);
        house.addPoint(100, 250);
        g.fillPolygon(house.xpoints, house.ypoints, 5);

        // Draw two orange windows and a door
        g.setColor(Color.orange);
        g.fill3DRect(37, 185, 25, 25, false);
        g.fill3DRect(70, 185, 25, 25, false);
        g.fill3DRect(60, 220, 15, 30, true);

        // Draw doorknob
        g.setColor(Color.black);
        g.fillOval(70, 232, 3, 3);

        // Label house
        g.drawString("Home", 50, 265);
	}
	
	public static void drawRoad (Graphics g)
	{
        // Draw paved surface
		g.setColor(new Color(32, 32, 32));
		Polygon road;
		road = new Polygon();
		road.addPoint(200, 200);
		road.addPoint(300, 200);
		road.addPoint(400, 400);
		road.addPoint(100, 400);
		g.fillPolygon(road);

        // Draw stripe down middle
		g.setColor(Color.white);
        Polygon stripes;
        stripes = new Polygon();
        stripes.addPoint(248, 200);
        stripes.addPoint(252, 200);
        stripes.addPoint(265, 400);
        stripes.addPoint(235, 400);
        g.fillPolygon(stripes);

	}

    public void drawPylon (Graphics g)
    {
        // Draw a traffic cone
        g.setColor(new Color(255, 125, 24));
        Polygon cone = new Polygon();

        // base
        cone.addPoint(342, 300);
        cone.addPoint(265, 300);
        cone.addPoint(270, 340);
        cone.addPoint(360, 340);
        g.fillPolygon(cone);

        // pointy part
        g.fillArc(250, 120, 140, 200, 240, 40);
        g.fillPolygon(cone);

        // outline
        g.setColor(Color.black);
        int[] outlineX = {287, 290, 300, 323, 328, 329};
        int[] outlineY = {300, 310, 317, 317, 310, 300};
        g.drawPolyline(outlineX, outlineY, outlineX.length);
    }

    public static void drawTree (Graphics g)
    {
        Color brown = new Color(106, 65, 50); // Name a new colour to use it repeatedly
        // Draw curved trunk of "palm tree"
        g.setColor(brown);
        g.fillArc(350, 120, 100, 300, 0, 55);

        // Draw leaves
        g.setColor(new Color(0x00BB14));
        // !!! Extremely perplexing geometry, don't change (negative y values?)
        //          X,   Y,   W,   H, Ang, Arc
        g.fillArc(420, 120, 140, 140, 130, 25);
        g.fillArc(300, 120, 140, 140,  25, 25);
        g.fillArc(360, -40, 140, 200, 260, 25);
        g.fillArc(300,  35, 140, 140, -40, 25);
        g.fillArc(420,  25, 140, 140, 205, 25);

        // Draw coconuts
        g.setColor(brown);
        g.fillOval(405, 150, 20, 20);
        g.fillOval(410, 130, 20, 20);
        g.fillOval(430, 140, 20, 20);
    }

    public void drawLadder (Graphics g)
    {
        // Draw a ladder with simple lines
        g.setColor(Color.black);

        // Sidepieces
        g.drawLine(403, 273, 423, 200);
        g.drawLine(423, 273, 443, 200);

        // Bars
        g.drawLine(421, 207, 441, 207);
        g.drawLine(418, 220, 438, 220);
        g.drawLine(414, 237, 434, 237);
        g.drawLine(409, 254, 429, 254);
        g.drawLine(405, 267, 425, 267);
    }

    public void drawFlower (Graphics g) throws IOException
    {
        /* Draw an image of a flower from the Internet.
        * ANECDOTE: I could have drawn five flowers using shapes in the time it took me to learn how to draw an image without JavaFX
        * At this point I've forgotten how to set the size of the thing. */
        URL flowerClipart = new URL("http://i.imgur.com/ALHz9UA.png");
        try { BufferedImage flower = ImageIO.read(flowerClipart);
            g.drawImage(flower, 440, 320, new Color(0, 0, 0, 0), this); // The fourth argument in the colour makes the background transparent
        } catch (IOException e) {} // Prevent crash if program attempts to get malformed URL for image
    }
}