import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int[] money = new int[N];
        int count = 0;

        for(int i = 0; i < N; i++)
            money[i] = s.nextInt();

        for(int i = N - 1; i >= 0; i--) {
            if(money[i] <= K) {
                count += (K / money[i]);
                K = K % money[i];
            }
        }
        System.out.println(count);
    }
}