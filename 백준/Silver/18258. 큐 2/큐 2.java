import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> q = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String comment = st.nextToken();
            if(comment.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                q.offer(num);
            }

            else if(comment.equals("pop")) {
                Integer tmp = q.poll();
                if(tmp == null) {
                    sb.append(-1).append('\n');
                }
                else {
                    sb.append(tmp).append('\n');
                }
            }

            else if(comment.equals("size")) {
                sb.append(q.size()).append('\n');
            }

            else if(comment.equals("empty")) {
                if(q.isEmpty()) {
                    sb.append(1).append('\n');
                }
                else {
                    sb.append(0).append('\n');
                }
            }

            else if(comment.equals("front")) {
                Integer ite = q.peek();
                if(ite == null) {
                    sb.append(-1).append('\n');
                }
                else {
                    sb.append(ite).append('\n');
                }
            }

            else if(comment.equals("back")) {
                Integer it = q.peekLast();
                if(it == null) {
                    sb.append(-1).append('\n');
                }
                else {
                    sb.append(it).append('\n');
                }
            }

        }
        System.out.println(sb);
    }
}