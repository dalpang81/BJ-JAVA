import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while(T > 0) {
            T--;
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(st.nextToken());

            int[] ans = new int[N];
            int min = Integer.MAX_VALUE;
            int left = 0;
            int right = N - 1;
            Arrays.sort(arr);

            for(int i = 0; i < N; i++) {
                if(i % 2 != 0) {
                    ans[left] = arr[i];
                    left++;
                }

                else {
                    ans[right] = arr[i];
                    right--;
                }
            }

            min = Math.abs(ans[0] - ans[N - 1]);
            for(int i = 1; i < N; i++) {
                min = Math.max(min, Math.abs(ans[i] - ans[i - 1]));
            }
            System.out.println(min);
        }
    }
}