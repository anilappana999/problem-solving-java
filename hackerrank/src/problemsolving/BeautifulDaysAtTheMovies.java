package problemsolving;

public class BeautifulDaysAtTheMovies {
	static int beautifulDays(int i, int j, int k) {

		int count = 0;

		for (int m = i; m <= j; m++) {

			int t = m;
			int reverse = 0;
			int rem = 0;
			double a = 0;
			while (t > 0) {
				rem = t % 10;
				reverse = reverse * 10 + rem;
				t = t / 10;
			}
			double s = Math.abs(reverse - m);
			a = s / k;
			if (a - Math.floor(a) == 0) {
				count++;
			}

		}
		return count;
	}

}
