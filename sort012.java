import java.util.*;

public class  sort012 {
public static void sort (int[] arr) {

    Arrays.sort(arr);

}
   public static void main(String[] args) {
        int[] arr = {16, 2, 4,  3, 3, 2};
        //{2, 2, 3,  3, 4, 16};
        sort(arr);
        System.out.println("arrr " + Arrays.toString(arr));
    }

}