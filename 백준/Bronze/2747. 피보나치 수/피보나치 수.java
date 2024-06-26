import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int n1 = 0;
        int n2 = 1;

        if(N == 1)
            sum = 1;
        else {
            for(int i = 0; i < N - 1; i++) {
                sum = n1 + n2;
                n1 = n2;
                n2 = sum;
            }
        }
        System.out.println(sum);

    }

}