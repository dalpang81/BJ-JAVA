import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T > 0) {
            int N = Integer.parseInt(br.readLine());
            long answer = 0;
            int[] arr = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(st.nextToken());

            int max = arr[N - 1];
            for(int i = N - 2; i >= 0; i--) {
                if(arr[i] <= max)
                    answer += max - arr[i];
                else max = arr[i];
            }
            System.out.println(answer);
            T--;
        }





    }
}