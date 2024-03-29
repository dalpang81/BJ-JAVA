import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());



        long tip = 0;
        for(int i = 0; i < N; i++) {
            int temp = arr[i] - ((i + 1) - 1);
            if(temp < 0)
                break;
            tip += temp;
        }

        System.out.println(tip);

    }
}