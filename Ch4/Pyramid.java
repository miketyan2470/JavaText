package javaCh4;

import acm.program.*;
import acm.graphics.*;

public class Pyramid extends GraphicsProgram {
	
	public void run() {
		int bw = BRICK_WIDTH;
		int bh = BRICK_HEIGHT;
		int bb = BRICK_BASE;
		int br = BRICK_BASE;
		for (int i = bb; i > 0; i--) {
			GRect brick = new GRect (((getWidth() / 2) - ((bw * bb) / 2)),((getHeight() / 2) + ((bh * br) / 2)),bw,bh); 
			add (brick);
			bb -= 2;
		}
	}
	
	private static final int BRICK_HEIGHT = 10;
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_BASE = 10;
}