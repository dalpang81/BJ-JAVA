import java.util.*;


public class Main {
    static int front = 10000;
    static int back = 10000;
    static int size = 0;
    static int[] deque = new int[20001];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);

        int M = s.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++)
        {
            int key = s.nextInt();
            sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
        }
        System.out.println(sb);
    }

    private static int lowerBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        while(lo < hi) {
            int mid = (lo + hi) / 2;

            if(key <= arr[mid])
                hi = mid;
            else
                lo = mid + 1;
        }

        return lo;
    }

    private static int upperBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        while(lo < hi) {
            int mid = (lo + hi) / 2;

            if(key < arr[mid])
                hi = mid;
            else lo = mid + 1;
        }

        return lo;
    }
}
