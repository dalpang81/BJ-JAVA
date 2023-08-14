import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            long A = Integer.parseInt(br.readLine());
            priorityQueue.add(A);
        }

        long index = 0;
        while(priorityQueue.size() > 1) {
            long temp1 = priorityQueue.poll();
            long temp2 = priorityQueue.poll();

            index += temp1 + temp2;
            priorityQueue.add(temp1 + temp2);
        }

        System.out.println(index);
    }
}