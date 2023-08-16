import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        PriorityQueue<Long> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }

        for(int i = 0; i < m; i++) {
            long a = pq.poll();
            long b = pq.poll();

            long sum = a + b;
            pq.add(sum);
            pq.add(sum);
        }

        long total = 0;
        for(int i = 0; i < n; i++) {
            total += pq.poll();
        }

        System.out.println(total);
    }
}