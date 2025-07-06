import java.util.ArrayList;

public class ArrayLeaders {
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[]){
        // Your code here
        ArrayList<Integer> lead = new ArrayList<Integer>();
        int sum =0;
        int n = arr.length;
        for (int i=n-1; i>=0; i--) {
          System.out.println("arr[i]" + arr[i]);
          System.out.println("sum" + sum);
                if(arr[i]>=sum) {
                   //System.out.println(leaders(arr));
                   lead.add(arr[i]);
                   sum=arr[i];
                }

        }
       reverse(lead);
       return lead;
    }

    public static void reverse(ArrayList<Integer> list) {
       if (list== null || list.size() <= 1) {
           return;
       }

       Integer value = list.remove(0);

       reverse(list);

       list.add(value);
   }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4,  3, 5, 2};
        System.out.println(leaders(arr));
    }
}
