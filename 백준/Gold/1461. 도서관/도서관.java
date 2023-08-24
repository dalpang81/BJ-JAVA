import java.sql.Array;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> positiveQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> negativeQ = new PriorityQueue<>(Collections.reverseOrder());

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());

            if(temp > 0)
                positiveQ.offer(temp);
            else
                negativeQ.offer(Math.abs(temp));
        }

        int maxV = 0;
        if(positiveQ.isEmpty())
            maxV = negativeQ.peek();
        else if(negativeQ.isEmpty())
            maxV = positiveQ.peek();
        else
            maxV = Math.max(positiveQ.peek(), negativeQ.peek());

        int ans = 0;
        while(!positiveQ.isEmpty()) {
            int temp = positiveQ.poll();
            for(int i = 0; i < M - 1; i++) {
                positiveQ.poll();
                if(positiveQ.isEmpty())
                    break;

            }
            ans += temp * 2;
        }

        while(!negativeQ.isEmpty()) {
            int temp = negativeQ.poll();
            for(int i = 0; i < M - 1; i++) {
                negativeQ.poll();
                if(negativeQ.isEmpty())
                    break;
            }
            ans += temp * 2;
        }

        ans -= maxV;
        System.out.println(ans);
    }
}