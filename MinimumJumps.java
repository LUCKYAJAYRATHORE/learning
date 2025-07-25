public class MinimumJumps {
    static int minJumps(int[] arr){
      {
        if (arr.length <= 1)
            return 0;

        // Return -1 if not possible to jump
        if (arr[0] == 0)
            return -1;

        // initialization
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;


        // Start traversing array
        for (int i = 1; i < arr.length; i++) //{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        {
          System.out.println("arr[i]" + arr[i]);

          // {i = 0, arr[i] =1} {1, 3}
            // Check if we have reached the end of the array
            if (i == arr.length - 1) //
                return jump; //

            // updating maxReach
            maxReach = Math.max(maxReach, i+arr[i]); // {1, 1 = 1} {1, 4= 4}
            System.out.println("maxReach" + maxReach);
            // we use a step to get to the current index
            step--; // 0, -1
            System.out.println("step" + step);
            // If no further steps left
            if (step == 0)
            {
                //  we must have used a jump
                jump++; // 1
                 System.out.println("jump" + jump);
                //Check if the current index/position  or lesser index
                // is the maximum reach point from the previous indexes
                if(i>=maxReach) // {0, 5 = F}
                   return -1;

                // re-initialize the steps to the amount
                // of steps to reach maxReach from position i.
                step = maxReach - i; //{1-1= 0, }
                System.out.println("step1 " + step);
            }
        }

        return -1;
    }
    }

      public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }

}
