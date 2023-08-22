import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int[] arr2 = new int[N];
        int temp = N - 1;
        for(int i = 0; i < N; i++) {
            arr2[i] = arr[temp];
            temp--;
        }

        int maxDay = 0;
        for(int i = 0; i < N; i++) {
            maxDay = Math.max(maxDay, arr2[i] + i + 1);
        }

        maxDay += 1;
        System.out.println(maxDay);
    }
}