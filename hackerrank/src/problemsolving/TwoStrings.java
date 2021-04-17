package problemsolving;

import java.util.HashSet;

public class TwoStrings {

	static String twoStrings(String s1, String s2) {
		HashSet<Character> a = new HashSet<Character>();

		HashSet<Character> b = new HashSet<Character>();

		for (int i = 0; i < s1.length(); i++) {
			a.add(s1.charAt(i));
		}
		for (int j = 0; j < s2.length(); j++) {
			b.add(s2.charAt(j));
		}

		a.retainAll(b);

		if (a.isEmpty()) {
			return "NO";
		} else {
			return "YES";
		}
	}

}
