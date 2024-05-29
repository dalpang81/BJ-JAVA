import java.util.*;
import java.io.*;

public class Main {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.println(makeOne(N));
    }

    static int makeOne(int num) {
        if(dp[num] == null) {
            if(num % 6 == 0)
                dp[num] = Math.min(makeOne(num - 1), Math.min(makeOne(num / 3), makeOne(num / 2))) + 1;

            else if(num % 3 == 0)
                dp[num] = Math.min(makeOne(num / 3), makeOne(num - 1)) + 1;

            else if(num % 2 == 0)
                dp[num] = Math.min(makeOne(num / 2), makeOne(num - 1)) + 1;

            else
                dp[num] = makeOne(num - 1) + 1;
        }

        return dp[num];
    }
}