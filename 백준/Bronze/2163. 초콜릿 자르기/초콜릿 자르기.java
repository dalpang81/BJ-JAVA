import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();

        System.out.println((N-1) + ((M - 1) * N));

    }

}