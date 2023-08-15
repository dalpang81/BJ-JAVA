import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if(N == 1) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[N - 1];

        int a = Integer.parseInt(br.readLine());
        for(int i = 0; i < N - 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        while(true) {
            Arrays.sort(arr);
            if(arr[N-2] < a) break;
            cnt++;
            arr[N - 2]--;
            a++;
        }
        System.out.println(cnt);
    }
}