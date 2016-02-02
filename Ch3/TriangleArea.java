/*File: Exercise2
 *Program Calculates the area of a triangle
 *given the base (b) and the height (h).
 */

package javaCh2;

import acm.program.*;

public class TriangleArea extends ConsoleProgram {
	
	public void run() {
		double base = readDouble("Enter Base: ");
		double height = readDouble("Enter Height: ");
		double area = (base * height) / 2;
		println("Area = " + area);
	}
	
}