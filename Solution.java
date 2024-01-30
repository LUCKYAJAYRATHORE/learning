import java.util.*;

class Solution {
	public static void findCombinationsAll(int x, int n, ArrayList<Integer> list, Set < List<Integer>> combinations) {

		if (x > n) {
			combinations.add(new ArrayList<>(list));
			System.out.println(combinations);
			return;
		}

		for (int i = 0; i < 2*n; i++) {
			if (list.get(i) == -1 && (i + x + 1)<2 * n && list.get(i + x + 1) == -1) {
				list.set(i, x);
				list.set(i + x + 1, x);

				findCombinationsAll(x + 1, n, list, combinations);

				list.set(i, -1);
				list.set(i + x + 1, -1);
				// combinations.remove(combinations);
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
			for(List<Integer> c : combinations){
			System.out.println(c);
		}
		return;
	}
}
