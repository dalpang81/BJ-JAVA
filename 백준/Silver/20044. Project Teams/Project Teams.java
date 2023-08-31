import java.sql.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[2 * N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < 2 * N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 2 * N; i++) {
            int score = arr[i] + arr[N * 2 - 1 - i];
            if(score < min)
                min = score;
        }

        System.out.println(min);






    }
}