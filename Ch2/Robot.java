/*
 * File:Exercise5.java
 * -------------------
 * Program creates a robot grey face with 2 orange eyes,
 * black nose, and a white mouth. All spaces are filled
 * with black boarders.
 */

package javaCh2;

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class Robot extends GraphicsProgram {
	
	public void run() {
		GRect face = new GRect(50,50,200,300);
			face.setColor(Color.BLACK);
			face.setFilled(true);
			face.setFillColor(Color.GRAY);
		add(face);
		
		GOval eyeL = new GOval(75,75,50,50);
			eyeL.setColor(Color.BLACK);
			eyeL.setFilled(true);
			eyeL.setFillColor(Color.ORANGE);
		add(eyeL);
		
		GOval eyeR = new GOval(175,75,50,50);
			eyeR.setColor(Color.BLACK);
			eyeR.setFilled(true);
			eyeR.setFillColor(Color.ORANGE);
		add(eyeR);
	
		GRect nose = new GRect(140,175,20,50);
			nose.setFilled(true);
			nose.setFillColor(Color.black);
		add(nose);
		
		GRect mouth = new GRect(60,250,180,60);
			mouth.setColor(Color.BLACK);
			mouth.setFilled(true);
			mouth.setFillColor(Color.WHITE);
		add(mouth);
	}
	
}