import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    static int code1 = 0;
    static int code2 = 1;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(br.readLine());
        fib(n);
        fibonacci(n);

        System.out.print(code1 + " " + code2);
    }

    public static int fib(int n) {
        if(n == 1 || n == 2)
        {
            code1++;
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static int fibonacci(int n) {
        int[] arr = new int[n];
        arr[1] = 1;
        arr[2] = 1;

        for(int i = 3; i < n; i++)
        {
            code2++;
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }



}