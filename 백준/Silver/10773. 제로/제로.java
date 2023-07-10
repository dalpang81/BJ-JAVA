import java.util.*;

public class Main {
    public static boolean[] prime;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        int K = s.nextInt();
        int sum = 0;

        for(int i = 0; i < K; i++)
        {
            int n = s.nextInt();

            if(n == 0) {
                stack.pop();
                continue;
            }
            stack.push(n);
        }

        while(!stack.empty()) {
            int m = stack.pop();

            sum += m;
        }

        System.out.print(sum);


        
    }
}
