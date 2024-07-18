import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            long[] dp = new long[1001];

            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 1;

            for(int j = 3; j <= N; j++) {
                dp[j] = dp[j - 3] + dp[j - 2];
            }

            System.out.println(dp[N - 1]);



        }

    }


}