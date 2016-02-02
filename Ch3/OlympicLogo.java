/*
 * File:Exercise7.java
 * -------------------
 * Creates a GraphicProgram that draws the Olympic
 * logo that consists of 5 interlocking rings of 
 * different colors.
 */

package javaCh2;

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class OlympicLogo extends GraphicsProgram {
	
	public void run() {
		GOval blueRing = new GOval(50,50,100,100);
			blueRing.setColor(Color.BLUE);
		add(blueRing);
		
		GOval blackRing = new GOval(170,50,100,100);
			blackRing.setColor(Color.BLACK);
		add(blackRing);
		
		GOval redRing = new GOval(290,50,100,100);
			redRing.setColor(Color.RED);
		add(redRing);
		
		GOval yellowRing = new GOval(110,110,100,100);
			yellowRing.setColor(Color.YELLOW);
		add(yellowRing);
		
		GOval greenRing = new GOval(230,110,100,100);
			greenRing.setColor(Color.GREEN);
		add(greenRing);
	}
	
}