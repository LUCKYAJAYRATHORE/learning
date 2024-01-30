import java.util.*;
// [1, -1, 1, -1, -1, -1, -1, -1]
// 1
// [1, 2, 1, -1, 2, -1, -1, -1]
// 2
// [1, 2, 1, 3, 2, -1, -1, 3]
// 3
// [1, -1, 1, 2, -1, -1, 2, -1]
// 2
// [1, 3, 1, 2, -1, 3, 2, -1]
// 3
// [1, -1, 1, -1, 2, -1, -1, 2]
// 2
// [1, 3, 1, -1, 2, 3, -1, 2]
// 3
// [-1, 1, -1, 1, -1, -1, -1, -1]
// 1
// [-1, 1, 2, 1, -1, 2, -1, -1]
// 2
// [3, 1, 2, 1, 3, 2, -1, -1]
// 3
// [-1, 1, -1, 1, 2, -1, -1, 2]
// 2
// [-1, 1, 3, 1, 2, -1, 3, 2]
// 3
// [4, 1, 3, 1, 2, 4, 3, 2]
// 4
// ajay
// [4, 1, 3, 1, 2, 4, 3, 2]
// [-1, -1, 1, -1, 1, -1, -1, -1]
// 1
// [2, -1, 1, 2, 1, -1, -1, -1]
// 2
// [2, 3, 1, 2, 1, 3, -1, -1]
// 3
// [-1, -1, 1, 2, 1, -1, 2, -1]
// 2
// [-1, 3, 1, 2, 1, 3, 2, -1]
// 3
// [-1, -1, -1, 1, -1, 1, -1, -1]
// 1
// [-1, 2, -1, 1, 2, 1, -1, -1]
// 2
// [-1, 2, 3, 1, 2, 1, 3, -1]
// 3
// [-1, -1, -1, 1, 2, 1, -1, 2]
// 2
// [-1, -1, 3, 1, 2, 1, 3, 2]
// 3
// [-1, -1, -1, -1, 1, -1, 1, -1]
// 1
// [2, -1, -1, 2, 1, -1, 1, -1]
// 2
// [2, 3, -1, 2, 1, 3, 1, -1]
// 3
// [2, 3, 4, 2, 1, 3, 1, 4]
// 4
// ajay
// [2, 3, 4, 2, 1, 3, 1, 4]
// [-1, -1, 2, -1, 1, 2, 1, -1]
// 2
// [-1, -1, 2, 3, 1, 2, 1, 3]
// 3
// [-1, -1, -1, -1, -1, 1, -1, 1]
// 1
// [2, -1, -1, 2, -1, 1, -1, 1]
// 2
// [2, -1, 3, 2, -1, 1, 3, 1]
// 3
// [-1, 2, -1, -1, 2, 1, -1, 1]
// 2
// [-1, 2, 3, -1, 2, 1, 3, 1]
// 3
// [-1, -1, -1, 2, -1, 1, 2, 1]
// 2
// [3, -1, -1, 2, 3, 1, 2, 1]
// 3
// [[4, 1, 3, 1, 2, 4, 3, 2], [2, 3, 4, 2, 1, 3, 1, 4]]
class Solution {
	public static void findCombinationsAll(int x, int n, ArrayList<Integer> list, Set < List<Integer>> combinations) {
/// -1, -1, -1, -1, -1
		if (x > n) {
			combinations.add(new ArrayList<>(list));
			System.out.println(combinations);
			return;
		}

		for (int i = 0; i < 2*n; i++) {
			if (list.get(i) == -1 && (i + x + 1)<2*n && list.get(i + x + 1) == -1) {
				list.set(i, x);
				list.set(i + x + 1, x);

				findCombinationsAll(x + 1, n, list, combinations);

				list.set(i, -1);
				list.set(i + x + 1, -1);
				// combinations.remove(combinations);
			}
		}
	}

	public static Set < List<Integer>> findCombinations(int n) {
		Set < List<Integer>> combinations = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 2 * 4; i++) {
			list.add(-1);
		}
		findCombinationsAll(1,4,list, combinations);
			for(List<Integer> c : combinations){
			System.out.println(c);
		}
		return combinations;
	}
}
