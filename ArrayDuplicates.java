import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDuplicates {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // ArrayList<Integer> seen = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        //     for (int num : arr) {
        //         if (!res.contains(num) && seen.contains(num)) {
        //             res.add(num);
        //         }
        //         seen.add(num);
        //     }
        // Collections.sort(res);
        // return res;
       Arrays.sort(arr); // sort array for binary search

        //System.out.print("[");
        for (int i = 0; i < n; i++) {
            // index of first and last occ of arr[i]
            int firstIndex = lowerBound(arr, arr[i]);
            int lastIndex = upperBound(arr, arr[i]);

            int occurTime = lastIndex - firstIndex
                            + 1; // frequency of arr[i]

            if (occurTime
                > 1) { // elements that occur more than 1
                i = lastIndex; // update i to last_index
                res.add(arr[i]);
                //System.out.print(arr[i] + ", ");
            }
        }
        if(res.isEmpty()) {
            res.add(-1);
        }
       return res;
    }

    public static int lowerBound(int[] arr, int target)
    {
      System.out.println("arr " + arr);
        int lo = 0, hi = arr.length - 1;
        int ans = -1;
        while (lo <= hi) {
           System.out.println("target " + target);
             System.out.println("lo " + lo);
              System.out.println("hi " + hi);
            int mid = lo + (hi - lo) / 2;
            System.out.println("[mid] " + mid);
             System.out.println("arr[mid] " + arr[mid]);
            if (arr[mid] >= target) {
                ans = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
            System.out.println("ans" + ans);
        }
        return ans;
    }

    // Function to find upper bound of target in arr
    public static int upperBound(int[] arr, int target)
    {
        int lo = 0, hi = arr.length - 1;
        int ans = -1;
        while (lo <= hi) {
             System.out.println("uppertarget " + target);
             System.out.println("lo " + lo);
              System.out.println("hi " + hi);
            int mid = lo + (hi - lo) / 2;
            System.out.println("[mid] " + mid);
             System.out.println("arr[mid] " + arr[mid]);
            if (arr[mid] <= target) {
                ans = mid;
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
             System.out.println("ans" + ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {16, 2, 4,  3, 3, 2};
        //{2, 2, 3,  3, 4, 16};
        System.out.println(duplicates(arr, 5));
    }
    ///✅ Time Complexity
// Both are just binary search.

// Each iteration cuts the search range in half.

// So they run in O(log n) time for an array of size n.

// ✅ Space Complexity
// Both use only a constant number of variables (lo, hi, mid).

// So they use O(1) extra space.
}
