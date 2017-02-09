/* Author: Erik Humphrey
 * Date started: February 9th, 2017
 * Project title: Module 2 Exercise - Intro to Java Applets
 * Description: Program that prints a static tic-tac-toe board to the console.
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
		drawWater(g);
		drawTree(g);
		setBackground(sky);
		this.setSize(500, 400);
		// this.setLocationRelativeTo(null);
		// this.setSize(800,500);
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
	
	public static void drawWater (Graphics g)
	{
		Color turquoise = new Color(64, 224, 208);
		g.setColor(turquoise);
		Polygon wave1;
		wave1 = new Polygon();
		wave1.addPoint(0, 20);
		wave1.addPoint(30, 260);
		wave1.addPoint(40, 275);
		wave1.addPoint(50, 279);
		wave1.addPoint(60, 300);
		g.fillPolygon (wave1.xpoints, wave1.ypoints, 5);
	}
	
	public static void drawTree (Graphics g)
	{
		Color turquoise = new Color(64, 224, 208);
		g.setColor(turquoise);
		Polygon wave1;
		wave1 = new Polygon();
		wave1.addPoint(0, 20);
		wave1.addPoint(30, 260);
		wave1.addPoint(40, 275);
		wave1.addPoint(50, 279);
		wave1.addPoint(60, 300);
		g.fillPolygon (wave1.xpoints, wave1.ypoints, 5);
	}
}