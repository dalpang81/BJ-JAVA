import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken(" "));
        }

        Arrays.sort(arr);

        if(N % 2 == 0)
            System.out.println(arr[N / 2 - 1]);
        else
            System.out.println(arr[N / 2]);



    }

}