package javaCh9;

import acm.graphics.*;
/**
 * File : GFace.java
 * -----------------
 * Defines a compound GFace class that scales according to size of 'head'.
 */
public class GFace extends GCompound {
	// Private constants value a fraction of head size.
	private static final double EYE_WIDTH    = 0.15;
	private static final double EYE_HEIGHT   = 0.15;
	private static final double NOSE_WIDTH   = 0.15;
	private static final double NOSE_HEIGHT  = 0.10;
	private static final double MOUTH_WIDTH  = 0.50;
	private static final double MOUTH_HEIGHT = 0.03;
	// Private instance variables.
	private GOval head;
	private GOval leftEye, rightEye;
	private GPolygon nose;
	private GRect mouth;
	/**
	 * Creates new GFace object with specified dimensions.
	 * @param width Width of 'head'.
	 * @param height Height of 'head'.
	 */
	public GFace(double width, double height) {
		head = new GOval(width, height);
		leftEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
		rightEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
		nose = createNose(NOSE_WIDTH * width, NOSE_HEIGHT * height);
		mouth = new GRect(MOUTH_WIDTH * width, MOUTH_HEIGHT * height);
		add(head, 0, 0);
		add(leftEye, (0.25 * width) - (EYE_WIDTH * width) / 2, ((0.25 * height) - (EYE_HEIGHT * height) / 2));
		add(rightEye, (0.75 * width) - (EYE_WIDTH * width) / 2, ((0.25 * height) - (EYE_HEIGHT * height) / 2));	
		add(nose, 0.50 * width, 0.50 * height);
		add(mouth, (0.50 * width) - (MOUTH_WIDTH * width) / 2, (0.75 * height) - (MOUTH_HEIGHT * height) / 2);
	}
	/**
	 * Creates a GPolygon triangle for the nose.
	 * @param width Width of nose.
	 * @param height Height of nose.
	 * @return Returns GPolygon nose.
	 */
	private GPolygon createNose(double width, double height) {
		GPolygon nose = new GPolygon();
		nose.addVertex(0, -height / 2);
		nose.addVertex(width / 2, height / 2);
		nose.addVertex(-width / 2, height / 2);
		return nose;
	}
}