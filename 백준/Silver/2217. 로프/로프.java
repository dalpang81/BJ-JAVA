import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);

        int max = 0;

        for(int i = 0; i < N; i++) {
            max = Math.max(max, arr[i] * (N - i));
        }

        System.out.println(max);

    }
}