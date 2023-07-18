import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int count = 99;

        if(N < 100) {
            System.out.println(N);
            return;
        }

        else {
            for(int i = 100; i <= N; i++) {
                int A = i / 100;
                int B = (i / 10) % 10;
                int C = i % 10;

                if((B - A) == (C - B))
                    count++;
            }
        }

        System.out.print(count);

    }
}