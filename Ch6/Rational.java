package javaCh6;

/**
 * Rational class is used to represent rational numbers, which are defined as the quotient
 * of two integers.
 */
public class Rational {
	// Private instance variables.
	private int num;
	private int den;
	/** Creates new Rational with value '0'. */
	public Rational() {
		this(0);
	}
	/**
	 * Creates new Rational with value from integer argument.
	 * @param n Initial value.
	 */
	public Rational(int n) {
		this(n, 1);
	}
	/**
	 * Creates new Rational with values 'x' and 'y'.
	 * @param x The numerator of the rational number.
	 * @param y The denominator of the rational number.
	 */
	public Rational(int x, int y) {
		int g = gcd(Math.abs(x), Math.abs(y));
		num = x / g;
		den = Math.abs(y) / g;
		if (y < 0) num = -num;
	}
	/**
	 * Adds rational number 'r' to this one.
	 * @param r Rational number to be added.
	 * @return The sum of current number and 'r'.
	 */
	public Rational add(Rational r) {
		return new Rational((this.num * r.den) + (r.num * this.den), (this.den * r.den));
	}
	/**
	 * Subtracts rational number 'r' from this one.
	 * @param r Rational number to be subtracted.
	 * @return The result of subtracting 'r' from current number.
	 */
	public Rational subtract(Rational r) {
		return new Rational((this.num * r.den) - (r.num * this.den), (this.den * r.den));
	}
	/**
	 * Multiplies rational number 'r' by this number.
	 * @param r Rational number to be multiplied.
	 * @return The result of multiplying 'r' and the current number.
	 */
	public Rational multiply(Rational r) {
		return new Rational((this.num * r.num), (this.den * r.den));
	}
	/**
	 * Divides this number by the rational number 'r'.
	 * @param r Rational number used as divisor.
	 * @return The result of dividing the current number by 'r'.
	 */
	public Rational divide(Rational r) {
		return new Rational((this.num * r.den), (this.den * r.num));
	}
	/**
	 * Creates a String representation of this rational number.
	 * @return String representation of this rational number.
	 */
	public String toString() {
		if (den == 1) {
			return "" + num;
		} else {
			return num + "/" + den;
		}
	}
	/**
	 * Calculates the greatest common divisor using Euclid's algorithm.
	 * @param x First integer.
	 * @param y Second integer.
	 * @return The greatest common divisor of 'x' and 'y'.
	 */
	private int gcd(int x, int y) {
		int r = x % y;
		while (r != 0) {
			x = y;
			y = r;
			r = x % y;
		}
		return y;
	}
}
