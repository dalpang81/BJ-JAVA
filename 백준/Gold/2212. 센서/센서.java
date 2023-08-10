import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        Integer[] diffArr = new Integer[N - 1];
        for(int i = 0; i < N - 1; i++) {
            diffArr[i] = arr[i+1] - arr[i];
        }

        Arrays.sort(diffArr, Collections.reverseOrder());

        int sum = 0;
        for(int i = K - 1; i < N - 1; i++) {
            sum += diffArr[i];
        }
        System.out.println(sum);



    }
}