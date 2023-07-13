import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int K;

    static int visited[] = new int[100001];

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        N = s.nextInt();
        K = s.nextInt();

        int result = bfs(N);
        System.out.println(result);
        }

        static int bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(node);

        int index = node;
        int time = 0;
        visited[index] = 1;

        while(!queue.isEmpty()) {
            time = queue.remove();

            if(time == K) return visited[time] - 1;

            if(time - 1 >= 0 && visited[time - 1] == 0) {
                visited[time - 1] = visited[time] + 1;
                queue.add(time - 1);
            }

            if(time + 1 <= 100000 && visited[time + 1] == 0) {
                visited[time + 1] = visited[time] + 1;
                queue.add(time + 1);
            }

            if(2 * time <= 100000 && visited[2 * time] == 0) {
                visited[2 * time] = visited[time] + 1;
                queue.add(2 * time);
            }
        }
        return -1;
    }
}
