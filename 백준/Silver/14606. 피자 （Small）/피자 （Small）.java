import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        dp[0] = 0;

        for(int i = 1; i <= N; i++) {
            dp[i] += dp[i - 1] + i;
        }

        System.out.println(dp[N - 1]);
    }

}