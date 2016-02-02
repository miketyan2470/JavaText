/*
 * File:Exercise8.java
 * -------------------
 * Creates a GraphicProgram that draws the Olympic Logo
 * with 3 rings per color to expand the thickness of 
 * each ring to 3 pixels wide.
 */

package javaCh2;

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class OlympicLogoBold extends GraphicsProgram {
	
	public void run() {
		GOval blueRing1 = new GOval(50,50,100,100);
			blueRing1.setColor(Color.BLUE);
		add(blueRing1);
		GOval blueRing2 = new GOval(51,51,98,98);
			blueRing2.setColor(Color.BLUE);
		add(blueRing2);
		GOval blueRing3 = new GOval(52,52,96,96);
			blueRing3.setColor(Color.BLUE);
		add(blueRing3);
		
		GOval blackRing1 = new GOval(170,50,100,100);
			blackRing1.setColor(Color.BLACK);
		add(blackRing1);
		GOval blackRing2 = new GOval(171,51,98,98);
			blackRing2.setColor(Color.BLACK);
		add(blackRing2);
		GOval blackRing3 = new GOval(172,52,96,96);
			blackRing3.setColor(Color.BLACK);
		add(blackRing3);
		
		GOval redRing1 = new GOval(290,50,100,100);
			redRing1.setColor(Color.RED);
		add(redRing1);
		GOval redRing2 = new GOval(291,51,98,98);
			redRing2.setColor(Color.RED);
		add(redRing2);
		GOval redRing = new GOval(292,52,96,96);
			redRing.setColor(Color.RED);
		add(redRing);
		
		GOval yellowRing1 = new GOval(110,110,100,100);
			yellowRing1.setColor(Color.YELLOW);
		add(yellowRing1);
		GOval yellowRing2 = new GOval(111,111,98,98);
			yellowRing2.setColor(Color.YELLOW);
		add(yellowRing2);
		GOval yellowRing3 = new GOval(112,112,96,96);
			yellowRing3.setColor(Color.YELLOW);
		add(yellowRing3);
	
		
		GOval greenRing1 = new GOval(230,110,100,100);
			greenRing1.setColor(Color.GREEN);
		add(greenRing1);
		GOval greenRing2 = new GOval(231,111,98,98);
			greenRing2.setColor(Color.GREEN);
		add(greenRing2);
		GOval greenRing3 = new GOval(232,112,96,96);
			greenRing3.setColor(Color.GREEN);
		add(greenRing3);
	}
	
}