import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] road = new int[N - 1];
        int[] oil = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++) {
            road[i] = Integer.parseInt(st.nextToken(" "));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            oil[i] = Integer.parseInt(st.nextToken(" "));
        }

        int total = 0;
        total = road[0] * oil[0];

        int min = 0;
        for(int i = 1; i < N - 1; i++) {
            if(oil[i] <= oil[i + 1])
                min = oil[i];
        }

        for(int i = 1; i < N - 1; i++)
            total += min * road[i];

        System.out.println(total);

    }

}