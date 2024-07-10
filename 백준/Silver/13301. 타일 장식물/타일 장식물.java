import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(br.readLine());

        long[] dp = new long[81];

        dp[1] = 4;
        dp[2] = 6;

        for(int i = 3; i <= N; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        System.out.println(dp[N]);
    }
}