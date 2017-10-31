package problem1;

public class HotDogStand {
	private int id = 0;
	private int numSold = 0;
	static int total = 0;

	public void justSold() {
		numSold++;
		total++;
	}

	public void justSold(int sold) {
		if (sold > 0) {
			numSold = numSold + sold;
			total = total + sold;
		}
	}

	public int getId() {
		return id;
	}

	public int getNumSold() {
		return numSold;
	}

	public static int getTotal() {
		return total;
	}

	public HotDogStand() {
		id = 0;
		numSold = 0;
	}

	public HotDogStand(int inputId) {
		id = inputId;
	}

	public HotDogStand(int inputId, int inputSold) {
		id = inputId;
		numSold = inputSold;
		total = total + inputSold;
	}
}
