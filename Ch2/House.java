/*
 * File:Exercise4.java
 * -------------------
 * Program creates a house with a
 * peaked roof, two windows, single door,
 * and a circular door knob.
 */

package javaCh2;

import acm.graphics.*;
import acm.program.*;

public class House extends GraphicsProgram {
	
	public void run() {
		GRect house = new GRect(60,250,580,200);
		add(house);
		GLine roofL = new GLine(60,250,350,50);
		add(roofL);
		GLine roofR = new GLine(350,50,640,250);
		add(roofR);
		GRect windowL = new GRect(110,300,100,100);
		add(windowL);
		GRect windowR = new GRect(490,300,100,100);
		add(windowR);
		GRect door = new GRect(310,300,80,150);
		add(door);
		GOval knob = new GOval(370,375,10,10);
		add(knob);
	}
}