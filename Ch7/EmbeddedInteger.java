package javaCh7;
/**
 * File : EmbeddedInteger.java
 * ---------------------------
 * Class allows clients to treat an integer as an object.
 * -Methods setValue and getValue allows clients to set the value
 * 	and to get the value respectively.
 */
public class EmbeddedInteger {
	// Private instance variables.
	private int value;
	/**
	 * Creates an EmbeddedInteger with value 'n'.
	 * @param n Value to be assigned to EmbeddedInteger.
	 */
	public EmbeddedInteger(int n) {
		value = n;
	}
	/**
	 * Sets the value for EmbeddedInteger.
	 * @param n Value to be assigned to EmbeddedInteger.
	 */
	public void setValue(int n) {
		value = n;
	}
	/**
	 * Returns the value of this EmbeddedInteger.
	 * @return Returns the internal value of this EmbeddedInteger.
	 */
	public int getValue() {
		return value;
	}
	/**
	 * Returns the string corresponding to the internal value.
	 */
	public String toString() {
		return "" + value;
	}
}
