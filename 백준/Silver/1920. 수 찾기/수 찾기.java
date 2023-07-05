import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] arr1 = new int[N];

        for(int i = 0; i < N; i++)
            arr1[i] = s.nextInt();

        int M = s.nextInt();
        int[] arr2 = new int[M];

        for(int i = 0; i < M; i++)
            arr2[i] = s.nextInt();


        Arrays.sort(arr1);

        for(int i = 0; i < M; i++)
        {
            int num = binarySearch(arr1, arr2[i]);

            if(num >= 0)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

    public static int binarySearch(int[] arr, int key)
    {
        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi) {
            int mid = (lo + hi) / 2;

            if(key > arr[mid])
                lo = mid + 1;

            else if(key < arr[mid])
                hi = mid - 1;

            else return mid;
        }

        return -1;
    }
}
