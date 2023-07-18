import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min;


        int N = s.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);

        int sum = 0;
        int total = 0;
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < i + 1; j++)
            {
                sum += arr[j];
            }
        }

        System.out.print(sum);
    }
}