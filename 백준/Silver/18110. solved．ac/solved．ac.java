import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        int num = (int)Math.round(n * 0.15);

        double sum = 0;

        for(int i = num; i < n - num; i++)
            sum += arr[i];
        System.out.println((int)Math.round(sum/(n-num*2)));






    }
}
