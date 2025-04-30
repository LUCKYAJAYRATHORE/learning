public class RotateArray {
  public static void rotate(int[] nums, int k) {
      int n = nums.length;
      k = k % n;  // In case k is greater than the length of the array

      // Step 1: Reverse the entire array
      reverse(nums, 0, n - 1);

      // Step 2: Reverse the first k elements
      reverse(nums, 0, k - 1);

      // Step 3: Reverse the remaining n - k elements
      reverse(nums, k, n - 1);
  }

  // Helper function to reverse the elements of the array in place
  private static void reverse(int[] nums, int start, int end) {
    System.out.print("in............. ");
      while (start < end) {
          // Swap elements at start and end
          int temp = nums[start];
          nums[start] = nums[end];
          nums[end] = temp;

          start++;
          end--;
      }
      for (int num : nums) {
        System.out.print(num + "");
        System.out.print("1111111............. ");
    }
  }

  // Main method for testing
  public static void main(String[] args) {
      int[] nums = {1, 2, 3, 4, 5, 6, 7};
      int k = 3;

      rotate(nums, k);

      // Print the rotated array
      for (int num : nums) {
          System.out.print(num + " ");
      }
  }
}
