import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int min = Math.abs(A - B);
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++)
        {
            int tmp = Integer.parseInt(br.readLine());
            min = Math.min(Math.abs(B - tmp) + 1, min);
        }
        System.out.println(min);
    }
}