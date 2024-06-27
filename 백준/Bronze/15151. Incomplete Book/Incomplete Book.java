import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int maxBooks = maxBooks(k, d);
        System.out.println(maxBooks);
    }

    public static int maxBooks(int k, int d) {
        double maxPossibleN = Math.log((double)d / k + 1) / Math.log(2);
        int n = (int) Math.floor(maxPossibleN);

        return n;
    }
}