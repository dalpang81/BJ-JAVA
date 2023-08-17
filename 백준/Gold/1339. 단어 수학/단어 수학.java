import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] sarr = new String[N];
        int[] alpha = new int[26];

        for(int i = 0; i < N; i++) {
            sarr[i] = br.readLine();
        }

        for(int i = 0; i < N; i++) {
            int temp = (int)Math.pow(10, sarr[i].length() - 1);
            for(int j = 0; j < sarr[i].length(); j++) {
                alpha[(int)sarr[i].charAt(j)-65] += temp;
                temp /= 10;
            }
        }

        Arrays.sort(alpha);
        int index = 9;
        int sum = 0;
        for(int i = alpha.length - 1; i >= 0; i--) {
            if(alpha[i] == 0)
                break;
            sum += alpha[i] * index;
            index--;
        }
        System.out.println(sum);

    }
}