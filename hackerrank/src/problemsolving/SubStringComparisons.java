package problemsolving;

public class SubStringComparisons {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = s.substring(0, k);
		String substr = "";
		String substr1 = "";
		for (int i = 0; i <= s.length() - k; i++) {
			substr = s.substring(i, i + k);
			substr1 = s.substring(i, i + k);
			int var1 = substr.compareTo(smallest);
			int var2 = substr1.compareTo(largest);
			if (var2 > 0) {
				largest = substr1;
			}
			if (var1 < 0) {
				smallest = substr;
			}

		}

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		return smallest + "\n" + largest;
	}

}
