import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++)
        {
                arr[i][0] = s.nextInt();
                arr[i][1] = s.nextInt();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            else {
                return o1[0] - o2[0];
            }
        });

        for(int i = 0; i < n; i++)
        {
                System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
