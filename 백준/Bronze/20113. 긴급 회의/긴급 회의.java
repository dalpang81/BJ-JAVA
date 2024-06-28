import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N + 1];
        for(int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[a]++;
        }


        int max = 0;
        int temp = 0;
        int middle = 0;
        for(int i = 1; i <= N; i++) {
            if(max < arr[i]) {
                max = arr[i];
                temp = i;
                middle = 0;
            }
            else if(max == arr[i])
                middle = 1;
        }


        if(middle == 1)
            System.out.println("skipped");
        else
            System.out.println(temp);



    }

}