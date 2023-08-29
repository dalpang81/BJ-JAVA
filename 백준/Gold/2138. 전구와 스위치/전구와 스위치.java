import java.sql.Array;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int ans1 = 1, ans2 = 0, INF = 987654321;
        String now = br.readLine();
        String expect = br.readLine();

        int[] now_arr1 = new int[N];
        int[] now_arr2 = new int[N];
        int[] expect_arr = new int[N];

        for(int i = 0; i < N; i++) {
            now_arr1[i] = now.charAt(i) - '0';
            now_arr2[i] = now.charAt(i) - '0';
            expect_arr[i] = expect.charAt(i) -'0';
        }
        now_arr1[0] = 1 - now_arr1[0];
        now_arr1[1] = 1 - now_arr1[1];

        for(int i = 1; i < N; i++) {
            if(now_arr1[i - 1] != expect_arr[i - 1]) {
                now_arr1[i - 1] = 1 - now_arr1[i - 1];
                now_arr1[i] = 1 - now_arr1[i];
                ans1++;
                if(i != N - 1)
                    now_arr1[i + 1] = 1 - now_arr1[i + 1];
            }
            if(now_arr2[i - 1] != expect_arr[i - 1]) {
                now_arr2[i - 1] = 1 - now_arr2[i - 1];
                now_arr2[i] = 1 - now_arr2[i];
                ans2++;
                if(i != N - 1)
                    now_arr2[i + 1] = 1 - now_arr2[i + 1];
            }
        }

        if(now_arr1[N - 1] != expect_arr[N - 1]) ans1 = INF;
        if(now_arr2[N - 1] != expect_arr[N - 1]) ans2 = INF;

        if(ans1 == INF && ans2 == INF)
            System.out.println(-1);
        else
            System.out.println(Math.min(ans1, ans2));
    }
}