/* Author: Erik Humphrey
 * Date started: February 9th, 2017
 * Project title: Module 2 Exercise - Intro to Java Applets
 * Description: Applet that uses 2D graphics to render perspective landscape(s) taught in middle school art class
 */

import java.applet.*;
import java.awt.*;
@SuppressWarnings("serial")
public class MySceneApplet extends Applet
{
	 
public void init ()
	{

	}

	public void paint (Graphics g)
	{
		Color sky = new Color(137, 207, 240);
		drawSun(g);
		drawHorizon(g);
		drawRoad(g);
		drawWater(g);
		drawTree(g);

		setBackground(sky);
		this.setSize(500, 400);
		// this.setLocationRelativeTo(null);
		// this.setSize(800,500);

	}
	
	public static void drawWater (Graphics g)
	{
		//Color turquoise = new Color(64, 224, 208);
		//g.setColor(turquoise);
		//Polygon wave1;
		//wave1 = new Polygon();
		//wave1.addPoint(0, 20);
		//wave1.addPoint(30, 260);
		//wave1.addPoint(40, 275);
		//wave1.addPoint(50, 279);
		//wave1.addPoint(60, 300);
		////g.fillPolygon (wave1.xpoints, wave1.ypoints, 5);
	}
	
	public static void drawHouse (Graphics g)
	{
//			
//			Color turquoise = new Color(64, 224, 208);
//			// draw solid base of house
//			g.setColor(turquoise);
//			g.fillRect(300,200,100,100);
//			
//			// add roof
//			Polygon roof;
//			roof = new Polygon();// define a polygon object
//	
//			// add points in (x,y) combinations
//			roof.addPoint(300,200);
//			roof.addPoint(350,150);
//			roof.addPoint(400,200);
//			g.fillPolygon (roof.xpoints, roof.ypoints,3);
//			
//			g.setColor(Color.blue);
//			g.fillRect(315,210,25,25);
//			
			
	}
	
	public static void drawRoad (Graphics g)
	{
		g.setColor(new Color(32, 32, 32));
		Polygon road;
		road = new Polygon();
		road.addPoint(200, 200);
		road.addPoint(300, 200);
		road.addPoint(400, 400);
		road.addPoint(100, 400);
		g.fillPolygon(road);
		g.setColor(Color.white);
        Polygon stripes;
        stripes = new Polygon();
        stripes.addPoint(248, 200);
        stripes.addPoint(252, 200);
        stripes.addPoint(265, 400);
        stripes.addPoint(235, 400);
        g.fillPolygon(stripes);

	}
	

	public static void drawSun(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(200, 155, 100, 100);
		// Color turquoise = new Color(64, 224, 208);

		//Polygon wave1;
		//wave1 = new Polygon();
		//wave1.addPoint(0, 20);
		//wave1.addPoint(30, 260);
		//wave1.addPoint(40, 275);
		//wave1.addPoint(50, 279);
		//wave1.addPoint(60, 300);
		//g.fillPolygon (wave1.xpoints, wave1.ypoints, 5);
	}
	
	public static void drawHorizon (Graphics g)
	{
		// Color turquoise = new Color(64, 224, 208);
		// g.setColor(turquoise);
		
		g.setColor(new Color(18, 127, 16));
		// Polygon wave1;
		// wave1 = new Polygon();
		//wave1.addPoint(0, 20);
		 //wave1.addPoint(30, 260);
		//wave1.addPoint(40, 275);
		//wave1.addPoint(50, 279);
		//wave1.addPoint(60, 300);
		//g.fillPolygon (wave1.xpoints, wave1.ypoints, 5);
		g.fillRect (0, 200, 500, 400);
	}
	
	
	public static void drawTree (Graphics g)
	{
		g.setColor(new Color(106, 65, 50));

	}
}