import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];

        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr, Comparator.reverseOrder());

        int total = 0;
        for(int i = 0; i < N; i++) {
            if(i % 3 == 2) continue;
            total += arr[i];
        }

        System.out.println(total);
    }
}