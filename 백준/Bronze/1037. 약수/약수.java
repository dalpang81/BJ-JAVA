import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] arr = new int[N];


        for (int i = 0; i < N; i++)
            arr[i] = s.nextInt();

        int Max = arr[0];
        int Min = arr[0];

        for (int i = 1; i < N; i++) {
            if (Max < arr[i])
                Max = arr[i];
            if (Min > arr[i])
                Min = arr[i];
        }

        System.out.println(Max * Min);


    }

}