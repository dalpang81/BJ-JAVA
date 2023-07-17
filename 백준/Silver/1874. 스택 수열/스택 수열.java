import java.util.*;

public class Main {
    static String underbar = "";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = s.nextInt();
        int start = 0;

        while(n-- > 0) {
            int value = s.nextInt();

            if(value > start) {
                for(int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = value;
            }

            else if(stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}