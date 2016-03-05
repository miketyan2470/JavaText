package javaCh11;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
/**
 * File : YarnPattern.java
 * -----------------------
 * Graphics program draws a pattern with lines based on set constants.
 * -Program uses arrays to store and calculate GPoints.
 */
public class YarnPattern extends GraphicsProgram {
	// Private constants.
	private static final int DELTA = 134;
	private static final int PEG_SEP = 20;
	private static final int N_DOWN = 45;
	private static final int N_ACROSS = 75;
	private static final int N_PEGS = 2 * N_ACROSS + 2 * N_DOWN;
	// Private instance variables.
	private GPoint[] pegs = new GPoint[N_PEGS];
	/**
	 * Runs program.
	 */
	public void run() {
		initPegArray();
		int thisPeg = 0;
		int nextPeg = -1;
		while (thisPeg != 0 || nextPeg == -1) {
			nextPeg = (thisPeg + DELTA) % N_PEGS;
			GPoint p0 = pegs[thisPeg];
			GPoint p1 = pegs[nextPeg];
			GLine line = new GLine(p0.getX(), p0.getY(), p1.getX(), p1.getY());
			line.setColor(Color.MAGENTA);
			add(line);
			thisPeg = nextPeg;
		}
	}
	/**
	 * Initializes the arrays for peg points.
	 */
	private void initPegArray() {
		int pegIndex = 0;
		for (int i = 0; i < N_ACROSS; i++) {
			pegs[pegIndex++] = new GPoint(i * PEG_SEP, 0);
		}
		for (int i = 0; i < N_DOWN; i++) {
			pegs[pegIndex++] = new GPoint(N_ACROSS * PEG_SEP, i * PEG_SEP);
		}
		for (int i = N_ACROSS; i > 0; i--) {
			pegs[pegIndex++] = new GPoint(i * PEG_SEP, N_DOWN * PEG_SEP);
		}
		for (int i = N_DOWN; i > 0; i--) {
			pegs[pegIndex++] = new GPoint(0, i * PEG_SEP);
		}
	}
}