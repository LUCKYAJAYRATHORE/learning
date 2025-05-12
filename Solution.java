import java.util.*;

class Solution {
	public static void findCombinationsAll(int x, int n, ArrayList<Integer> list, Set < List<Integer>> combinations) {
////--1--1--1--1-
		if (x > n) {
			combinations.add(new ArrayList<>(list));
			// System.out.println("ajay");
			// System.out.println(list);
			return;
		}

		for (int i = 0; i < 2*n; i++) {
		// System.out.println("i");
		// System.out.println(i);
			// System.out.println(list.get(i) == -1 && (i + x + 1)<2 * n && list.get(i + x + 1) == -1);
			if (list.get(i) == -1 && (i + x + 1)<2 * n && list.get(i + x + 1) == -1) {
				list.set(i, x);
				list.set(i + x + 1, x);
				System.out.println(list);
				// System.out.println("x");
				// System.out.println(x);
				// System.out.println("after");
				findCombinationsAll(x + 1, n, list, combinations);
				// System.out.println(x);
				list.set(i, -1);
				list.set(i + x + 1, -1);
			}
		}
	}

	public static void main(String[] args) {
		Set < List<Integer>> combinations = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 2 * 4; i++) {
			list.add(-1);
		}
		findCombinationsAll(1,4,list, combinations);
		System.out.println(combinations);
	}
}