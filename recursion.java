// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

// class Result {

//     /*
//      * Complete the 'superDigit' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts following parameters:
//      *  1. STRING n
//      *  2. INTEGER k
//      */
//      static int sum;
//     public static int superDigit(String n, int k) {
//         sum = superSum(n, k);
//             do {
//                 sum = superSum(String.valueOf(sum), 1);
//                 } while (sum>9);
//         return sum;
//     }

//     public static int superSum(String n, int k) {
//     int sum = 0;
//     for(int i=0;i<k;i++) {
//                 for (char c : n.toCharArray()) {
//                     sum += Character.getNumericValue(c);
//                 }
//         }
//         return sum;
//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//         String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

//         String n = firstMultipleInput[0];

//         int k = Integer.parseInt(firstMultipleInput[1]);

//         int result = Result.superDigit(n, k);

//         bufferedWriter.write(String.valueOf(result));
//         bufferedWriter.newLine();

//         bufferedReader.close();
//         bufferedWriter.close();
//     }
// }
