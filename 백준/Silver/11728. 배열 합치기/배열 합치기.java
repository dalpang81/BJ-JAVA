import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[N];
        int[] arr2 = new int[M];


        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        int p1 = 0, p2 = 0;
        StringBuilder sb = new StringBuilder();

        while(p1 < N && p2 < M) {
            if(arr1[p1] <= arr2[p2])
                sb.append(arr1[p1++] + " ");
            else
                sb.append(arr2[p2++] + " ");
        }

        if(p1 == N) {
            for(int i = p2; i < M; i++)
                sb.append(arr2[i] + " ");
        }
        if (p2 == M) {
            for(int i = p1; i < N; i++)
                sb.append(arr1[i] + " ");
        }

        System.out.println(sb);




    }
}