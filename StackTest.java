import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class StackTest {

  public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
    Stack<String> stack = new Stack<String>();

    stack.push("1");

   // String topElement = stack.pop();
    System.out.println(stack);
    stack.pop();
    System.out.println(stack);
  }

//   private static String getInput() {
//     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//     return reader.lines().collect(Collectors.joining("\n"));
// }
}