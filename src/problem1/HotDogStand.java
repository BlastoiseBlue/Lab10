/*
 * Emmet Stanevich
 * 10/31/17
 * Problem 1
 */
package problem1;

public class HotDogStand {
	private int id;
	private int numSold;

	public void justSold() {
		numSold++;
	}

	public int getNumSold() {
		return numSold;
	}

	public HotDogStand(int inputId, int inputSold) {
		id = inputId;
		numSold = inputSold;
	}
	// public static int totalSold() {
	//
	// }
}
