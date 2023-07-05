import java.util.*;

public class Main {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        int n = s.nextInt();

        while (n != 0) {
            String str = s.next();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c == '(') stack.push(c);

                else {
                    if (stack.empty()) {
                        stack.push(c);
                        break;
                    } else stack.pop();
                }
            }

            if (stack.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
            stack.clear();

            n--;
        }
    }
}
