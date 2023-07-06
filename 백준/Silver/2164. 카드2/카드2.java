import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = s.nextInt();

        for(int i = 0; i < N; i++)
            queue.add(i + 1);

        while(queue.size() > 1) {
            queue.poll();
            int tmp = queue.poll();
            queue.add(tmp);
        }

        System.out.print(queue.poll());
    }

}
