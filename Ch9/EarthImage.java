/**
 * File : EarthImage.java
 * ----------------------
 * Graphics program displays GImage bluemarble.jpg.
 * - Citation is added at bottom right corner to cite source.
 * - Graphics window is set to size of GImage plus the citation size.
 */
package javaCh9;

import acm.graphics.*;
import acm.program.*;

public class EarthImage extends GraphicsProgram {
	// Private constants.
	private static final String CITATION_FONT = "SansSerif-10";
	private static final int CITATION_MARGIN = 13;
	/**
	 * Adds image bluemarble.jpg to canvas along with citation to cite source.
	 */
	public void run() {
		add(new GImage("BlueMarble.jpg"));
		addCitation("Courtesy NASA/JPL-Caltech");
	}
	/**
	 * Adds citation to bottom right corner of graphics window.
	 * @param citation String citation for source.
	 */
	private void addCitation(String citation) {
		GLabel label = new GLabel(citation);
		label.setFont(CITATION_FONT);
		// Sets coordinates at bottom of image to the right.
		double x = getWidth() - label.getWidth();
		double y = getHeight() - CITATION_MARGIN + label.getAscent();
		add(label, x, y);
	}
	// Initializes the graphics window to set dimensions.
	public static final int APPLICATION_WIDTH = 600;
	public static final int APPLICATION_HEIGHT = 600 + CITATION_MARGIN;
}