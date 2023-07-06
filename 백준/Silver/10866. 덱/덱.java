import java.util.*;


public class Main {
    static int front = 10000;
    static int back = 10000;
    static int size = 0;
    static int[] deque = new int[20001];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = s.nextInt();

        for(int i = 0; i < N; i++)
        {
            String str = s.next();

            switch(str) {
                case "push_front":
                    push_front(s.nextInt());
                    break;

                case "push_back":
                    push_back(s.nextInt());
                    break;

                case "pop_front":
                    sb.append(pop_front()).append('\n');
                    break;

                case "pop_back":
                    sb.append(pop_back()).append('\n');
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

    public static void push_front(int item) {
        deque[front] = item;
        front--;
        size++;
    }

    public static void push_back(int item) {
        back++;
        size++;
        deque[back] = item;
    }

    public static int pop_front() {
        if(size == 0) return -1;
        int ret = deque[front + 1];
        front++;
        size--;
        return ret;
    }

    public static int pop_back() {
        int[] temp = new int[size];
        if(size == 0) return -1;
        int ret = deque[back];
        back--;
        size--;
        return ret;
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
        return deque[front + 1];
    }

    public static int back() {
        if(size == 0) return -1;
        else return deque[back];
    }

}