  //{ Driver Code Starts
import java.io.*;
import java.util.*;

class missingInArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(missingNum(arr));
            System.out.println("~");
        }
    }

    static int missingNum(int arr[]) {
        // code here
      long n = arr.length;
        long sum = ((n+1) * (n+2))/2;
        for(int i = 0; i<n; i++) {
          sum -= arr[i];
        }
        return (int) sum;
    }
}

