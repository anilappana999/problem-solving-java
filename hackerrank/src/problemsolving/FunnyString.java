package problemsolving;

public class FunnyString {
	static String funnyString(String s) {

		StringBuilder rev = new StringBuilder(s);
		rev.reverse();
		for (int i = 0; i < s.length() - 1; i++) {
			int a = Math.abs((int) (s.charAt(i)) - (int) (s.charAt(i + 1)));
			int b = Math.abs((int) (rev.charAt(i)) - (int) (rev.charAt(i + 1)));
			if (a != b) {
				return "Not Funny";
			}
		}
		return "Funny";
	}

}
