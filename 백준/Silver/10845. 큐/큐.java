import java.util.*;


public class Main {
    public static int[] queue;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = s.nextInt();
        queue = new int[N];

        for(int i = 0; i < N; i++)
        {
            String str = s.next();

            switch(str) {
                case "push":
                    push(s.nextInt());
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "front":
                    sb.append(front()).append('\n');
                    break;

                case "back":
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int item) {
        queue[size] = item;
        size++;
    }

    public static int pop() {
        int[] temp = new int[size];
        if(size == 0) return -1;
        else {
            int res = queue[0];

            for(int i = 0; i < size; i++)
            {
                temp[i] = queue[i + 1];
            }

            for(int i = 0; i < size; i++)
            {
                queue[i] = temp[i];
            }

            size--;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0) return 1;
        else return 0;
    }

    public static int front() {
        if(size == 0) return -1;
        else return queue[0];
    }

    public static int back() {
        if(size == 0) return -1;
        else return queue[size - 1];
    }

}
