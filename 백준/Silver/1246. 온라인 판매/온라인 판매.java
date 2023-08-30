import java.sql.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M];
        int[] sum = new int[M];

        for(int i = 0; i < M; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        for(int i = 0; i < M; i++) {
            if(i < (M - N + 1))
                sum[i] = arr[i] * N;
            else
                sum[i] = arr[i] * (M - i);
        }

        int max = sum[0];
        int point = 0;
        for(int i = 1; i < M; i++){
            if(max < sum[i]) {
                max = sum[i];
                point = i;
            }
        }

        System.out.println(arr[point] + " " + max);
    }
}