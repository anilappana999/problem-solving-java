package problemsolving;

public class CatAndMouse {
	static String catAndMouse(int x, int y, int z) {

		String A = "";

		int a = Math.abs(x - z);
		int b = Math.abs(z - y);

		if (a < b) {

			A = "Cat A";
		}

		else if (a > b) {
			A = "Cat B";

		}

		else if (a == b) {

			A = "Mouse C";

		}

		return A;
	}

}
