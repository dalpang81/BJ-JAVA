import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        int count = 0;
        int tmp = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int sum = 0, left = 0, right = 0, ans = 0;

        while(right <= N) {
            if(sum >= M) {
                sum -= arr[left++];
            }
            else if(sum < M) {
                sum += arr[right++];
            }

            if(sum == M)
                ans++;
        }

        System.out.println(ans);
    }
}