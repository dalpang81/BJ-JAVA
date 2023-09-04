import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            Deque<Character> deque = new LinkedList<>();
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++) {
                char ch = st.nextToken().charAt(0);
                if(deque.isEmpty())
                    deque.add(ch);
                else {
                    if (deque.getFirst() >= ch)
                        deque.addFirst(ch);
                    else
                        deque.addLast(ch);
                }
            }

            for(int j = 0; j < N; j++)
                System.out.print(deque.poll());
            System.out.println();
        }
    }
}