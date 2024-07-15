import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
        }
    }

    public static void fibonacci(int n) {
        int first = 1;
        int second = 0;
        int tmp = 1;

        for(int i = 0; i < n; i++) {
            tmp = first;
            first = second;
            second = tmp + second;
        }

        System.out.println(first + " " + second);
    }

}