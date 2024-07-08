import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(br.readLine());
        System.out.println(fib(N));

    }

    public static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

}