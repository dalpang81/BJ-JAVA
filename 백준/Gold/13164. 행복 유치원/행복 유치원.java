import java.sql.Array;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();
        int result = 0;
        for(int i = 1; i < N; i++)
            list.add(arr[i] - arr[i - 1]);
        Collections.sort(list);

        for(int i = 0; i < N - K; i++)
            result += list.get(i);

        System.out.println(result);
    }
}