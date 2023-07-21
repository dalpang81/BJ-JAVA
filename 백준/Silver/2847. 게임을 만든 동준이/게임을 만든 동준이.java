import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] arr = new int[N];
        int count = 0;

        for(int i = 0; i < N; i++)
            arr[i] = s.nextInt();

        for(int i = N - 1; i > 0; i--)
        {
            while(arr[i] <= arr[i - 1]) {
                count++;
                arr[i - 1] = arr[i - 1] - 1;
            }
        }
        System.out.println(count);
    }
}