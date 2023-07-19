import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;

        while(true) {
            int L = s.nextInt();
            int P = s.nextInt();
            int V = s.nextInt();
            if(L == 0 && P == 0 && V == 0)
                break;
            int total = L * (V / P) + Math.min(L, V % P);
            System.out.println("Case " + i + ": " + total);
            i++;
        }
    }
}