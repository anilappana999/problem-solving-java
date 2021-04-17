package problemsolving;

import java.util.Arrays;

public class HurdleRace {

	static int hurdleRace(int k, int[] height) {
		Arrays.sort(height);
		if (height[height.length - 1] < k) {
			return 0;
		} else {
			int a = height[height.length - 1] - k;
			return a;
		}
	}

}
