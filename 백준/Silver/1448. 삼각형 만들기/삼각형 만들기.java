import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] arr2 = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for(int i = N - 1; i > 1; i--) {
            if(arr[i] < arr[i - 1] + arr[i - 2]) {
                System.out.println(arr[i] + arr[i - 1] + arr[i - 2]);
                return;
            }
        }

        System.out.println(-1);


    }

}