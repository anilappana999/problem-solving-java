package problemsolving;

public class StairCase {
///////////////////////////////////////////////////////////////
	static void staircase(int n) {
		int spaceCount = n;
		int hashCount = (n - (n - 1));
		for (int k = 0; k < n; k++) {
			spaceCount--;
			hashCount++;

			for (int i = 1; i <= spaceCount; i++) {
				System.out.print(" ");
			}
			for (int j = 1; j < hashCount; j++) {
				System.out.print("#");
			}
			System.out.println();

		}
	}///////////////////////////////////////////////////////////////
}
