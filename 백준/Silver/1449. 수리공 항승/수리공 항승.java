import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int L = s.nextInt();
        int[] arr = new int[N];
        int count = 1;

        for(int i = 0; i < N; i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);

        double left = arr[0] - 0.5;
        for(int i = 0; i < N; i++) {
            if(left + L < arr[i]){
                count++;
                left = arr[i] - 0.5;
            }
        }

        System.out.println(count);
    }

}