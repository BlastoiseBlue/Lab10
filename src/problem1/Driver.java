/*
 * Emmet Stanevich
 * 10/31/17
 * Problem 1
 */
package problem1;

public class Driver {

	public static void main(String[] args) {
		HotDogStand stand1 = new HotDogStand(15344, 20);
		HotDogStand stand2 = new HotDogStand(95537, 76);
		HotDogStand stand3 = new HotDogStand(56747, 73);
		HotDogStand.outputTotal();
		stand1.justSold();
		stand2.justSold(13);
		stand3.justSold(4);
		HotDogStand.outputTotal();
	}

}
