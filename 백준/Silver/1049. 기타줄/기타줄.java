import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();
        int Min = Integer.MAX_VALUE;

        int[] unit = new int[M];
        int[] pack = new int[M];
        for(int i = 0; i < M; i++) {
            pack[i] = s.nextInt();
            unit[i] = s.nextInt();
        }

        Arrays.sort(unit);
        Arrays.sort(pack);

        Min = Math.min(((N / 6) + 1) * pack[0], N * unit[0]);
        Min = Math.min(Min, ((N / 6)) * pack[0] + (N % 6) * unit[0]);

        System.out.println(Min);
    }
}