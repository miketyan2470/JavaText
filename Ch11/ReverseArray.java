package javaCh11;

import acm.program.*;
/**
 * File : ReverseArray.java
 * ------------------------
 * Console program reads in an array of integers and then displays those elements in reverse order.
 * As shown in figure 11-7 in "Art and science of java by Eric S. Roberts".
 */
public class ReverseArray extends ConsoleProgram {
	// Private constants.
	private static final int N_VALUES = 5;
	/**
	 * Runs program.
	 */
	public void run() {
		int[] array = new int[N_VALUES];
		println("This program reverses an integer array with 5 elements.\n");
		readArray(array);
		reverseArray(array);
		printArray(array);
	}
	/**
	 * Reads each element into the array.
	 * @param array Array of five integers.
	 */
	private void readArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = readInt("Please enter an integer: ");
		}
	}
	/**
	 * Reverses the order of elements in array.
	 * @param array Array of five integers.
	 */
	private void reverseArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			swapElements(array, i, array.length - i - 1);
		}
	}
	/**
	 * Exchanges two elements in the array.
	 * @param array Array of five integers.
	 * @param i1 Integer element index.
	 * @param i2 Integer element index.
	 */
	private void swapElements(int[] array, int i1, int i2) {
		int temp = array[i1];
		array[i1] = array [i2];
		array[i2] = temp;
	}
	/**
	 * Prints the elements from the array, one element per line.
	 * @param array Array of five integers.
	 */
	private void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			println(array[i]);
		}
	}
}